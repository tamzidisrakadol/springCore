package com.example.springcore.app3;

public class Apple {
    private int xA;
    private Banana banana;

    public Apple() {

    }

    public int getxA() {
        return xA;
    }

    public void setxA(int xA) {
        this.xA = xA;
    }

    public Banana getBanana() {
        return banana;
    }

    public void setBanana(Banana banana) {
        this.banana = banana;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "xA=" + xA +
                ", banana=" + banana +
                '}';
    }
}
