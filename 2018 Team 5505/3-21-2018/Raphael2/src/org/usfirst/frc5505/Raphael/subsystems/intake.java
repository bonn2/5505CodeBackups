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

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Joystick;

/**
 *
 */
public class intake extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final WPI_TalonSRX intakeTalon1 = RobotMap.intakeintakeTalon1;
    private final WPI_TalonSRX intakeTalon2 = RobotMap.intakeintakeTalon2;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    	
        setDefaultCommand(new VariableIntake());
        
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop
    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    public void fire() {
    	intakeTalon1.set(1);
    	intakeTalon2.set(1);
    }
    
    public void stop() {
    	intakeTalon1.set(0);
    	intakeTalon2.set(0);
    }
    
    public void suck() {
    	intakeTalon1.set(-.6);
    	intakeTalon2.set(-.6);
    }
    
    public void tenOut() {
    	intakeTalon1.set(.1);
    	intakeTalon2.set(.1);
    }
    
    public void slowFire() {
    	intakeTalon1.set(.45);
    	intakeTalon2.set(.45);
    }
    
    public void VariableIntakeIn(Joystick stick) {
    	intakeTalon1.set(-stick.getRawAxis(2));
    	intakeTalon2.set(-stick.getRawAxis(2));
    }
    
    public void VariableIntakeOut(Joystick stick) {
    	intakeTalon1.set(stick.getRawAxis(3));
    	intakeTalon2.set(stick.getRawAxis(3));
    }
    
    public void set(double speed) {
    	intakeTalon1.set(speed);
    	intakeTalon2.set(speed);
    }
    
} 

