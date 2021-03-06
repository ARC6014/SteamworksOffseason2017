package org.usfirst.frc.team6014.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;

public class OI {
	
	XboxController xbox = new XboxController(0);
	GenericHID.Hand directionStick = GenericHID.Hand.kRight;
	double turboFactor = 3.0;
	double reverseFactor = 1.0;
	boolean prevReverseButton = false;
	
	double adjustSpeed(double rawInput) {
		double rawSpeed = rawInput * this.getSpeed();
		if (this.getTurboButton()) {
			return Math.signum(rawSpeed) * Math.pow(Math.abs(rawSpeed), (1.0 / turboFactor));
		} else {
			return rawSpeed;
		}
	}
	
	double getRawX() {
		return xbox.getX(directionStick);
	}
	
	double getRawY() {
		return xbox.getY(directionStick)*this.getReverseFactor();
	}
	
	public double getX() {
		return this.adjustSpeed(this.getRawX());
	}
	
	public double getY() {
		return this.adjustSpeed(this.getRawY());
	}
	
	boolean getReverseButton() {
		return xbox.getYButton();
	}
	
	double getReverseFactor() {
		boolean curReverseButton = getReverseButton();
		if(curReverseButton && !prevReverseButton) {
			reverseFactor*=-1.0;
		}
		prevReverseButton = curReverseButton;
		return reverseFactor;
	}
	
	boolean getTurboButton() {
		return xbox.getBumper(GenericHID.Hand.kRight);
	}
	
	public boolean getClimbingButton() {
		return xbox.getBumper(GenericHID.Hand.kLeft);
	}
	
	double getSpeed() {
		return ((-0.6*xbox.getY(GenericHID.Hand.kLeft) + 0.6)/2.0)+0.4;
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
