package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.Range;

public class MiguelPulley {

    private DcMotor pulley;

    private static final double INTAKE_POWER = 1.0;
    private static final double OUTTAKE_POWER = -1.0;

    public MiguelPulley (MiguelMap robot) { this.pulley = robot.pulley;}

    public void move(boolean leftBumper, boolean rightBumper){
        if(leftBumper && rightBumper){
            pulley.setPower(0.0);
        }
        else if(leftBumper){
            pulley.setPower(INTAKE_POWER);
        }
        else if(rightBumper){
            pulley.setPower(OUTTAKE_POWER);
        }
        else{
            pulley.setPower(0.0);
        }



    }

}
