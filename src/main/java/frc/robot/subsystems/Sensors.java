// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Sensors extends SubsystemBase {
  private AnalogInput rangefinder = new AnalogInput(2);
  /** Creates a new Sensors. */
  public Sensors() {}

  public double getDistanceinches(){
    return rangefinder.getValue()*0.0386 + 0.2;
  }


  @Override
  public void periodic() {
    SmartDashboard.putNumber("Distanceinches", rangefinder.getValue()*0.0386 + 0.2);
    SmartDashboard.putNumber("RangeFinderValue", rangefinder.getValue());
    // This method will be called once per scheduler run
  }
  
}
