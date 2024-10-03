// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.Shooter;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Shooter extends SubsystemBase {
  public static final WPI_TalonSRX RShootMotor = new WPI_TalonSRX(Constants.ShooterConstants.RShootMotorID);
  public static final WPI_TalonSRX LShootMotor = new WPI_TalonSRX(Constants.ShooterConstants.LShootMotorID);

  public static final WPI_TalonSRX RFeedMotor = new WPI_TalonSRX(Constants.ShooterConstants.RFeedMotorID);
  public static final WPI_TalonSRX LFeedMotor = new WPI_TalonSRX(Constants.ShooterConstants.LFeedMotorID);
  /** Creates a new Shooter. */
  public Shooter() {
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
  public static void setShooters(double ShootSpeed,double FeedSpeed) {
    RShootMotor.set(ShootSpeed);
    LShootMotor.set(ShootSpeed);

    RFeedMotor.set(FeedSpeed);
    LFeedMotor.set(FeedSpeed);
  }
  
}
