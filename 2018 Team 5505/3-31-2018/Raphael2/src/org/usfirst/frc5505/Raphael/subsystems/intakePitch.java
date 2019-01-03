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
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DriverStation;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class intakePitch extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final WPI_TalonSRX pitchTalon = RobotMap.intakePitchpitchTalon;
    private final DigitalInput pitchSwitch = RobotMap.intakePitchpitchSwitch;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new pitch());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    public void pitch() {
		if (DriverStation.getInstance().isOperatorControl() == true) {
    	double reduction = .7;
   		if (pitchSwitch.get() == false) {
   			//Not bottoming out (Run Normal)
  			pitchTalon.set(Robot.oi.xbox2.getRawAxis(1)*reduction);
  			SmartDashboard.putBoolean("isBottomedOut", true);
   		} else {
   			if (Robot.oi.xbox2.getRawAxis(1) > 0) {
   				//Is bottomed out but trying to move up
   				pitchTalon.set(Robot.oi.xbox2.getRawAxis(1)*reduction);
   	  			SmartDashboard.putBoolean("isBottomedOut", false);
   			} else {
   				//Is bottomed out and trying to move down or not move at all
   				pitchTalon.set(0);
   	  			SmartDashboard.putBoolean("isBottomedOut", false);
  			}
   		}
		}
    }
    
    public void pitchMotor(double speed) {
    	pitchTalon.set(-speed);
    }

}

