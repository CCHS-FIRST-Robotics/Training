package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.units.measure.*;
import org.littletonrobotics.junction.Logger;

public class Motor extends SubsystemBase{
    MotorIO io;
    MotorIOInputsAutoLogged inputs = new MotorIOInputsAutoLogged();

    public Motor(MotorIO io) {
        this.io = io;
    }

    public void setVoltage(Voltage volts) {
        io.setVoltage(volts);
    }

    public void setPosition(Angle angle) {
        io.setPosition(angle);
    }

    @Override
    public void periodic() {
        io.updateInputs(inputs);
        Logger.processInputs("motor", inputs);
    }
}