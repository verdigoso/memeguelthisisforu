package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.ServoController;

public class MiguelArm {

    private Servo arm;

    public MiguelArm (MiguelMap robot) {
        this.arm = robot.arm;
    }

    public void flex(boolean dp_up, boolean dp_down) {
        if (dp_down) {
            arm.setPosition(-1.0);
        }
        else {
            arm.setPosition(1.0);
        }

    }

}
