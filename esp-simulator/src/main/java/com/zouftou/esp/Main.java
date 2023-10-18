package com.zouftou.esp;

public class Main {

    public static void main(String[] args) {

        SpeedController speedConroller = new SpeedController();

        Steering steering = new Steering(0, 0, 'O');
        steering.addObserver(speedConroller);

        Wheel frontLeftWheel = new Wheel(0, 0, 0);
        frontLeftWheel.addObserver(speedConroller);

        Wheel frontRightWheel = new Wheel(1, 0, 0);
        frontRightWheel.addObserver(speedConroller);

        Wheel backLeftWheel = new Wheel(2, 0, 0);
        backLeftWheel.addObserver(speedConroller);

        Wheel backRightWheel = new Wheel(3, 0, 0);
        backRightWheel.addObserver(speedConroller);

        //befor change
        System.out.println(speedConroller.toString());

        SteeringThread steeringThread = new SteeringThread(steering);
        steeringThread.start();

        //change of speed
        WheelThread frontLeftWheelThread = new WheelThread(frontLeftWheel);
        frontLeftWheelThread.start();

        WheelThread frontRightWheelThread = new WheelThread(frontRightWheel);
        frontRightWheelThread.start();

        WheelThread backLeftWheelThread = new WheelThread(backLeftWheel);
        backLeftWheelThread.start();

        WheelThread backRightWheelThread = new WheelThread(backRightWheel);
        backRightWheelThread.start();

        SpeedPrinter speedPrinter = new SpeedPrinter(speedConroller);
        speedPrinter.start();

        //after change
        System.out.println(speedConroller.toString());
    }
}