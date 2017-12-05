package org.usfirst.frc.team6014.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;

import org.usfirst.frc.team6014.robot.Robot;

/**
 *
 */
public class AutoMiddle extends CommandGroup {
	
	public AutoMiddle() {
		addSequential(new AutoDrive(0,-0.6,0,0,2.5));
		addSequential(new AutoDrive(0,0,0,0.6,4.0));
		addSequential(new AutoDrive(0,0.6,0,-0.6,0.5));
		addSequential(new AutoDrive(0,-0.6,0,0,0.8));
	}
}
