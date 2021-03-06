/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.subsystems.*;
//import frc.robot.subsystems.DriveTrain;
import frc.robot.Robot;

public class DriveTeleop extends Command {
  
  public DriveTeleop() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.drivetrain);
    //System.out.println("hi");
    //requires(Robot.practice);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    //DriveTrain.driveTeleop();
    
    //System.out.println("frontRight " +  DriveTrain.frontRightHall.getPosition()+"\t rearRight " + DriveTrain.rearRightHall.getPosition());
    DriveTrain.driveTeleop();
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    //DriveTrain.driveAuton(0.0, 0.0);
    DriveTrain.driveAuton(0.0, 0.0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
