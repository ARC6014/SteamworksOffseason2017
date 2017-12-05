package org.usfirst.frc.team6014.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team6014.robot.Robot;

/**
 *
 */
public class AutoDrive extends Command {
	
	private double xInit,yInit,xFin,yFin;
	private double duration,startTime;
	
	public AutoDrive(double xInit,double yInit,double xFin, double yFin, double duration) {
		// Use requires() here to declare subsystem dependencies
		this.xInit = xInit;
		this.yInit = yInit;
		this.xFin = xFin;
		this.yFin = yFin;
		this.duration = duration*1000;
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
		startTime = System.currentTimeMillis();
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		Robot.drive.arcadeDrive(xInit,yInit);
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return (System.currentTimeMillis() > (startTime+duration));
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
		Robot.drive.arcadeDrive(xFin, yFin);
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
		Robot.drive.arcadeDrive(xFin, yFin);
	}
}
