package org.usfirst.frc.team6014.robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.VictorSP;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static VictorSP frontLeftMotor = new VictorSP(3);
	public static VictorSP frontRightMotor = new VictorSP(1);
	public static VictorSP rearLeftMotor = new VictorSP(4);
	public static VictorSP rearRightMotor = new VictorSP(2);
	public static VictorSP climbLeftMotor = new VictorSP(6);
	public static Talon climbRightMotor = new Talon(5);
	public static RobotDrive robotDrive = new RobotDrive(frontLeftMotor,rearLeftMotor,frontRightMotor,rearRightMotor);
	
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
