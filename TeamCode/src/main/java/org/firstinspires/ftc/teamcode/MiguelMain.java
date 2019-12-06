package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.util.ElapsedTime;



@TeleOp(name="Donkey", group="Iterative Opmode")
public class MiguelMain extends OpMode {
    private ElapsedTime runtime = new ElapsedTime();
    MiguelMap robot;
    MiguelDrivetrain drive;
    MiguelArm arm;
    MiguelPulley pulley;


    @Override
    public void init() {
        robot = new MiguelMap(hardwareMap);
        robot.init();
        drive = new MiguelDrivetrain(robot);
        arm = new MiguelArm(robot); // still not initialized or set up
        pulley = new MiguelPulley(robot);



        telemetry.addData("STATUS", "Initialized");
    }

    @Override
    public void init_loop() {
    }

    @Override
    public void start() {
        runtime.reset();
    }

    @Override
    public void loop() {
        // Show the elapsed game time and wheel power.
        telemetry.addData("Status", "Run Time: " + runtime.toString());
      // telemetry.addData("Motors", "left (%.2f), right (%.2f)", );
        telemetry.update();

        drive.drive(gamepad1.left_stick_y, gamepad1.left_stick_x, gamepad1.right_stick_y, gamepad1.right_stick_x);
        arm.flex(gamepad1.dpad_up, gamepad1.dpad_down);
        pulley.move(gamepad2.left_bumper, gamepad2.right_bumper);
        telemetry.addData("G2 Left Bumper", gamepad2.left_bumper);

    }

    @Override
    public void stop() {
    }
}
