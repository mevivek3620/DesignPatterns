package DesignPattern.Question1;

import DesignPattern.Question1.factory.DatabaseFactory;
import DesignPattern.Question1.products.Database;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // take inout from user
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Database db = DatabaseFactory.getDatabase(input);
        db.run();
    }
}
