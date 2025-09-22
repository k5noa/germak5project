// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.Subsystem;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.subsystems.SubsystemReal;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class Command extends InstantCommand {
  
  public SubsystemReal SubReal;

  public Command() {
      SubReal = new SubsystemReal();
  }

  

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    SubReal.SpinSubsystemMotor();
    SubReal.StopSubsystemMotor();
  }
  
}
