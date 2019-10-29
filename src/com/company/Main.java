package com.company;

public class Main {
    public static void main (String [] args) throws InterruptedException{
        Runnable t1 = new Messenger(1, "It's thread 1\n");
        Runnable t2 = new Messenger(5, "It's thread 2\n");
        Runnable t3 = new Messenger(7, "It's thread 3\n");
        t1.run();
        t2.run();
        t3.run();
    }
}