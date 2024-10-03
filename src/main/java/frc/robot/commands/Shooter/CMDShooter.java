// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.Shooter;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.Shooter.Intake;
import frc.robot.subsystems.Shooter.Shooter;

public class CMDShooter extends Command {
  Intake intake;
  Shooter shooter;
  CommandXboxController xbox;
  /** Creates a new Shooter. */
  public CMDShooter(Intake intake, Shooter shooter, CommandXboxController xbox) {
    addRequirements(intake);
    addRequirements(shooter);
    this.intake = intake;
    this.shooter = shooter;
    this.xbox = xbox;
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    intake.setIntake(xbox.getLeftTriggerAxis()-(xbox.getHID().getLeftBumper()?1:0));
    shooter.setShooters(xbox.getRightTriggerAxis()-(xbox.getHID().getRightBumper()?1:0),xbox.getHID().getAButton()?1:0);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
