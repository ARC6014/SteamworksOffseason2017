package org.usfirst.frc.team6014.robot.subsystems;

import org.usfirst.frc.team6014.robot.Robot;
import org.usfirst.frc.team6014.robot.RobotMap;
import org.usfirst.frc.team6014.robot.commands.Teleop;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Drive extends Subsystem {
	
	RobotDrive robotDrive = RobotMap.robotDrive;
	
    @Override
	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
    	//setDefaultCommand(new Teleop());
    }

    public void arcadeDrive(double xAxis, double yAxis) {
		robotDrive.arcadeDrive(-yAxis, xAxis);
	}
}

