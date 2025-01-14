package DesignPattern.Singleton;

public class Singleton {
    private static Singleton instance;
    private Singleton(){};
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
            System.out.println("Inside Class Thread " + Thread.currentThread().getId() + " is running");
        }
        return instance;
    }

    public static void print() {
        if (instance != null) {
            System.out.println("Singleton class instance already created by Thread " + Thread.currentThread().getId());
        } else {
            System.out.println("Singleton class instance not created");
        }
    }
}
