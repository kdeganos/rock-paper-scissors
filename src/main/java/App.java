import java.util.Map;
import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    // Boolean twoPlayerGameBool;

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/chooseGameType.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    // get("/pvp", (request, response) -> {
    //   Map<String, Object> model = new HashMap<String, Object>();
    //   model.put("template", "templates/pvp.vtl");
    //
    //   Boolean twoPlayerGameBool = true;
    //
    //   return new ModelAndView(model, layout);
    // }, new VelocityTemplateEngine());

    get("/game", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/game.vtl");

      Boolean twoPlayerGameBool = false;

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/winner", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/winner.vtl");
      Boolean twoPlayerGameBool = true;

      RockPaperScissors playRPS = new RockPaperScissors();
      String playerOneChoice = "rock";
      String playerTwoChoice = "scissors";
      if (twoPlayerGameBool == true) {
        //run two player game
        // playerTwoChoice = request.queryParams(userinput);
      } else {
        //run one player game.
        playerTwoChoice = playRPS.computerPlay();
      }
      Integer result = playRPS.checkWinner(playerOneChoice, playerTwoChoice);
      String announcement = playRPS.announceResults(result);

      model.put("announcement", announcement);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
    // RockPaperScissors playRockPaperScissors = new RockPaperScissors();
    // playRockPaperScissors.announceResults(playRockPaperScissors.checkWinner("rock", playRockPaperScissors.computerPlay())); //my god that's ugly
  }
}
