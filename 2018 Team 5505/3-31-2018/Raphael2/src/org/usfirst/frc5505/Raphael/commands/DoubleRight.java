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

import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc5505.Raphael.subsystems.*;

/**
 *
 */
public class DoubleRight extends CommandGroup {


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=PARAMETERS
    public DoubleRight() {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=PARAMETERS
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=COMMAND_DECLARATIONS /// distance was 215
        addParallel(new setPivot(0.5, 0.4));
        addSequential(new driveForward(185, 1));
        addParallel(new setElevador(-110000, 1));
        addSequential(new driveForward(30, .6));
        addSequential(new setPivot(0.3, -0.4));
        addParallel(new waitSlowOut(),2);
        addSequential(new turnRobot(-160, 0.4));
        addParallel(new setPivot(0.5, 0.4));
        addSequential(new setElevador(-100, .8));
        addSequential(new driveForward(80, .75));
        addSequential(new AutonIntake(-1, .5));
        addParallel(new setElevador(-40000, 1));
        addSequential(new driveForward(-12, .75));
        addSequential(new driveForward(18, .75));
        addParallel(new AutonIntake(2, .4));
        addSequential(new driveForward(-12, .5));
        addSequential(new setElevador(-100, .8));
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=COMMAND_DECLARATIONS
 
    } 
}