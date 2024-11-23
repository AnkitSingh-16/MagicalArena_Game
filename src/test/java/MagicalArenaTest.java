import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class MagicalArenaTest {

    @Test
    public void testRunMatchWithPlayerAWinning() {
        Player playerA = new Player("Player A", 50, 5, 10);
        Player playerB = new Player("Player B", 30, 10, 5);

        MagicalArena.runMatch(playerA, playerB);
        assertTrue(playerA.isAlive());
        assertFalse(playerB.isAlive());
    }

    @Test
    public void testRunMatchWithPlayerBWinning() {
        Player playerA = new Player("Player A", 30, 5, 10);
        Player playerB = new Player("Player B", 100, 10, 15);

        MagicalArena.runMatch(playerA, playerB);
        assertFalse(playerA.isAlive());
        assertTrue(playerB.isAlive());
    }

    @Test
    public void testRunMatchWithEqualHealth() {
        Player playerA = new Player("Player A", 50, 5, 10);
        Player playerB = new Player("Player B", 50, 10, 5);

        MagicalArena.runMatch(playerA, playerB);
        assertTrue(playerA.isAlive() || playerB.isAlive()); // One player should win
        assertFalse(playerA.isAlive() && playerB.isAlive()); // Both cannot survive
    }

    @Test
    public void testRunMatchWithDefenderNeverTakingDamage() {
        Player playerA = new Player("Player A", 50, 1000, 1); // Very strong defense
        Player playerB = new Player("Player B", 100, 1, 1);   // Weak attack

        MagicalArena.runMatch(playerA, playerB);
        assertFalse(playerB.isAlive());
        assertTrue(playerA.isAlive());
    }
}
