package org.usfirst.frc.team6014.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;

public class OI {
	
	XboxController xbox = new XboxController(0);
	GenericHID.Hand directionStick = GenericHID.Hand.kRight;
	double turboFactor = 1.5;
	
	double adjustSpeed(double rawInput) {
		double rawSpeed = rawInput * this.getSpeed() / 2.0;
		if (this.getTurboButton()) {
			return Math.signum(rawSpeed) * Math.pow(rawSpeed, (1.0 / turboFactor));
		} else {
			return rawSpeed;
		}
	}
	
	double getRawX() {
		return xbox.getX(directionStick);
	}
	
	double getRawY() {
		return xbox.getY(directionStick);
	}
	
	public double getX() {
		return this.adjustSpeed(this.getRawX());
	}
	
	public double getY() {
		return this.adjustSpeed(this.getRawY());
	}
	
	public boolean getReverseButton() {
		return xbox.getYButton();
	}
	
	boolean getTurboButton() {
		return xbox.getBumper(GenericHID.Hand.kRight);
	}
	
	public boolean getClimbingButton() {
		return xbox.getBumper(GenericHID.Hand.kLeft);
	}
	
	double getSpeed() {
		return xbox.getY(GenericHID.Hand.kLeft) + 1.0;
	}
	
	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
}
