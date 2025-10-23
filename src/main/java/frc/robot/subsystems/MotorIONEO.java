package frc.robot.subsystems;

import static edu.wpi.first.units.Units.*;

import com.revrobotics.spark.*;
import com.revrobotics.spark.SparkLowLevel.*;
import edu.wpi.first.units.measure.*;

public class MotorIONEO implements MotorIO{
    SparkMax motor;

    public MotorIONEO(int id){
        motor = new SparkMax(id, MotorType.kBrushless);
    }

    public void setVoltage(Voltage volts){
        motor.setVoltage(volts.in(Volts));
    }

    public void setPosition(Angle angle){
        
    }

    public void updateInputs(MotorIOInputs inputs){
        
    }
}