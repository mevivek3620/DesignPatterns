package DesignPattern.TaskScheduler;

import java.util.ArrayList;
import java.util.concurrent.*;

public class TaskScheduler {
    private ExecutorService executorService;
//    private BlockingQueue<Task> blockingQueue;
    private boolean isShutDown = false;

    public TaskScheduler(int totalThreads) {
//        this.blockingQueue = new LinkedBlockingQueue<>();
        this.executorService = Executors.newFixedThreadPool(totalThreads);
    }

    public void submit(Task task) {
        if (isShutDown) {
            throw new IllegalStateException("TaskScheduler is shut down. Cannot accept new tasks.");
        }

//        Main Thread Role:
//             --> The main thread places the task in the task queue of the thread pool.
//             --> As soon as the task is enqueued, the executorService.submit() call returns immediately to the main thread.
//
//        Worker Thread Role:
//             --> A worker thread from the thread pool picks up the task from the queue and executes it asynchronously.
//                 The main thread is no longer involved.

        executorService.submit(() -> {
            try {
                task.run(); // Execute the task
            } catch (Exception e) {
                System.err.println("Task execution failed: " + e.getMessage());
            }
        });
        System.out.println("Task ran successfully by thread-id: " + Thread.currentThread().getName());
    }

    public void shutDown() {
        isShutDown = true;
        executorService.shutdown();
    }

    public void awaitTermination() {
        // await for remaining tasks to be processed
        try {
            if (!executorService.awaitTermination(10, TimeUnit.SECONDS)) {
                System.err.println("Tasks did not finish in the timeout period.");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Await termination interrupted.");
        }
    }

}
