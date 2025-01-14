package DesignPattern.Question7.observer;

public class VideoObserver implements Observer{
    private String name;

    public VideoObserver(String name) {
        this.name = name;
        System.out.println("Video observer created: " + name);
    }
    @Override
    public void update() {
        System.out.println("Video observer updated : " + name);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
