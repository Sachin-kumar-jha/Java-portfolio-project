package prg.sachin.dao;

import java.io.*;
import java.util.*;

public class ConfigLoader {
    private static final Properties props = new Properties();
    private static boolean isLoaded = false;

    public static void load(String pathToConfig) {
        if (isLoaded) return; // avoid reloading multiple times
        try (InputStream input = new FileInputStream(pathToConfig)) {
            props.load(input);
            isLoaded = true;
        } catch (IOException e) {
            System.err.println("Failed to load db-config: " + pathToConfig);
            e.printStackTrace();
        }
    }

    public static String get(String key) {
        return props.getProperty(key);
    }
}
