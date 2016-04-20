import java.util.ArrayList;
import java.util.Arrays;
import org.junit.*;
import static org.junit.Assert.*;

public class RockPaperScissorsTest {

  @Test
  public void checkWinner_rockBeatsScissors_0() {
    RockPaperScissors testGame = new RockPaperScissors();
    Integer result = 0;
    assertEquals(result, testGame.checkWinner("rock", "scissors"));
  }

  @Test
  public void checkWinner_scissorsBeatsPaper_0() {
    RockPaperScissors testGame = new RockPaperScissors();
    Integer result = 0;
    assertEquals(result, testGame.checkWinner("scissors", "paper"));
  }

  @Test
  public void checkWinner_scissorsTie_2() {
    RockPaperScissors testGame = new RockPaperScissors();
    Integer result = 2;
    assertEquals(result, testGame.checkWinner("scissors", "scissors"));
  }

  @Test
  public void announceResults_P1Win_PlayerOneWins() {
    RockPaperScissors testGame = new RockPaperScissors();
    String finalResult = "Player One Wins!";
    assertEquals(finalResult, testGame.announceResults(0));
  }
  @Test
  public void announceResults_P2Win_PlayerTwoWins() {
    RockPaperScissors testGame = new RockPaperScissors();
    String finalResult = "Player Two Wins!";
    assertEquals(finalResult, testGame.announceResults(1));
  }
  @Test
  public void computerPlay_shouldBeAString_true() {
    RockPaperScissors testGame = new RockPaperScissors();
    String computerChoice = testGame.computerPlay();
    assertEquals(true, computerChoice instanceof String);
  }
}
