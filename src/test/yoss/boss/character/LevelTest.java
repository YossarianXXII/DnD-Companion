package test.yoss.boss.character;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import app.yoss.boss.character.Level;

class LevelTest {

	@Test
	void testCountLevel() {
		assertEquals(1, Level.countLevel(250));
		assertEquals(1, Level.countLevel(999));
		assertEquals(2, Level.countLevel(1000));
		assertEquals(9, Level.countLevel(16500));
		assertEquals(16, Level.countLevel(69000));
		assertEquals(24, Level.countLevel(310000));
		assertEquals(30, Level.countLevel(1000000));
		assertEquals(30, Level.countLevel(1000250));		
		
	}

}
