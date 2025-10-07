// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class SubsystemLimbusGachaSlop extends SubsystemBase {

  public enum ShooterState {
  S_empty, S_filled, S_Launching
}
public static ShooterState mShooterState;

 private TalonFX LimbusMotor;
 
  public SubsystemLimbusGachaSlop() {
    LimbusMotor = new TalonFX(0);
    mShooterState = ShooterState.S_empty;
  }

public void MoveLimbusMotor(){
  LimbusMotor.setVoltage(4);
}
public void ShootLimbusMotor(){
  LimbusMotor.setVoltage(8);
}
public void StopLimbusMotor(){
  LimbusMotor.setVoltage(0);
}

  public void runShooterState(){
    switch (mShooterState) {
      case S_empty:
        MoveLimbusMotor();
        break;
      case S_filled:
        StopLimbusMotor();
        break;
        case S_Launching:
        ShootLimbusMotor();
        break;
    
  }
}


  @Override
  public void periodic() {
  runShooterState();
  }

}
//SubsytemLimbusGachaSlopStartNow
//YouGotNineBaseIdsAndOneTwoStar