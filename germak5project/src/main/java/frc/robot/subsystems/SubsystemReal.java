// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
//subsystemreal
package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SubsystemReal extends SubsystemBase {
    
  private TalonFX SubsystemMotor;

  public SubsystemReal() {
    SubsystemMotor = new TalonFX(1);
  }

  public void SpinSubsystemMotor(){
    SubsystemMotor.setVoltage(4);
  }

  public void StopSubsystemMotor(){
    SubsystemMotor.setVoltage(0);
  }

  public void MoveSubsystemMotor(double speed){
    SubsystemMotor.setVoltage(speed * 12);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
