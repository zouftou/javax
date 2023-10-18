package com.zouftou.esp;

import java.util.Random;

public class WheelThread extends Thread {

    private final Wheel wheel;

    public WheelThread(Wheel wheel) {
        super();
        this.wheel = wheel;
    }

    @Override
    public void run() {
        Random r = new Random();
        while (true) {
            wheel.setSpeed(r.nextInt(360) + 1);
            wheel.setOielPression(r.nextInt(100) + 1);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
