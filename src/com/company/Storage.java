package com.company;

public class Storage extends Thread {


    private int product = 0;


    public int getProduct() {
        return product;
    }

    public void setProduct(int product) {
        this.product = product;
    }

    public void putStorage() {
        if (product > 0) {
            try {
                sleep(1000);
            } catch (InterruptedException z) {
                z.printStackTrace();
            }
        }
        product = product + 5;
        System.out.println("Добавили 5 продуктов");
        System.out.println("В складе " + product + " продуктов");
    }

    public void getStorage() {
        if (product < 0) {
            try {
                sleep(1000);
            } catch (InterruptedException z) {
                z.printStackTrace();
            }
        }
        product = product - 5;
        System.out.println("Взяли 5 продуктов");
        System.out.println("В складе " + product + " продуктов");
    }
}
