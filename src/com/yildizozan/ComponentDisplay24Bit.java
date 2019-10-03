package com.yildizozan;

public class ComponentDisplay24Bit extends ComponentDisplay {
    public ComponentDisplay24Bit(ComponentDisplaySize size) {
        super(size);
    }

    @Override
    public String toString() {
        return this.size + " and 24-bit";
    }
}
