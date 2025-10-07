// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

//Imports various things needed
package frc.robot.subsystems;

import static edu.wpi.first.units.Units.Volts;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SubsystemReal extends SubsystemBase {
  
  
  private TalonFX SubsystemMotor;
  //Creates assigned (not title) string for smartdashboard
  public String textPlaceholder = "I'm shi association east section 3 faust!";

  //creates states (array)
  public enum LauncherState {
  S_empty,S_filled,S_launching
}

  //Defines states
  public static LauncherState mLauncherState;

  //constructor
  public SubsystemReal() {
    SubsystemMotor = new TalonFX(1);
    mLauncherState = LauncherState.S_empty;
  }
  
  /*methods below*/

  public void SpinSubsystemMotor(){
    SubsystemMotor.setVoltage(4);
  }

  public void SpinSubsystemMotorFaster(){
    SubsystemMotor.setVoltage(12);
  }

  public void StopSubsystemMotor(){
    SubsystemMotor.setVoltage(0);
  }


  public void MoveSubsystemMotor(double speed){
    SubsystemMotor.setVoltage(speed * 12);
  }

  //switch case for checking machine's state
  public void runLauncherState(){
    switch (mLauncherState){
      case S_empty:
      SpinSubsystemMotor();
      break;
      case S_filled:
      StopSubsystemMotor();
      break;
      case S_launching:
      SpinSubsystemMotorFaster();
    }
  }

//Methods end here

  @Override
  public void periodic() {
   //puts section in smartdashboard and checks it with title "which id is..." using textplaceholder (im shi assoc...)
    SmartDashboard.putString("Which id is faust using?", textPlaceholder);
  //checks elevator state
   runLauncherState();
  }
}
