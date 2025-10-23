package frc.robot.subsystems;

import static edu.wpi.first.units.Units.*;

import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.units.measure.*;

public class MotorIOKraken implements MotorIO{
    TalonFX motor;

    public MotorIOKraken(int id){
        motor = new TalonFX(id);
    }

    public void setVoltage(Voltage volts){
        motor.setVoltage(volts.in(Volts));
    }

    public void setPosition(Angle angle){
        
    }

    public void updateInputs(MotorIOInputs inputs){
        
    }
}