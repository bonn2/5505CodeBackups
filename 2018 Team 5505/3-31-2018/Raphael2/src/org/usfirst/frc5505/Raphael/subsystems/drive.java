// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5505.Raphael.subsystems;

import org.usfirst.frc5505.Raphael.Robot;
import org.usfirst.frc5505.Raphael.RobotMap;
import org.usfirst.frc5505.Raphael.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import edu.wpi.first.wpilibj.DriverStation;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.RobotDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.Joystick;
import com.kauailabs.navx.frc.AHRS;
import edu.wpi.first.wpilibj.SPI;



/**
 *
 */
public class drive extends Subsystem {


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS
	    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final WPI_TalonSRX talonSRX0 = RobotMap.driveTalonSRX0;
    private final WPI_TalonSRX talonSRX1 = RobotMap.driveTalonSRX1;
    private final WPI_TalonSRX talonSRX14 = RobotMap.driveTalonSRX14;
    private final WPI_TalonSRX talonSRX13 = RobotMap.driveTalonSRX13;
    private final RobotDrive robotDrive41 = RobotMap.driveRobotDrive41;
    private final WPI_TalonSRX talonSRX2RightFollow = RobotMap.driveTalonSRX2RightFollow;
    private final WPI_TalonSRX talonSRX15LeftFollow = RobotMap.driveTalonSRX15LeftFollow;
    private final DoubleSolenoid shifterSolenoid = RobotMap.driveshifterSolenoid;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    private final AHRS ahrs = new AHRS(SPI.Port.kMXP); 
    
    
    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new joystickDrive());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        
        shifterSolenoid.set(DoubleSolenoid.Value.kForward);

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop
        SmartDashboard.putNumber("IMU_TotalYaw", ahrs.getAngle());
		SmartDashboard.putNumber("Encoder Distance", getEncoderDistance());
		SmartDashboard.putNumber("Encoder Count", talonSRX2RightFollow.getSensorCollection().getQuadraturePosition());
    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
	public void driveBase (Joystick stick) {
		if (DriverStation.getInstance().isOperatorControl() == true) {
    	Robot.drive.setFollowers();
    	double reduction = -1;
		robotDrive41.tankDrive(stick.getRawAxis(5)*reduction,stick.getRawAxis(1)*reduction);
		}
    }
	
	public void driveStraight (double speed) {
		robotDrive41.tankDrive(speed, speed);
	}
	
	public void turnLeft (double speed) {
		robotDrive41.tankDrive(speed, speed*-1);
	}
	
	public void turnRight (double speed) {
		robotDrive41.tankDrive(speed*-1, speed);
	}
	
	public void stop() {
		robotDrive41.tankDrive(0, 0);
	}
	
	public void shift() {
		if (shifterSolenoid.get() != DoubleSolenoid.Value.kForward) 
			shifterSolenoid.set(DoubleSolenoid.Value.kForward);
		 else 
			shifterSolenoid.set(DoubleSolenoid.Value.kReverse); 
	}
	
	public double getEncoderDistance() {
		double wheelDiameter = 6;
		double encoderResolution = 4096;
		return (talonSRX2RightFollow.getSensorCollection().getQuadraturePosition() * (wheelDiameter * Math.PI / encoderResolution) / 10);
	}
	
	public void zeroAngle() {
		ahrs.zeroYaw();
	}
	
	public double getAngle() {
		return ahrs.getAngle();
	}
	
	public void setFollowers() {
		talonSRX2RightFollow.follow(talonSRX1);
		talonSRX15LeftFollow.follow(talonSRX13);
	}
		
}

