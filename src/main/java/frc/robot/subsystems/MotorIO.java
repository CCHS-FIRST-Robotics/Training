package frc.robot.subsystems;

import edu.wpi.first.units.measure.*;
import org.littletonrobotics.junction.AutoLog;

public interface MotorIO {
    @AutoLog
    public static class MotorIOInputs {
        public double voltage;
        public double position;
    }

    public default void setVoltage(Voltage volts) {}

    public default void setPosition(Angle angle) {}

    public default void updateInputs(MotorIOInputs inputs) {}
}