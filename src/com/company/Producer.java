package com.company;

public class Producer extends Thread {
    Storage storage;

    public Producer(Storage storage) {
        this.storage = storage;
    }

    public void run () {
        storage.putStorage();
    }


}
