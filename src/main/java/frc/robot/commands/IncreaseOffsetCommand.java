package frc.robot.commands;
import frc.robot.Constants;
import edu.wpi.first.wpilibj2.command.InstantCommand;

public class IncreaseOffsetCommand extends InstantCommand {

  public double offset2;
  public double wheels2;

  public IncreaseOffsetCommand(double offset, double wheels) {

    offset2 = offset;
    wheels2 = wheels;
     
  }
 
  @Override
  public void initialize() {

    if (wheels2 == 1) {
         
      Constants.ADDITIVE_OFFSET_FRONT_LEFT = Constants.ADDITIVE_OFFSET_FRONT_LEFT + offset2;
      Constants.ADDITIVE_OFFSET_FRONT_RIGHT = Constants.ADDITIVE_OFFSET_FRONT_RIGHT + offset2;
      Constants.ADDITIVE_OFFSET_BACK_LEFT = Constants.ADDITIVE_OFFSET_BACK_LEFT + offset2;
      Constants.ADDITIVE_OFFSET_BACK_RIGHT = Constants.ADDITIVE_OFFSET_BACK_RIGHT + offset2;

    } else if (wheels2 == 2) {

      Constants.ADDITIVE_OFFSET_FRONT_LEFT = Constants.ADDITIVE_OFFSET_FRONT_LEFT + offset2;
      Constants.ADDITIVE_OFFSET_FRONT_RIGHT = Constants.ADDITIVE_OFFSET_FRONT_RIGHT + offset2;

    } else if (wheels2 == 3) {

      Constants.ADDITIVE_OFFSET_BACK_LEFT = Constants.ADDITIVE_OFFSET_BACK_LEFT + offset2;
      Constants.ADDITIVE_OFFSET_BACK_RIGHT = Constants.ADDITIVE_OFFSET_BACK_RIGHT + offset2;

    } else if (wheels2 == 4) {

      Constants.ADDITIVE_OFFSET_FRONT_LEFT = Constants.ADDITIVE_OFFSET_FRONT_LEFT + offset2;
      Constants.ADDITIVE_OFFSET_BACK_LEFT = Constants.ADDITIVE_OFFSET_FRONT_RIGHT + offset2;

    } else if (wheels2 == 5) {

      Constants.ADDITIVE_OFFSET_FRONT_RIGHT = Constants.ADDITIVE_OFFSET_FRONT_LEFT + offset2;
      Constants.ADDITIVE_OFFSET_BACK_RIGHT = Constants.ADDITIVE_OFFSET_FRONT_RIGHT + offset2;

    }

  }

}