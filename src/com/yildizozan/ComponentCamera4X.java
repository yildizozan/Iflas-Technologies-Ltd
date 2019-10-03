package com.yildizozan;

public class ComponentCamera4X extends ComponentCamera {
    public ComponentCamera4X(int front, int rear) {
        super(front, rear);
    }

    @Override
    public String toString() {
        return "optic zoom 4x, " + front + " MP front, " + rear + "MP rear.";
    }
}
