package com.example.springcore.app3;

public class Banana {
    private int x;
    private int y;

    public Banana() {

    }

    @Override
    public String toString() {
        return "Banana{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
