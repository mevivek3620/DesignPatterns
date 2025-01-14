package DesignPattern.Question4;

public class Main {
    public static void main(String[] args) {
        GameServer server1 = GameServer.getInstance();
        server1.startServer();

        GameServer server2 = GameServer.getInstance();
        server2.stopServer();

        System.out.println("Are both instances of the same server?" + (server2 == server1 ? " Yes" : "No"));
    }
}
