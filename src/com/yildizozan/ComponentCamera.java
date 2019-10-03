package com.yildizozan;

public abstract class ComponentCamera {
    protected int front = 12;
    protected int rear = 5;

    public ComponentCamera(int front, int rear) {
        this.front = front;
        this.rear = rear;
    }
}
