package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.Drivetrain;

public class AutonomousTime extends SequentialCommandGroup {
    public AutonomousTime(Drivetrain drivetrain) {
        addCommands(
            new DriveTime(drivetrain, -0.6, 2.0),
            new TurnTime(drivetrain, -0.5, 1.3),
            new DriveTime(drivetrain, -0.6, 2.0),
            new TurnTime(drivetrain, 0.5, 1.3));
    }
}
