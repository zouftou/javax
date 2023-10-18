package com.zouftou.esp;

import java.util.Random;

public class SteeringThread extends Thread {

    private final Steering steering;

    public SteeringThread(Steering steering) {
        super();
        this.steering = steering;
    }

    @Override
    public void run() {
        Random r = new Random();
        while (true) {
            steering.setAngule(r.nextInt(360) + 1);
            steering.setDirection('L');
            steering.setSpeed(r.nextInt(360) + 1);
            steering.testProbleme();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
