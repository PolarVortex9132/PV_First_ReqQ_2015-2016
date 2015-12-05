package com.qualcomm.ftcrobotcontroller.PV_FIRSTResQ_2015_2016;


import android.graphics.Color;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.LED;
import com.qualcomm.robotcore.hardware.TouchSensor;
import com.qualcomm.robotcore.util.Range;


/**
 * Created by polarvortexrobotics on 10/18/15.
 */
public class TouchTest extends OpMode {

    DcMotor motorRight;
    DcMotor motorLeft;
    //TouchSensor v_sensor_touch;

    public TouchTest() {

    }

    public void init() {

        // motorRight = hardwareMap.dcMotor.get("motor_2");
        //  motorLeft = hardwareMap.dcMotor.get("motor_1");
        v_sensor_touch = hardwareMap.touchSensor.get("sensor_touch");

    }

    boolean is_touch_sensor_pressed()

    {
        boolean l_return = false;

        if (v_sensor_touch != null) {
            l_return = v_sensor_touch.isPressed();
        }

        return l_return;

    }

    private TouchSensor v_sensor_touch;


    @Override
    public void loop() {
        telemetry.addData("touch val", "t_val: " + is_touch_sensor_pressed());

    }

}