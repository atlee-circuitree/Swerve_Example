package frc.robot.subsystems;

import frc.robot.common.Vector2;

@Deprecated
public abstract class HolonomicDrivetrain extends Drivetrain {

    public final void holonomicDrive(Vector2 translation, double rotation) {
        holonomicDrive(translation, rotation, false);
    }

    public abstract void holonomicDrive(Vector2 translation, double rotation, boolean fieldOriented);
}