package DesignPattern.TaskScheduler;

//Exercise 2: Task Scheduler Simulation
//Scenario:
//        You need to design a Task Scheduler system that manages and executes tasks (jobs) in the background.
//
//        1. The scheduler should use a worker thread pool to process tasks concurrently.
//        2. Tasks should be queued when submitted and picked up by available worker threads.
//        3. The scheduler must support a graceful shutdown:
//        4. When a shutdown is initiated, no new tasks should be accepted.
//        5. Existing tasks in the queue should be completed.
//        6. All worker threads should terminate cleanly after processing remaining tasks.


import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalThreads = sc.nextInt();
        int totalTasks = sc.nextInt();

        TaskScheduler taskScheduler = new TaskScheduler(totalThreads);
        for (int i = 0; i < totalTasks; i++) {
            int taskId = i;
            System.out.println("Task: " + i + " being submitted by thread: " + Thread.currentThread().getName());
            taskScheduler.submit(new Task() {
                @Override
                public void run() {
                    try {
                        System.out.println("Task: " + taskId + ", thread-id: " + Thread.currentThread().getName());
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            });
        }

        taskScheduler.shutDown();
        taskScheduler.awaitTermination();
        System.out.println("All tasks completed, thread-id: " + Thread.currentThread().getName());

    }
}
