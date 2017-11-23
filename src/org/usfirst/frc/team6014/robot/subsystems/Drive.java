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
	
	public void drive() {
		this.robotDrive.arcadeDrive(Robot.oi.getY(), Robot.oi.getX());
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

