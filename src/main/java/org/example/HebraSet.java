package org.example;

public class HebraSet implements Runnable {

    private VariableCompartida variableCompartida;

    public HebraSet(VariableCompartida variableCompartida) {
        this.variableCompartida = variableCompartida;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            variableCompartida.setV(i);
            System.out.println("Set " + variableCompartida.getV());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}