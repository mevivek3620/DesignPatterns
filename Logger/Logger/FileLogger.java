package DesignPattern.Logger.Logger;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("File logger: " + message);
        try (FileWriter writer = new FileWriter("log.txt", true)) {
            writer.write("[File] " + message + "\n");
        } catch (IOException e) {
            System.err.println("Failed to write to file: " + e.getMessage());
        }
    }
 }
