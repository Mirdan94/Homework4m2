package com.company;

public class Main {

    public static void main(String[] args) {
        Storage storage = new Storage();
        Producer producer = new Producer(storage);
        Consumer consumer = new Consumer(storage);

        Thread p = new Thread(producer);
        p.start();
        Thread c = new Thread(consumer);
        c.start();
    }
}
