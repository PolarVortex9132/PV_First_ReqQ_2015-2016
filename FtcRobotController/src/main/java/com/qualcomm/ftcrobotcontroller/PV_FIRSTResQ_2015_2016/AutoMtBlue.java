package com.qualcomm.ftcrobotcontroller.PV_FIRSTResQ_2015_2016;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.ftcrobotcontroller.opmodes.K9TeleOp;

import static java.lang.Thread.sleep;


/**
 * Created by polarvortexrobotics on 11/22/15.
 */
public class AutoMtBlue extends LinearOpMode{

    //this program get to the mountain and climbs it
    // start fourth tile (from borderline)
    // dead cat, go to caterpiller (for going straight), go into goat- slightly (for turns)
    // take out abstract if problem

    DcMotor motorLeft;
    DcMotor motorRight;
    DcMotor motorFront;
    DcMotor motorBack;

    @Override
    public void runOpMode ()throws InterruptedException {

        motorRight = hardwareMap.dcMotor.get("motor_right");
        motorLeft = hardwareMap.dcMotor.get("motor_left");
        motorFront = hardwareMap.dcMotor.get("motor_front");
        motorBack = hardwareMap.dcMotor.get("motor_back");

        motorLeft.setDirection(DcMotor.Direction.REVERSE);
        motorRight.setDirection(DcMotor.Direction.FORWARD);

        //dead cat to caterpillar
        motorBack.setPower(-0.5);
        motorFront.setPower(-0.5);
        sleep(4000);

        //(caterpillar) go straight two tiles
        motorLeft.setPower(0.5);
        motorRight.setPower(0.5);
        sleep(4000);

        //caterpillar to dead cat (for turn)
        motorBack.setPower(0.5);
        motorFront.setPower(0.5);
        sleep(1000);

        //turn right (in dead cat)
        motorLeft.setPower(-0.5);
        motorRight.setPower(0.5);
        sleep(2000);

        //dead cat to caterpillar (for driving straight again)
        motorBack.setPower(-0.5);
        motorFront.setPower(-0.5);
        sleep(1000);

        //(caterpillar) go straight one tile
        motorLeft.setPower(0.5);
        motorRight.setPower(0.5);
        sleep(2000);

        //caterpillar to dead cat (to turn)
        motorBack.setPower(0.5);
        motorFront.setPower(0.5);
        sleep(1000);

        //turn right towards mountain (in dead cat)
        motorLeft.setPower(-0.5);
        motorRight.setPower(0.5);
        sleep(2000);

        //dead cat to caterpillar
        motorBack.setPower(-0.5);
        motorFront.setPower(-0.5);
        sleep(1000);

        //climb! (caterpillar)
        motorLeft.setPower(-0.5);
        motorRight.setPower(0.5);
        sleep(6000);

        //stop on goat mode (caterpillar to goat)
        motorBack.setPower(-0.5);
        motorFront.setPower(0.5);
        sleep(1000);
    }
}
