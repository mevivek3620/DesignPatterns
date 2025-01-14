package DesignPattern.Logger;

import DesignPattern.Logger.Logger.Logger;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class AsyncLogger implements Logger {
    private Logger logger;
    private boolean running = true;
    private BlockingQueue<String> blockingQueue = new LinkedBlockingQueue<>();

    public AsyncLogger(Logger logger) {
        this.logger = logger;

        // [MainThread] Creates a workerThread that enters the while loop and waits for messages in the BlockingQueue.
        // Note: workerThread would enter the while loop only after it starts running as: workerThread.start();
        Thread workerThread = new Thread(() -> {
            // [workerThread] it waits for the message added to the queue
            while (running || !blockingQueue.isEmpty()) {
                try {
                    String message = blockingQueue.take();
                    System.out.println("Message sent to corresponding logger, message: " + message );
                    logger.log(message);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.err.println("Interrupted thread: " + Thread.currentThread().getName() + " message: " + e.getMessage());
                    break;
                }
            }
        });

        // [MainThread]Here, main thread sets the workerThread priority as low and workerThread starts running
        workerThread.setDaemon(true);
        workerThread.start();
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
    @Override
    public void log(String message) {
        try {
            blockingQueue.put(message);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Failed to add messafe, thread: " + Thread.currentThread().getName() + " err message: " + e.getMessage());
        }
        System.out.println("Message added to blockingQueue, from thread: " + Thread.currentThread().getName());
    }

    public void shutdown() {
        System.out.println("Setting the running flag to false");
        running = false;
        System.out.println("Set the running flag to false");
    }
}
