package frc.robot.common;

public interface Interpolable<T> {
    T interpolate(T other, double t);
}