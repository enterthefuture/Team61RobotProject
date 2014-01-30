/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.Team61Robot.commands;

import edu.wpi.first.Team61Robot.RobotMap;
import edu.wpi.first.wpilibj.DigitalInput;


/**
 *
 * @author Trevor
 */
public class ArmlevateWithJoysticks extends CommandBase {
    
    public DigitalInput topArmLimit = new DigitalInput (RobotMap.topArmLimitChannel);
    public DigitalInput bottomArmLimit = new DigitalInput (RobotMap.bottomArmLimitChannel);
    
    public ArmlevateWithJoysticks() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(arm);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if( (!topArmLimit.get()) && (!bottomArmLimit.get()) ){
            arm.armlevate(oi.getArmSpeed());
        }
        //else{
        //}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
