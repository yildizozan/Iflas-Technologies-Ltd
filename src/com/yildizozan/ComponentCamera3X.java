package com.yildizozan;

public class ComponentCamera3X extends ComponentCamera {
    public ComponentCamera3X(int front, int rear) {
        super(front, rear);
    }

    @Override
    public String toString() {
        return "optic zoom 3x, " + front + " MP front, " + rear + "MP rear.";
    }
}
