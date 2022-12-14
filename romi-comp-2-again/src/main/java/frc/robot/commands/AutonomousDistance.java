// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import frc.robot.commands.DriveDistance;
import frc.robot.sensors.RomiGyro;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class AutonomousDistance extends SequentialCommandGroup {

  /**
   * Creates a new Autonomous Drive based on distance. This will drive out for a specified distance,
   * turn around and drive back.
   *
   * @param drivetrain The drivetrain subsystem on which this command will run
   */
  public AutonomousDistance(Drivetrain drivetrain) {
    for (int i = 0; i < 100; i++) {
      if (Math.abs(RomiGyro.getRateX()) > 25) {
        i = 101;
      }
      addCommands(
        new DriveDistance(-0.5, 5, drivetrain),
        new TurnDegrees(-0.5, 180, drivetrain)
      );
    }
  }
}
