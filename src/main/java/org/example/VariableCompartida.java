package org.example;

public class VariableCompartida {
    private int v = 0;

    public VariableCompartida() {
        this.v = v;
    }

    public synchronized int getV() {
        return v;
    }

    public synchronized void setV(int v) {
        this.v = v;
    }
}