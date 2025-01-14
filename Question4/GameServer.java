package DesignPattern.Question4;

public class GameServer {
    private static GameServer instance;

    private GameServer() {
        System.out.println("Singleton class instance created");
    }

    public static GameServer getInstance() {
        if (instance == null) {
            instance = new GameServer();
        }
        return instance;
    }

    public void startServer() {
        System.out.println("Game server started");
    }

    public void stopServer() {
        System.out.println("Game server stopped");
    }
}
