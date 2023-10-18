package com.zouftou.esp;


public class SpeedPrinter extends Thread {

    private final SpeedController speedController;

    public SpeedPrinter(SpeedController speedController) {
        super();
        this.speedController = speedController;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(speedController.toString());
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
