package org.usfirst.frc.team6014.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team6014.robot.Robot;

/**
 *
 */
public class Teleop extends Command {
	public Teleop() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.drive);
		requires(Robot.climber);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		Robot.drive.arcadeDrive(Robot.oi.getX(),Robot.oi.getY());
		if(Robot.oi.getClimbingButton()) {
			Robot.climber.moveClimber(1.0);
		} else {
			Robot.climber.moveClimber(0.0);
		}
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}
