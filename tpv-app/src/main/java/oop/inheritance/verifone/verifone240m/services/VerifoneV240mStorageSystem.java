package oop.inheritance.verifone.verifone240m.services;

import oop.inheritance.tpv.model.services.StorageSystem;

import java.util.Properties;

public class VerifoneV240mStorageSystem implements StorageSystem {
    private static VerifoneV240mStorageSystem instance;

    private VerifoneV240mStorageSystem(){}

    public static VerifoneV240mStorageSystem getInstance(){
        if (instance == null)
            instance = new VerifoneV240mStorageSystem();

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
