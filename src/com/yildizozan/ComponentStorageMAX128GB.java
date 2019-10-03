package com.yildizozan;

public class ComponentStorageMAX128GB extends  ComponentStorage {
    public ComponentStorageMAX128GB(boolean microSD, int capacity) {
        super(microSD, capacity);
    }

    @Override
    public String toString() {
        return (microSD ? "microSD support" : "microSD not support") + ", capacity support max 128; this " + capacity + ".";
    }
}
