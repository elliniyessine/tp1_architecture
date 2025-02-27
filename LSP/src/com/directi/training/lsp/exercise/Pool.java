package com.directi.training.lsp.exercise;

public class Pool {
    public void run() {
        Duck donaldDuck = new Duck();
        ElectronicDuck electricDuck = new ElectronicDuck();
        electricDuck.turnOn(); // Make sure the electronic duck is turned on
        quack(donaldDuck, electricDuck);
        swim(donaldDuck, electricDuck);
    }

    private void quack(DuckInterface... ducks) {
        for (DuckInterface duck : ducks) {
            duck.quack();
        }
    }

    private void swim(DuckInterface... ducks) {
        for (DuckInterface duck : ducks) {
            duck.swim();
        }
    }

    public static void main(String[] args) {
        Pool pool = new Pool();
        pool.run();
    }
}