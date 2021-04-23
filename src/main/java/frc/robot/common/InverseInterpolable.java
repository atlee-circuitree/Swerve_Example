package frc.robot.common;

public interface InverseInterpolable<T> {
    double inverseInterpolate(T upper, T query);
}