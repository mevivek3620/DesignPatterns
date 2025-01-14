package DesignPattern.Question3.strategy;

public class ZIPStrategy implements FileCompressionStrategy{
    @Override
    public void compress() {
        System.out.println("ZIP startegy is compressing");
    }
}
