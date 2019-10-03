package com.yildizozan;

public abstract class ComponentStorage {
    protected boolean microSD = true;
    protected int capacity = 32;

    public ComponentStorage(boolean microSD, int capacity) {
        this.microSD = microSD;
        this.capacity = capacity;
    }
}
