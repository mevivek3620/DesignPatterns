package DesignPattern.Singleton;

public class Main {
    public static void main(String[] args) {
        // Singleton class instance
//        SingletonDP singletonInstance = SingletonDP.getInstance();
//        singletonInstance.print();
//        SingletonDP.print();

        // Creating 1000 threads to call the getInstance method of Singleton class
        Thread[] threads = new Thread[1000];
        for (int i = 0; i < 1000; i++) {
            threads[i] = new Thread(() -> {
                System.out.println("Thread " + Thread.currentThread().getId() + " is running");
                Singleton instance = Singleton.getInstance();
                instance.print();
            });
            threads[i].start();
        }

        try {
            for (int i = 0; i < 1000; i++) {
                threads[i].join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
