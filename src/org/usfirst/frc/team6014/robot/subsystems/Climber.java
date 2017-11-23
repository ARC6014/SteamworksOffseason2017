package org.usfirst.frc.team5665.robot.subsystems;

import org.usfirst.frc.team5665.robot.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Climber extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	private static final Talon rightMotor = RobotMap.climbRightMotor;
	private static final VictorSP leftMotor = RobotMap.climbLeftMotor;

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
	
	public void moveClimber(double rate) {
		rightMotor.set(rate);
		leftMotor.set(rate);
	}
}
