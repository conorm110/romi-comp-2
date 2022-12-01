
// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.RomiDrivetrain;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class TeleopCommand extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final RomiDrivetrain m_subsystem;
  private final Joystick m_joystick;
  
  /**
   * Creates a new TeleopCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public TeleopCommand(RomiDrivetrain romi_drive_train, Joystick joystick) {
    m_subsystem = romi_drive_train;
    m_joystick = joystick;
    m_subsystem.arcadeDrive(m_joystick.getX(),m_joystick.getY()); // added line - test
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(romi_drive_train);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
