package com.company;

import java.util.TimerTask;

public class Calling extends TimerTask {
    String msg;

    Calling(String msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        System.out.print(msg);
    }
}
