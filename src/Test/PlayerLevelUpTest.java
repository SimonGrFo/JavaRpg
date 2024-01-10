package Test;

import com.SimonGForsgren.oop.Entities.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerLevelUpTest {

    @Test

    //player level up test

    public void testPlayerLevelUp() {
        Player player = new Player("TestPlayer", 100, 0, 0);

        player.xp = 30; // xp to level up is 30

        player.levelUp();

        assertEquals(1, player.level, "Player should level up when XP reaches or exceeds 30");
    }
}