package com.qualcomm.ftcrobotcontroller.PV_FIRSTResQ_2015_2016;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by polarvortexrobotics on 10/13/15.
 */
public class AutoRoute1 {
    DcMotor motorRight;
    DcMotor motorLeft;


    public void init(HardwareMap hardwareMap) {

        /*motorRight = hardwareMap.dcMotor.get("Motor.2"); //call motors
        motorLeft = hardwareMap.dcMotor.get("Motor.1");

        motorLeft.setDirection(DcMotor.Direction.REVERSE);
        motorRight.setDirection(DcMotor.Direction.FORWARD);

        motorLeft.setPower(100);
        motorRight.setPower(100);  //one hunna/*/


        //1) Use distance sensor to see how the far the beacon and if a robot is blocking it.
        //2) Gyro Sensor to make sure the robot keeps going straight to the beacon so it's as accurate as possible
        //3) Color sensor so the robot will be able to tell which buttons so we get points


    }
}
