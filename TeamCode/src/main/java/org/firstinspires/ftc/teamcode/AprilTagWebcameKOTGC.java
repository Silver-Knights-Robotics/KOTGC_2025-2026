package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.mechanisms.AprilTagWebcam;

public class AprilTagWebcameKOTGC extends OpMode {

aprilTagWebcam aprilTagWebcam = new AprilTagWebcam();


    @Override
    public void init() {
        aprilTagWebcam.init(hardwareMap, telemetry);


}

@Override
    public void loop() {


}

}
