package DesignPattern.Logger;

import DesignPattern.Logger.Logger.ConsoleLogger;
import DesignPattern.Logger.Logger.FileLogger;

public class Main {
    public static void main(String[] args) {
//        LogManager logManager = new LogManager();
//        logManager.setLogger(new ConsoleLogger());
//        logManager.log("This is a test log for console");
//
//        logManager.setLogger(new FileLogger());
//        logManager.log("This is a file logger");

        AsyncLogger logger = new AsyncLogger(new ConsoleLogger());
        logger.setLogger(new ConsoleLogger());
        logger.log("Async logger message");

        logger.shutdown();
        System.out.println("Main thread finished.");
    }
}
