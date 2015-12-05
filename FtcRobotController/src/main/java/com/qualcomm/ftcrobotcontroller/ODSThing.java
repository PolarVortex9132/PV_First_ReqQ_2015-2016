package com.qualcomm.ftcrobotcontroller;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;

/**
 * Created by Atalanta on 11/8/2015.
 */
public class ODSThing extends LinearOpMode {
    OpticalDistanceSensor opticalDistanceSensor;


    @Override
    public void runOpMode() throws InterruptedException {
        opticalDistanceSensor = hardwareMap.opticalDistanceSensor.get("ODS");

        // wait for the start button to be pressed.
        waitForStart();

        while (opModeIsActive()) {
            double value = opticalDistanceSensor.getLightDetected();

            telemetry.addData("Value", value);

            // wait a hardware cycle before iterating.
            waitOneFullHardwareCycle();
        }
    }
}
