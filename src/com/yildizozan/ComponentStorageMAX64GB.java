package com.yildizozan;

public class ComponentStorageMAX64GB extends ComponentStorage {
    public ComponentStorageMAX64GB(boolean microSD, int capacity) {
        super(microSD, capacity);
    }

    @Override
    public String toString() {
        return (microSD ? "microSD support" : "microSD not support") + ", capacity support max 64; this " + capacity + ".";
    }
}
