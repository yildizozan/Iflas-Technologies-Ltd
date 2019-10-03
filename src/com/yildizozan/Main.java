package com.yildizozan;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        PhoneFactory factory = new PhoneFactoryEU();
        factory.orderPhone(PhoneType.MaximumEffort);
    }
}
