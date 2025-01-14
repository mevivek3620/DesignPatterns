package DesignPattern.Question1.factory;

import DesignPattern.Question1.products.Database;
import DesignPattern.Question1.products.PostreSQL;
import DesignPattern.Question1.products.SQL;

public class DatabaseFactory {
    public static Database getDatabase(String db) {
        if (db.equals("SQL")) {
            return new SQL();
        } else if (db.equals("PostgreSQL")) {
            return new PostreSQL();
        }
        return null;
    }
}
