package com.company;

public class Main {
    public static void main (String [] args) throws InterruptedException {
        Chronometer chronometer = new Chronometer();
        Runnable t2 = new Messenger(5, "It's thread 2\n");
        Runnable t3 = new Messenger(7, "It's thread 3\n");
        t2.run();
        t3.run();
        synchronized (chronometer) {

            while (Chronometer.time != -1) {
                Chronometer.time += 1;
                System.out.println(Chronometer.time);
                chronometer.notifyAll();
                Thread.sleep(1000);
            }
        }
    }
}