// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.Shooter;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase {
  /** Creates a new Intake. */
  private final WPI_TalonSRX LowerIntakeMotor = new WPI_TalonSRX(Constants.IntakeConstants.LowerIntakeMotorID);
  private final WPI_TalonSRX UpperIntakeMotor = new WPI_TalonSRX(Constants.IntakeConstants.UpperIntakeMotorID);
  public Intake() {
     

    
  }

  @Override
  public void periodic() {
    
    // This method will be called once per scheduler run
  }
  public void setIntake(double powerPercent) {
    LowerIntakeMotor.set(powerPercent);
    UpperIntakeMotor.set(powerPercent);
  }
}
