// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
//subsystemreal
package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SubsystemReal extends SubsystemBase {
  /** Creates a new SubsystemReal. */
  public SubsystemReal() {
    SubsystemReal = new TalonFX(deviceid)
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
