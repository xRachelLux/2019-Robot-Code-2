/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;



import com.revrobotics.CANEncoder;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.Counter;
//import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.command.Subsystem;


public class DriveTrain extends Subsystem {

  public static CANSparkMax frontRight = new CANSparkMax(0, MotorType.kBrushless);
  public static CANSparkMax frontLeft = new CANSparkMax(15, MotorType.kBrushless);
  public static CANSparkMax rearRight = new CANSparkMax(2, MotorType.kBrushless);
  public static CANSparkMax rearLeft = new CANSparkMax(12, MotorType.kBrushless);

  //public static AnalogGyro gyro = new AnalogGyro(RobotMap.gyroPort);

  public static CANEncoder frontRightHall = frontRight.getEncoder();
  public static CANEncoder rearRightHall = rearRight.getEncoder();
  public static CANEncoder frontLeftHall = frontLeft.getEncoder();
  public static CANEncoder rearLeftHall = rearLeft.getEncoder();
  //1 revolution is approximately 0.  

  public DriveTrain(){
  }

  @Override
  public void initDefaultCommand() { 
    setDefaultCommand(new DriveTeleop());
    System.out.println("defaultcommand");
  }
  public static void driveTeleop(){
    //double leftJoy = OI.atkJoy1.getRawAxis(1);
    //double rightJoy = OI.atkJoy1.getRawAxis(5);
    double leftJoy = 0.02;
    double rightJoy  = 0.02;
    frontRight.set(rightJoy);
    rearRight.set(rightJoy);
    frontLeft.set(leftJoy);
    rearLeft.set(leftJoy);

    
    //System.out.println(DriveTrain.frontLeftHall.getPosition() + "/t" + DriveTrain.frontRightHall.getPosition() + "/t" + DriveTrain.rearLeftHall.getPosition() + "/t" + DriveTrain.rearRightHall.getPosition());
    
  }
  public static void driveAuton(double rightSpeed, double leftSpeed){
    frontRight.set(rightSpeed);
    rearRight.set(rightSpeed);
    frontLeft.set(leftSpeed);
    rearLeft.set(leftSpeed);
  }
  /*public static void infrared(){
    while(middle!=0){ 
      if(left==0){
        driveAuton(0.2, 0.5);
      }
      else if(right==0){
        driveAuton(0.5, 0.2);
      }
    }
    */
  }
  /*
  public static void turnDegrees(int angle) {
    if (angle > 180) {
      angle = -(360-angle);
    }
    while (gyro.getAngle()!= angle) {
      if (angle <0){
        driveAuton (-1.0,1.0);
      }
      else {
        driveAuton(1.0, -1.0);
      }
    }
  }*/

