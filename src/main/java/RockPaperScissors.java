import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class RockPaperScissors {

  public static Integer checkWinner(String choiceP1, String choiceP2) {
    // String[] choicesArray = {choiceP1, choiceP2};

    //IMPORTANT:
    // P1 win = 0, P2 win = 1, tie = 2
    // feed this into an array
    // if (choiceP1.equals(choiceP2))
    Integer result = 2;
    if (choiceP1.equals("rock")) {
        if (choiceP2.equals("scissors")) {
          result = 0;
        } else if (choiceP2.equals("paper")) {
          result =  1;
        }

    } else if (choiceP1.equals("scissors")) {
        if (choiceP2.equals("paper")) {
          result =  0;
        } else if (choiceP2.equals("rock")) {
          result =  1;
        }

    } else if (choiceP1.equals("paper")) {
        if (choiceP2.equals("rock")) {
          result =  0;
        } else if (choiceP2.equals("scissors")) {
          result =  1;
        }
    }
    return result;
  }
}
