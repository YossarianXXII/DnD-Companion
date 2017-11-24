package test.yoss.boss.character;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import app.yoss.boss.character.Character;

class CharacterTest {

	@Test
	void testDisplayString() {
		String result = "Hanzo     Parmeni   Elf       Ranger      2   1250";
		
		Character hanzo = new Character("Hanzo", "Michal", "Parmeni", 1250);
		
		assertEquals(result, hanzo.displayString());

	}

}
