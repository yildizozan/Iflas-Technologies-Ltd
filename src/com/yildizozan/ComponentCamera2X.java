package com.yildizozan;

public class ComponentCamera2X extends ComponentCamera {
    public ComponentCamera2X(int front, int rear) {
        super(front, rear);
    }

    @Override
    public String toString() {
        return "optic zoom 2x, " + front + " MP front, " + rear + "MP rear.";
    }
}
