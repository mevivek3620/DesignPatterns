package DesignPattern.Question3;

import DesignPattern.Question3.strategy.RARStrategy;
import DesignPattern.Question3.strategy.ZIPStrategy;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new ZIPStrategy());
        context.execute();

        context.setFileCompressionStrategy(new RARStrategy());
        context.execute();
    }
}
