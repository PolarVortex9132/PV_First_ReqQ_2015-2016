package com.qualcomm.ftcrobotcontroller.PV_FIRSTResQ_2015_2016;
import com.qualcomm.robotcore.hardware.OpticalDistanceSensor;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import com.qualcomm.ftccommon.DbgLog;
import com.qualcomm.ftcrobotcontroller.R;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

/**
 * Created by Atalanta on 11/8/2015.
 */
class ODSThing extends LinearOpMode{

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
