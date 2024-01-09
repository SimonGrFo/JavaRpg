package Test;

import com.SimonGForsgren.oop.Entities.Player;
import com.SimonGForsgren.oop.Logic.BasicLogic;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BasicLogicTest {

    //TODO TEST TO CHECK IF PLAYER CAN LEVEL UP
    //TODO TEST TO SEE IF PLAYER DOES AS MUCH DAMAGE AS HE CAN DO

    @Test
    public void testPlayerDied() {
        BasicLogic.isRunning = true;
        BasicLogic.PlayerDied();
        assertFalse(BasicLogic.isRunning, "Game should stop running when player dies");
    }

    @Test
    public void testPlayerDiedInCombat() {
        BasicLogic.isRunning = true;
        Player player = new Player("TestPlayer");
        BasicLogic.PlayerDied();
        assertFalse(BasicLogic.isRunning, "Game should stop running when player dies in combat");
    }

    // Helper method to capture console output for testing
    private String getOutput() {
        return ""; // Implement capturing console output here
    }
}