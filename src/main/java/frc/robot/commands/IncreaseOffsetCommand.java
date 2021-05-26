package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DrivetrainSubsystem;
import frc.robot.Constants;
import frc.robot.common.Vector2;
import frc.robot.common.Axis;

public class IncreaseOffsetCommand extends CommandBase {

    public double offset;

    public IncreaseOffsetCommand(double offset) {
        
    }

    @Override
    public void execute() {

        Constants.ADDITIVE_OFFSET = Constants.ADDITIVE_OFFSET + offset;
         
    }

    @Override
    public void end(boolean interrupted) {
         
    }
}