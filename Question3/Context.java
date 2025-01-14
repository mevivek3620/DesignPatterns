package DesignPattern.Question3;

import DesignPattern.Question3.strategy.FileCompressionStrategy;

public class Context {
    private FileCompressionStrategy fileCompressionStrategy;
    public Context(FileCompressionStrategy fileCompressionStrategy) {
        this.fileCompressionStrategy = fileCompressionStrategy;
    }

    public void setFileCompressionStrategy(FileCompressionStrategy fileCompressionStrategy) {
        this.fileCompressionStrategy = fileCompressionStrategy;
    }

    public void execute() {
        this.fileCompressionStrategy.compress();
    }
}
