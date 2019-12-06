package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;

public class MiguelDrivetrain {

    private DcMotor leftBackDrive = null;
    private DcMotor rightFrontDrive = null;
    private DcMotor leftFrontDrive = null;
    private DcMotor rightBackDrive = null;

    public MiguelDrivetrain(MiguelMap robot) {
        this.leftFrontDrive = robot.leftFrontDrive;
        this.leftBackDrive = robot.leftBackDrive;
        this.rightBackDrive = robot.rightBackDrive;
        this.rightFrontDrive = robot.rightFrontDrive;
    }

    public void drive (double leftStickY, double leftStickX, double rightStickY, double rightStickX) {
        double leftBack = Range.clip(leftStickY - leftStickX - rightStickX, -1.0,1.0);
        double rightBack =  Range.clip(leftStickY - leftStickX + rightStickX, -1.0,1.0);
        double leftFront = Range.clip(leftStickY + leftStickX - rightStickX, -1.0,1.0);
        double rightFront = Range.clip(leftStickY + leftStickX + rightStickX, -1.0,1.0);

        leftFrontDrive.setPower(leftFront);
        rightFrontDrive.setPower(rightFront);
        leftBackDrive.setPower(leftBack);
        rightBackDrive.setPower(rightBack);
    }
}


