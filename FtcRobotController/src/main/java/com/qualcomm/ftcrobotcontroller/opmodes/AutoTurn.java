package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

/**
 * Created by polarvortexrobotics on 10/11/15.
 */
public class AutoTurn {
    DcMotor motorRight;
    DcMotor motorLeft;


    public void init(HardwareMap hardwareMap) {

        motorRight = hardwareMap.dcMotor.get("Motor.2"); //call motors
        motorLeft = hardwareMap.dcMotor.get("Motor.1");

        motorLeft.setDirection(DcMotor.Direction.REVERSE);
        motorRight.setDirection(DcMotor.Direction.FORWARD);

        motorLeft.setPower(100);
        motorRight.setPower(100);  //one hunna//
    }
}