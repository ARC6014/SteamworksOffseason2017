package org.usfirst.frc.team6014.robot.subsystems;

import org.usfirst.frc.team6014.robot.Robot;
import org.usfirst.frc.team6014.robot.RobotMap;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drive extends Subsystem {
	
	RobotDrive robotDrive = RobotMap.robotDrive;
	
	private static final VictorSP frontLeft = RobotMap.frontLeftMotor;
	private static final VictorSP frontRight = RobotMap.frontRightMotor;
	private static final VictorSP rearLeft = RobotMap.rearLeftMotor;
	private static final VictorSP rearRight = RobotMap.rearRightMotor;
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        // setDefaultCommand(new Teleop()); not ready yet
    }

    public void arcadeDrive(double xAxis, double yAxis) {
		double yInput = Math.sin(yAxis*Math.PI/2);
		robotDrive4.arcadeDrive(yInput, xAxis);
	}
	
    public void setSensetivity(double sensetivity) {
	    robotDrive.setMaxOutput(sensetivity);
    }
	
}

