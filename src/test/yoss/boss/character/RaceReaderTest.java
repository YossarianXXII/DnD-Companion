package test.yoss.boss.character;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import app.yoss.boss.character.Race;
import app.yoss.boss.character.xml.RaceReader;

class RaceReaderTest {

	@Test
	void test() {
		RaceReader r = new RaceReader("./data/RaceList.xml");
		for(Race e: r.getAsList()) {
			e.displayAsString();
		}
		assertEquals("Race", r.getAsList());
		
	}

}
