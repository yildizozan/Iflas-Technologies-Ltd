package com.yildizozan;

public class ComponentDisplay32Bit extends ComponentDisplay {
    public ComponentDisplay32Bit(ComponentDisplaySize size) {
        super(size);
    }

    @Override
    public String toString() {
        return this.size + " and 32-bit";
    }
}
