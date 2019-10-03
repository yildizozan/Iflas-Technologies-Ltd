package com.yildizozan;

public class ComponentStorageMAX32GB extends ComponentStorage {
    public ComponentStorageMAX32GB(boolean microSD, int capacity) {
        super(microSD, capacity);
    }


    @Override
    public String toString() {
        return (microSD ? "microSD support" : "microSD not support") + ", capacity support max 32; this " + capacity + ".";
    }
}
