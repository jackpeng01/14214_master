package org.firstinspires.ftc.teamcode.FreightFrenzy.Helpers;

import com.qualcomm.robotcore.hardware.DcMotorEx;

public class MotorFunctions {
    public static void setVelocity(DcMotorEx motor, double velocity) {
        motor.setVelocity(velocity * 2800);
    }
}
