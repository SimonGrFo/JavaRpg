package Test;

import com.SimonGForsgren.oop.Entities.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    public void testPlayerAttackDamage() {

        Player player = new Player("TestPlayer", 100, 0, 0);

        int attackDamage = player.attack();

        int expectedDamage = (int) (player.xp / 10 + 10);
        assertEquals(expectedDamage, attackDamage, "Player should deal the correct amount of damage");
    }
}
