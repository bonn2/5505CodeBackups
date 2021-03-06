// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5505.Raphael.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc5505.Raphael.Robot;

/**
 *
 */
public class elevatePos extends Command {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
    private double m_speed;
    private double m_hight;
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
    private int startCount;
    private boolean atPos;
    private double desiredPosition;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public elevatePos(double speed, double hight) {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        m_speed = speed;
        m_hight = hight;

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    	startCount = Robot.climber.getEncoderCount();
    	desiredPosition = startCount + m_hight;
    	atPos = false;
    	if (m_hight > 0) 
    		Robot.climber.elevateUp();
    	else 
    		Robot.climber.elevateDown();

    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
    	double give = 5;
    	if (m_hight > 0) {
    		if (Robot.climber.getEncoderCount() >= desiredPosition-give)
    			atPos = true;
    	} else {
    		if (Robot.climber.getEncoderCount() <= desiredPosition+give)
    			atPos = true;
    	}
        return atPos;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
    	Robot.climber.stopElevate();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    	Robot.climber.stopElevate();
    }
}
