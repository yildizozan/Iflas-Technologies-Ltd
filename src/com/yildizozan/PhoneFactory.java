package com.yildizozan;

public abstract class PhoneFactory {

    protected PhoneType model;

    public Phone orderPhone (PhoneType type) {

        this.model = type;

        Phone phone = createPhone(type);

        return phone;
    }

    protected abstract Phone createPhone (PhoneType type);

}
