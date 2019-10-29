package com.company;

import java.util.Timer;

public class Messenger implements Runnable {
    private int time;
    private String msg;

    Messenger(int time, String msg) {
        this.time = time * 1000;
        this.msg = msg;
    }

    @Override
    public void run() {
        Timer timer = new Timer();
        timer.schedule(new Calling(msg), 0, time);
    }
}