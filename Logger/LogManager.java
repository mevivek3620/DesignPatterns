package DesignPattern.Logger;

import DesignPattern.Logger.Logger.Logger;

public class LogManager {
    private Logger logger;
    public void setLogger(Logger logger) {
        this.logger = logger;
    }
    public void log(String message) {
        if (logger == null) {
            throw new IllegalStateException("No logger has been set.");
        }
        logger.log(message);
    }
}
