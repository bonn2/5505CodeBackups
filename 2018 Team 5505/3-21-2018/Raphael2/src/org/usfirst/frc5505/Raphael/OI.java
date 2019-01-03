// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5505.Raphael;

import org.usfirst.frc5505.Raphael.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import org.usfirst.frc5505.Raphael.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton a;
    public JoystickButton b;
    public JoystickButton lb;
    public JoystickButton y;
    public JoystickButton rb;
    public JoystickButton joystickButton1;
    public Joystick xbox1;
    public JoystickButton lb2;
    public JoystickButton rb2;
    public JoystickButton a2;
    public JoystickButton b2;
    public JoystickButton x2;
    public Joystick xbox2;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        xbox2 = new Joystick(1);
        
        x2 = new JoystickButton(xbox2, 3);
        x2.whileHeld(new slowOut());
        b2 = new JoystickButton(xbox2, 2);
        b2.whileHeld(new straightIntake());
        a2 = new JoystickButton(xbox2, 1);
        a2.whileHeld(new fire());
        rb2 = new JoystickButton(xbox2, 5);
        rb2.whileHeld(new elevatorUp());
        lb2 = new JoystickButton(xbox2, 6);
        lb2.whileHeld(new elevadorDown());
        xbox1 = new Joystick(0);
        
        joystickButton1 = new JoystickButton(xbox1, 3);
        joystickButton1.whileHeld(new climbDown());
        rb = new JoystickButton(xbox1, 6);
        rb.whenPressed(new toggleShift());
        y = new JoystickButton(xbox1, 4);
        y.whenPressed(new hookPistonIn());
        lb = new JoystickButton(xbox1, 6);
        lb.whenPressed(new shiftClimber());
        b = new JoystickButton(xbox1, 2);
        b.whenPressed(new hookPistonOut());
        a = new JoystickButton(xbox1, 1);
        a.whileHeld(new climbUp());


/*        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("climbUp", new climbUp());
        SmartDashboard.putData("elevatorUp", new elevatorUp());
        SmartDashboard.putData("elevadorDown", new elevadorDown());
        SmartDashboard.putData("straightIntake", new straightIntake());
        SmartDashboard.putData("pitch", new pitch());
        SmartDashboard.putData("fire", new fire());
        SmartDashboard.putData("hookPistonOut", new hookPistonOut());
        SmartDashboard.putData("hookPistonIn", new hookPistonIn());
        SmartDashboard.putData("leftAutonChooser", new leftAutonChooser());
        SmartDashboard.putData("middleAutonChooser", new middleAutonChooser());
        SmartDashboard.putData("rightAutonChooser", new rightAutonChooser());
        SmartDashboard.putData("leftLeftScaleSwitch", new leftLeftScaleSwitch());
        SmartDashboard.putData("turnRobot: test", new turnRobot(45, .75));
        SmartDashboard.putData("driveForward: default", new driveForward(112, .75));
        SmartDashboard.putData("leftLeftSwitch", new leftLeftSwitch());
        SmartDashboard.putData("rotateUp", new rotateUp());
        SmartDashboard.putData("rotateDown", new rotateDown());
        SmartDashboard.putData("slowOut", new slowOut());
        SmartDashboard.putData("switchAuton", new switchAuton());
        SmartDashboard.putData("setElevador: switch", new setElevador(4000, .5));
        SmartDashboard.putData("setElevador: scale", new setElevador(8000, .5));
        SmartDashboard.putData("scaleAuton", new scaleAuton());
        SmartDashboard.putData("setPivot", new setPivot());
        SmartDashboard.putData("straigntAuton", new straigntAuton());
        SmartDashboard.putData("middleSwitch", new middleSwitch());
        SmartDashboard.putData("climbDown", new climbDown());
        SmartDashboard.putData("AutonCenterSwitch", new AutonCenterSwitch());
        SmartDashboard.putData("middleSwitchLeft", new middleSwitchLeft());
        SmartDashboard.putData("StraightScale", new StraightScale());
        SmartDashboard.putData("ScaleColor", new ScaleColor());
        SmartDashboard.putData("Baseline", new Baseline());
        SmartDashboard.putData("RightSwitch", new RightSwitch());
        SmartDashboard.putData("SwitchColor", new SwitchColor());
        SmartDashboard.putData("ScaleSwitch", new ScaleSwitch());

 */   // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getXbox1() {
        return xbox1;
    }

    public Joystick getXbox2() {
        return xbox2;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}
