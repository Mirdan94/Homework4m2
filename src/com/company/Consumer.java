package com.company;

public class Consumer extends Thread {

    Storage storage;

    public Consumer (Storage storage) {
        this.storage = storage;
    }

    public void run () {
        storage.getStorage();
    }


}

