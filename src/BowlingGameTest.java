
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class BowlingGameTest {

    BowlingGame game = new BowlingGame();

    @Test
    public void queDesGoutieresDonne0Points() {
	rollMany(20, 0);
	assertEquals(0, game.getScore());
    }

    @Test
    public void uneSeuleQuille() {
	game.roll(1);
	rollMany(19, 0);
	assertEquals(1, game.getScore());
    }

    @Test
    public void bonusDuSpare() {
	game.roll(8);
	game.roll(2);
	game.roll(4);
	// game.roll(4);
	// le 3e lanc� vaut 2 fois sa valeur
	rollMany(17, 0);
	assertEquals(18, game.getScore());
    }

    @Test
    public void bonusDuStrick() {
	game.roll(10);
	game.roll(4);
	game.roll(3);
	// game.roll(4);
	// game.roll(3);
	rollMany(16, 0);
	assertEquals(24, game.getScore());
    }

    @Test
    public void bonusPartieParfaite() {
	rollMany(10, 30);

	/*
	 * game.roll(10); game.roll(10); game.roll(10); /rollMany()
	 */
	assertEquals(300, game.getScore());
    }

    private void rollMany(int indexTour, int nbQuilles) {
	for (int i = 0; i < indexTour; i++) {
	    game.roll(nbQuilles);
	}
    }

}
