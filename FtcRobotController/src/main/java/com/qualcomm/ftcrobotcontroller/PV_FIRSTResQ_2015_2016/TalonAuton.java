package com.qualcomm.ftcrobotcontroller.PV_FIRSTResQ_2015_2016;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by polarvortexrobotics on 11/22/15.
 */
public class TalonAuton extends OpMode {

    DcMotor motorLeft;
    DcMotor motorRight;
    DcMotor motorFront;
    DcMotor motorBack;

    @Override
    public void init() {
        motorRight = hardwareMap.dcMotor.get("motor_right");
        motorLeft = hardwareMap.dcMotor.get("motor_left");
        motorFront = hardwareMap.dcMotor.get("motor_front");
        motorBack = hardwareMap.dcMotor.get("motor_back");

        motorLeft.setDirection(DcMotor.Direction.REVERSE);
        motorRight.setDirection(DcMotor.Direction.FORWARD);


    }

    public void sleep (int i) {

    }

    @Override
    public void loop() {
        motorFront.setPower(0.75);
        motorBack.setPower(0.75);
        sleep(1000);
        //1 second

        motorFront.setPower(1);
        motorBack.setPower(-1);
        sleep(1000);

    }
}
