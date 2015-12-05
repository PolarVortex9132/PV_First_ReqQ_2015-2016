package com.qualcomm.ftcrobotcontroller.PV_FIRSTResQ_2015_2016;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by polarvortexrobotics on 10/15/15.
 */
public class AutoRoute2 {
    DcMotor motorRight;
    DcMotor motorLeft;


    public void init(HardwareMap hardwareMap) {

        /*motorRight = hardwareMap.dcMotor.get("Motor.2"); //call motors
        motorLeft = hardwareMap.dcMotor.get("Motor.1");

        motorLeft.setDirection(DcMotor.Direction.REVERSE);
        motorRight.setDirection(DcMotor.Direction.FORWARD);

        motorLeft.setPower(100);
        motorRight.setPower(100);  //one hunna/*/


        //1) Encoders to know how far we have to go before we turn to go to the beacon
        //2) Gyro to make sure we must stay straight so we can accurately get to the beacon
        //3) Color sensors so we can tell which site of the beacon to push so we can push the right button


    }
}
