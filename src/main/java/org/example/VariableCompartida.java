package org.example;

public class VariableCompartida {
    private int v = 0;
    private boolean disponible = false;

    public VariableCompartida() {
        this.v = v;
    }

    public synchronized int getV() {
        while (!disponible) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        disponible = false;
        notifyAll();
        return v;
    }

    public synchronized void setV(int v) {
        while (disponible) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        this.v = v;
        disponible = true;
        notifyAll();
    }
}