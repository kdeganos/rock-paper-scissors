import java.util.ArrayList;
import java.util.Arrays;
import org.junit.*;
import static org.junit.Assert.*;

public class RockPaperScissorsTest {

  @Test
  public void checkWinner_rockBeatsScissors_true() {
    RockPaperScissors testGame = new RockPaperScissors();
    Integer result = 0;
    assertEquals(result, testGame.checkWinner("rock", "scissors"));
  }

  @Test
  public void checkWinner_scissorsBeatsPaper_true() {
    RockPaperScissors testGame = new RockPaperScissors();
    Integer result = 0;
    assertEquals(result, testGame.checkWinner("scissors", "paper"));
  }

  @Test
  public void checkWinner_scissorsTie_true() {
    RockPaperScissors testGame = new RockPaperScissors();
    Integer result = 2;
    assertEquals(result, testGame.checkWinner("scissors", "scissors"));
  }
}
