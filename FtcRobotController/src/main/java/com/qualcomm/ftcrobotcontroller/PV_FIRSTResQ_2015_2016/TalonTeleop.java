package com.qualcomm.ftcrobotcontroller.PV_FIRSTResQ_2015_2016;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;

/**
 * Created by polarvortexrobotics on 11/22/15.
 */
public class TalonTeleop extends OpMode{

    /**
     * TeleOp Mode
     * <p>
     * Enables control of the robot via the gamepad
     */

        DcMotor motorLeft;
        DcMotor motorRight;
        DcMotor motorFront;
        DcMotor motorBack;

//defining variables for our motors (left, right, front, back)

	/*
	 * Code to run when the op mode is first enabled goes here
	 *
	 * @see com.qualcomm.robotcore.eventloop.opmode.OpMode#start()
	 */

        @Override
        public void init() {

            motorRight = hardwareMap.dcMotor.get("motor_right");
            motorLeft = hardwareMap.dcMotor.get("motor_left");
            motorFront = hardwareMap.dcMotor.get("motor_front");
            motorBack = hardwareMap.dcMotor.get("motor_back");

            motorLeft.setDirection(DcMotor.Direction.REVERSE);
            motorRight.setDirection(DcMotor.Direction.FORWARD);

        }

        /*
         * This method will be called repeatedly in a loop
         *
         * @see com.qualcomm.robotcore.eventloop.opmode.OpMode#run()
         */
        @Override
        public void loop() {

            float throttleLeft = gamepad1.left_stick_y;
            float throttleRight = gamepad1.right_stick_y;
            boolean bumperLeft = gamepad1.left_bumper;
            boolean bumperRight = gamepad1.right_bumper;
            float triggerLeft = gamepad1.left_trigger;
            float triggerRight = gamepad1.right_trigger;
            float right;
            float left;
            float TRight;
            float TLeft;
            boolean BRight;
            boolean BLeft;
            // defining the buttons on our joystick


            // clip the right/left values so that the values never exceed +/- 1
            right = Range.clip(throttleRight, -1, 1);
            left = Range.clip(throttleLeft, -1, 1);
            TRight = Range.clip(triggerRight, -1, 1);
            TLeft = Range.clip(triggerLeft, -1, 1);
            //clip to make the numbers easier to read


            // scale the joystick value to make it easier to control
            // the robot more precisely at slower speeds.
            right = (float) scaleInput(right);
            left = (float) scaleInput(left);
            TRight = (float) scaleInput(TRight);
            TLeft = (float) scaleInput(TLeft);
            //scale left/right throttles and triggers (no need for bumpers because it's a boolean)

            // write the values to the motors
            motorRight.setPower(right);
            motorLeft.setPower(left);
            motorFront.setPower(TLeft);
            motorBack.setPower(TRight);
            //power variable for all four motors

            if (bumperLeft){

                    motorBack.setPower(-1); }
            else {
                    motorBack.setPower(0); }

            if (bumperRight) {
                motorFront.setPower(1);
            } else {
                motorFront.setPower(0);
            }

            motorBack.setPower(-triggerLeft); //negative, reverses the value of the motor
            motorFront.setPower(-triggerRight);
            motorLeft.setPower(-throttleLeft);
            motorRight.setPower(-throttleRight);
        }




    double scaleInput(double dVal) {
        double[] scaleArray = {0.0, 0.05, 0.09, 0.10, 0.12, 0.15, 0.18, 0.24,
                0.30, 0.36, 0.43, 0.50, 0.60, 0.72, 0.85, 1.00, 1.00};

        // get the corresponding index for the scaleInput array.
        int index = (int) (dVal * 16.0);

        // index should be positive.
        if (index < 0) {
            index = -index;
        }

        // index cannot exceed size of array minus 1.
        if (index > 16) {
            index = 16;
        }

        // get value from the array.
        double dScale = 0.0;
        if (dVal < 0) {
            dScale = -scaleArray[index];
        } else {
            dScale = scaleArray[index];
        }

        // return scaled value.
        return dScale;
    }

}




