import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class PlayerTest {

    @Test
    public void testPlayerInitialization() {
        Player player = new Player("TestPlayer", 100, 10, 20);
        assertEquals("TestPlayer", player.getName());
        assertEquals(100, player.getHealth());
        assertEquals(10, player.getSrength());
        assertEquals(20, player.getAttack());
    }

    @Test
    public void testReduceHealth() {
        Player player = new Player("TestPlayer", 100, 10, 20);
        player.reduceHealth(30);
        assertEquals(70, player.getHealth());
        player.reduceHealth(80); // Health should not go below 0
        assertEquals(0, player.getHealth());
    }

    @Test
    public void testIsAlive() {
        Player player = new Player("TestPlayer", 100, 10, 20);
        assertTrue(player.isAlive());
        player.reduceHealth(100);
        assertFalse(player.isAlive());
    }

    @Test
    public void testRollDice() {
        Player player = new Player("TestPlayer", 100, 10, 20);
        for (int i = 0; i < 100; i++) { // Test multiple rolls to ensure range is correct
            int diceRoll = player.rollDice();
            assertTrue(diceRoll >= 1 && diceRoll <= 6);
        }
    }

    @Test
    public void testCalculateAttackDamage() {
        Player player = new Player("TestPlayer", 100, 10, 20);
        int attackDamage = player.calculateAttackDamage(4);
        assertEquals(80, attackDamage); // Attack = 20 * 4
    }

    @Test
    public void testCalculateDefenseStrength() {
        Player player = new Player("TestPlayer", 100, 10, 20);
        int defenseStrength = player.calculateDefenseStrength(3);
        assertEquals(30, defenseStrength); // Strength = 10 * 3
    }
}
