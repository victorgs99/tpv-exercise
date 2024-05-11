package oop.library.ingenico.services;

import java.util.Properties;

public final class IngenicoStorageSystem {
    private static IngenicoStorageSystem instance;
    private Properties properties = new Properties();

    private IngenicoStorageSystem(){}

    public static IngenicoStorageSystem getInstance(){
        if (instance == null)
            instance = new IngenicoStorageSystem();

        return instance;
    }

    public void save(String key, String value) {
        properties.setProperty(key, value);
    }

    public String get(String key) {
        return properties.getProperty(key);
    }

}
