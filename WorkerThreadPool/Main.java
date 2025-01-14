package DesignPattern.WorkerThreadPool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        Worker[] workers = new Worker[5];
        BlockingQueue<Runnable> blockingQueue = new LinkedBlockingQueue<>();
        int totalTasks = 10;

        for (int i = 0; i < 5; i++) {
            workers[i] = new Worker(blockingQueue);
            workers[i].start();
        }

        for (int i = 0; i < totalTasks; i++) {
            try {
                blockingQueue.put(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            System.out.println("Runnable task for Current thread " + Thread.currentThread().getName());
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                });
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Adding task failed");
            }
        }

        System.out.println("All tasks submitted. Shutting down worker threads...");
        for (Worker worker : workers) {
            worker.stopWorker(); // Gracefully stop each worker
        }

        for (int i = 0; i < 5; i++) {
            try {
                workers[i].join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Application is exiting...");
    }
}
