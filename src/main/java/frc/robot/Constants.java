package frc.robot;

public class Constants {

    public static double ADDITIVE_OFFSET = 0;
    public static double ADDITIVE_OFFSET_FRONT_LEFT = 0;
    public static double ADDITIVE_OFFSET_FRONT_RIGHT = 0;
    public static double ADDITIVE_OFFSET_BACK_LEFT = 0;
    public static double ADDITIVE_OFFSET_BACK_RIGHT = 0;


    public static final int DRIVETRAIN_FRONT_LEFT_DRIVE_MOTOR = 4;
    public static final int DRIVETRAIN_FRONT_RIGHT_DRIVE_MOTOR = 2;
    public static final int DRIVETRAIN_BACK_LEFT_DRIVE_MOTOR = 6;
    public static final int DRIVETRAIN_BACK_RIGHT_DRIVE_MOTOR = 8;

    public static final int DRIVETRAIN_FRONT_LEFT_ANGLE_MOTOR = 3;
    public static final int DRIVETRAIN_FRONT_RIGHT_ANGLE_MOTOR = 1;
    public static final int DRIVETRAIN_BACK_LEFT_ANGLE_MOTOR = 5;
    public static final int DRIVETRAIN_BACK_RIGHT_ANGLE_MOTOR = 7;

    public static final int DRIVETRAIN_FRONT_LEFT_ENCODER_PORT = 9;
    public static final int DRIVETRAIN_FRONT_RIGHT_ENCODER_PORT = 10;
    public static final int DRIVETRAIN_BACK_LEFT_ENCODER_PORT = 11;
    public static final int DRIVETRAIN_BACK_RIGHT_ENCODER_PORT = 12;

    public static final int PIGEON_PORT = 51;

    // In degrees
    public static final double DRIVETRAIN_FRONT_LEFT_ENCODER_OFFSET = Math.toRadians(0.0 + ADDITIVE_OFFSET_FRONT_LEFT);
    public static final double DRIVETRAIN_FRONT_RIGHT_ENCODER_OFFSET = Math.toRadians(0.0 + ADDITIVE_OFFSET_FRONT_RIGHT);
    public static final double DRIVETRAIN_BACK_LEFT_ENCODER_OFFSET = Math.toRadians(0.0 + ADDITIVE_OFFSET_BACK_LEFT);
    public static final double DRIVETRAIN_BACK_RIGHT_ENCODER_OFFSET = Math.toRadians(0.0 + ADDITIVE_OFFSET_BACK_RIGHT);

    public static final int PRIMARY_CONTROLLER_PORT = 0;

    public static final int BUTTON_PORT_A = 1;
    public static final int BUTTON_PORT_B = 2;
    public static final int BUTTON_PORT_X = 3;
    public static final int BUTTON_PORT_Y = 4;

}