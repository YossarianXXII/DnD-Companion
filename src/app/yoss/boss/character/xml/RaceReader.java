package app.yoss.boss.character.xml;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import app.yoss.boss.character.Race;
import app.yoss.boss.character.enums.Ability;
import app.yoss.boss.character.enums.Language;
import app.yoss.boss.character.enums.Skill;
import app.yoss.boss.character.enums.Vision;

public class RaceReader extends XMLReader {

	public RaceReader(String path) {
		super(path);

	}

	public List<Race> getAsList() {
		NodeList nodes = xmlDoc.getElementsByTagName("RaceItem");
		List<Race> races = new ArrayList<>();
		for (int i = 0; i < nodes.getLength(); i++) {
			Node iNode = nodes.item(i);
			Race r = new Race();
			Element e = (Element) iNode;
			
			r.name = e.getElementsByTagName("Name").item(0).getTextContent();
			r.book = e.getElementsByTagName("Book").item(0).getTextContent();
			String language = e.getElementsByTagName("Language").item(0).getTextContent();
			String ability = e.getElementsByTagName("AbilityDefault").item(0).getTextContent();
			for (int j = 0; j <= e.getElementsByTagName("AbilityAdditional").getLength()-1; j++) {
				String result = e.getElementsByTagName("AbilityAdditional").item(j).getTextContent();
				r.optionalAbility.add( Ability.valueOf(result));
			}

			for (int k = 0; k <= e.getElementsByTagName("RacialPower").getLength()-1; k++) {
				String result = e.getElementsByTagName("RacialPower").item(k).getTextContent();
//				r.powers.add(  );
			}
			

			for (int l = 0; l <= e.getElementsByTagName("WeaponProfficiency").getLength()-1; l++) {
				String result = e.getElementsByTagName("WeaponProfficiency").item(l).getTextContent();
				r.weapons.add(result );
			}
			for (int m = 0; m <= e.getElementsByTagName("RacialFeature").getLength()-1; m++) {
				String result = e.getElementsByTagName("RacialFeature").item(m).getTextContent();
				r.feats.add(result );
			}
			for (int n = 0; n <= e.getElementsByTagName("Skill").getLength()-1; n++) {
				String result = e.getElementsByTagName("Skill").item(n).getTextContent();
				r.enhancedSkill.add(Skill.valueOf(result) );
			}

			String speed = e.getElementsByTagName("Speed").item(0).getTextContent();
			String vision = e.getElementsByTagName("Vision").item(0).getTextContent();

			r.secondLanguage = Language.valueOf(language);
			r.standardAbility = Ability.valueOf(ability);

			r.speed = Integer.valueOf(speed);
			r.vision = Vision.valueOf(vision);
			
			
			
			
			

			races.add(r);

		}

		return races;

	}

}
