package frc.robot;

import edu.wpi.first.wpilibj2.command.*;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.*;
import frc.robot.subsystems.*;
import frc.robot.common.Rotation2;
import frc.robot.common.Axis;
import frc.robot.common.XboxController;
import edu.wpi.first.wpilibj.Joystick;
import frc.robot.commands.IncreaseOffsetCommand;
import edu.wpi.first.wpilibj2.command.button.Button;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class RobotContainer {
    public static XboxController primaryController = new XboxController(Constants.PRIMARY_CONTROLLER_PORT);

    private final DrivetrainSubsystem drivetrainSubsystem = new DrivetrainSubsystem();

    public RobotContainer() {
        primaryController.getLeftXAxis().setInverted(true);
        primaryController.getRightXAxis().setInverted(true);

        CommandScheduler.getInstance().setDefaultCommand(drivetrainSubsystem, new DriveCommand(drivetrainSubsystem, getDriveForwardAxis(), getDriveStrafeAxis(), getDriveRotationAxis()));

        configureButtonBindings();
    }

    public Command GenerateOffsetCommand(double targetoffset, double wheels) {

        Command m_GenerateOffsetCommand = new IncreaseOffsetCommand(targetoffset, wheels);

        return m_GenerateOffsetCommand;

    }

    private void configureButtonBindings() {

        primaryController.getBackButton().whenPressed(
                () -> drivetrainSubsystem.resetGyroAngle(Rotation2.ZERO)
        );
        primaryController.getStartButton().whenPressed(
                drivetrainSubsystem::resetWheelAngles
        );
        primaryController.getAButton().whenPressed(GenerateOffsetCommand(15, 1));

    }

    // Wheel Values, 1 = All, 2 = Front, 3 = Back, 4 = Left, 5 = Right


    private Axis getDriveForwardAxis() {
        return primaryController.getLeftYAxis();
    }

    private Axis getDriveStrafeAxis() {
        return primaryController.getLeftXAxis();
    }

    private Axis getDriveRotationAxis() {
        return primaryController.getRightXAxis();
    }

    public DrivetrainSubsystem getDrivetrainSubsystem() {
        return drivetrainSubsystem;
    }

    public XboxController getPrimaryController() {
        return primaryController;
    }
}