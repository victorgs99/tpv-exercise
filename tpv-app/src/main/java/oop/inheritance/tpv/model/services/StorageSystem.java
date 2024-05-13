package oop.inheritance.tpv.model.services;

public interface StorageSystem {
    void save(String key, String value);

    String get(String key);
}
