/*package com.qualcomm.ftcrobotcontroller;


        import android.graphics.Color;
        import android.provider.CalendarContract;

        import com.qualcomm.ftcrobotcontroller.opmodes.ColorSensorDriver;
        import com.qualcomm.robotcore.eventloop.opmode.OpMode;
        import com.qualcomm.robotcore.hardware.ColorSensor;
        import com.qualcomm.robotcore.hardware.DcMotor;
        import com.qualcomm.robotcore.hardware.LED;
        import com.qualcomm.robotcore.hardware.TouchSensor;
        import com.qualcomm.robotcore.util.Range;


/**
 * Created by polarvortexrobotics on 10/18/15.
 */
/*public abstract class ColorTest extends OpMode {

    public enum ColorSensorDevice {MODERN_ROBOTICS_I2C}


    public ColorSensorDevice device = ColorSensorDevice.MODERN_ROBOTICS_I2C;

    ColorSensor colorSensor;
    LED led;
    float hsvValues[] = {0, 0, 0};
    final float values[] = hsvValues;

    public LED getLed() {
        return led;
    }




    public void runOpMode() throws InterruptedException {
        hardwareMap.logDevices();

        led = hardwareMap.led.get("led");
    }

    public void init() {

        colorSensor = hardwareMap.colorSensor.get("sensor_color");

    }

    /*public boolean b;
    {
        boolean b1 = b;
        return b;
    }*/

    /*boolean b;

    boolean is_color_sensor_green () {
        boolean l_return = false;

        if (v_sensor_color != null) {
            l_return = v_sensor_color.enableLed (boolean b);

        }

        return l_return;
    }



    public void loop() {

        telemetry.addData("color val", "c_value " + is_color_sensor_green());

        telemetry.addData("Clear", colorSensor.alpha());
        telemetry.addData("Red  ", colorSensor.red());
        telemetry.addData("Green", colorSensor.green());
        telemetry.addData("Blue ", colorSensor.blue());
        telemetry.addData("Hue", hsvValues[0]);

        Color.RGBToHSV(colorSensor.red() * 8, colorSensor.green() * 8, colorSensor.blue() * 8, hsvValues);

    }

    public ColorSensor v_sensor_color;


    public void Get() {
        colorSensor = hardwareMap.colorSensor.get("mr");

    }
    private void enableLed(boolean value) {
        colorSensor.enableLed(value);
    }
}
    */