package DesignPattern.WorkerThreadPool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class Worker extends Thread{
    private boolean isRunning = true;
    private BlockingQueue<Runnable> blockingQueue;
    public Worker(BlockingQueue blockingQueue) {
//        System.out.println("Worker constructor for thread: " + Thread.currentThread().getName());
        this.blockingQueue = blockingQueue;
    }
    @Override
    public void run() {
        while (isRunning || !blockingQueue.isEmpty()) {
            try {
//                System.out.println("Retrieving blocking queue task,  Current thread: " + Thread.currentThread().getName());
                Runnable task = blockingQueue.take();
                task.run();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
        System.out.println(Thread.currentThread().getName() + " terminated.");
    }

    public void stopWorker() {
        isRunning = false;
        this.interrupt();
    }
}
