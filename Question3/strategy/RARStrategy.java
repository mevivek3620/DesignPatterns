package DesignPattern.Question3.strategy;

public class RARStrategy implements FileCompressionStrategy {
    @Override
    public void compress() {
        System.out.println("RAR strategy is running");
    }
}
