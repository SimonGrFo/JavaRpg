package Test;

import com.SimonGForsgren.oop.Entities.Player;
import com.SimonGForsgren.oop.Logic.BasicLogic;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BasicLogicDeathTest {

    @Test

    // Player death test

    public void testPlayerDied() {

        BasicLogic.isRunning = true;

        BasicLogic.PlayerDied();

        assertFalse(BasicLogic.isRunning, "Game should stop running when player dies");
    }

}