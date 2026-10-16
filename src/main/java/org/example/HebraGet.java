package org.example;

public class HebraGet implements Runnable {

    private VariableCompartida variableCompartida;

    public HebraGet(VariableCompartida variableCompartida) {
        this.variableCompartida = variableCompartida;
    }

    public VariableCompartida getVariableCompartida() {
        return variableCompartida;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Get " + variableCompartida.getV());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}