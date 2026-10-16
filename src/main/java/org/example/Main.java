package org.example;

public class Main {
    static void main() throws InterruptedException {
        VariableCompartida vc = new VariableCompartida();
        HebraSet h1 = new HebraSet(vc);
        HebraGet h2 = new HebraGet(vc);

        Thread t1 = new Thread(h1);
        Thread t2 = new Thread(h2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

    }
}