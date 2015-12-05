package com.qualcomm.ftcrobotcontroller.PV_FIRSTResQ_2015_2016;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by polarvortexrobotics on 10/15/15.
 */
public class AutoRoute3 {
    DcMotor motorRight;
    DcMotor motorLeft;


    public void init(HardwareMap hardwareMap) {

        /*motorRight = hardwareMap.dcMotor.get("Motor.2"); //call motors
        motorLeft = hardwareMap.dcMotor.get("Motor.1");

        motorLeft.setDirection(DcMotor.Direction.REVERSE);
        motorRight.setDirection(DcMotor.Direction.FORWARD);

        motorLeft.setPower(100);
        motorRight.setPower(100);  //one hunna/*/


        //1) Use encoders to go the right distance and stop in the right spot to block and eventually go to the beacon
        //2) Use the gyro sensor so we can stay straight and on the right path even if another robot hits us
        //3) Use distance sensor to make sure we only go the right distance to get to our beacon
        //4) Color sensor to pick the correct the correct button to push so we get the points


    }
}
