// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SubsystemLimbusGachaSlop extends SubsystemBase {
 private TalonFX LimbusMotor;
  public SubsystemLimbusGachaSlop() {
    LimbusMotor = new TalonFX(0);
  }

public void MoveLimbusMotor(){
  LimbusMotor.setVoltage(4);
}

public void StopLimbusMotor(){
  LimbusMotor.setVoltage(0);
}

  @Override
  public void periodic() {
  //ThisDoesSomething
  }
}

//SubsytemLimbusGachaSlopStartNow
//YouGotNineBaseIdsAndOneTwoStar