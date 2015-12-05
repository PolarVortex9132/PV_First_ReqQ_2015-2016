package com.qualcomm.ftcrobotcontroller.PV_FIRSTResQ_2015_2016;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by polarvortexrobotics on 10/15/15.
 */
public class AutoRoute4 {
    DcMotor motorRight;
    DcMotor motorLeft;


    public void init(HardwareMap hardwareMap) {

        /*motorRight = hardwareMap.dcMotor.get("Motor.2"); //call motors
        motorLeft = hardwareMap.dcMotor.get("Motor.1");

        motorLeft.setDirection(DcMotor.Direction.REVERSE);
        motorRight.setDirection(DcMotor.Direction.FORWARD);

        motorLeft.setPower(100);
        motorRight.setPower(100);  //one hunna/*/


        //1) Uss encoders to try to go towards the beacon
        //2) Use gyro to keep us straight
        //3) Last we use the Ultrasonic to see if there are any robots in our way
        // if there are we turn and go straight for the floor goals instead


    }
}
