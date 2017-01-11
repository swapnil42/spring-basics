package com.allstate.models;

public class Accumulator {
    private int x1;
    private int x2;

    public Accumulator(int x1, int x2, int sum) {
        this.x1 = x1;
        this.x2 = x2;
        this.sum = sum;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    private int sum;


}
