package ru.otus.java.basic.lesson24.generics;

public class BoxDoubleGeneric<K, V> {
    private K primaryKey;
    private K secondKey;
    private V value;

    public K getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(K primaryKey) {
        this.primaryKey = primaryKey;
    }

    public K getSecondKey() {
        return secondKey;
    }

    public void setSecondKey(K secondKey) {
        this.secondKey = secondKey;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public BoxDoubleGeneric(K primaryKey, K secondKey, V value) {
        this.primaryKey = primaryKey;
        this.secondKey = secondKey;
        this.value = value;
    }
}