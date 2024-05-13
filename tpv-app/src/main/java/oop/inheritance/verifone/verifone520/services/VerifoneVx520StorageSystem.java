package oop.inheritance.verifone.verifone520.services;

import oop.inheritance.tpv.model.services.StorageSystem;

import java.util.Properties;

public class VerifoneVx520StorageSystem implements StorageSystem {
    private static VerifoneVx520StorageSystem instance;

    private VerifoneVx520StorageSystem(){}

    public static VerifoneVx520StorageSystem getInstance(){
        if (instance == null)
            instance = new VerifoneVx520StorageSystem();

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
