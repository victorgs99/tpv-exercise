package oop.inheritance.verifone.verifone690.services;

import oop.inheritance.tpv.model.services.StorageSystem;

import java.util.Properties;

public class VerifoneVx690StorageSystem implements StorageSystem {
    private static VerifoneVx690StorageSystem instance;

    private VerifoneVx690StorageSystem(){}

    public static VerifoneVx690StorageSystem getInstance(){
        if (instance == null)
            instance = new VerifoneVx690StorageSystem();

        return instance;
    }

    private final Properties properties = new Properties();

    public void save(String key, String value) {
        properties.setProperty(key, value);
    }

    public String get(String key) {
        return properties.getProperty(key);
    }

}
