package com.yildizozan;

public abstract class ComponentDisplay {
    protected ComponentDisplaySize size = ComponentDisplaySize.OEM;

    public ComponentDisplay(ComponentDisplaySize size) {
        this.size = size;
    }
}
