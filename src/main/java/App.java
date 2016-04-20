import java.util.Map;
import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/chooseGameType.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/pvp", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/pvp.vtl");

      RockPaperScissors twoPlayerRockPaperScissors = new RockPaperScissors();

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/pve", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/pve.vtl");

      RockPaperScissors onePlayerRockPaperScissors = new RockPaperScissors();

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/winner", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/winner.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
    // RockPaperScissors playRockPaperScissors = new RockPaperScissors();
    // playRockPaperScissors.announceResults(playRockPaperScissors.checkWinner("rock", playRockPaperScissors.computerPlay())); //my god that's ugly
  }
}
