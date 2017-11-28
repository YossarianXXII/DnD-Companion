package app.yoss.boss.character;

import java.util.ArrayList;
import java.util.List;

import app.yoss.boss.character.enums.Ability;
import app.yoss.boss.character.enums.Language;
import app.yoss.boss.character.enums.Skill;
import app.yoss.boss.character.enums.Vision;

public class Race {

	public String name;
	public String book;
	public Ability standardAbility;
	public List<Ability> optionalAbility;
	public int speed;
	public List<Skill> enhancedSkill;
	public Language secondLanguage;
	public Vision vision;
	public List<Power> powers;
	public List<String> weapons;
	public List<String> feats;

	public Race() {
		optionalAbility = new ArrayList<>();
		enhancedSkill = new ArrayList<>();
		powers = new ArrayList<>();
		weapons = new ArrayList<>();
		feats = new ArrayList<>();
	}

	public void displayAsString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%-10s%-10s\n", name, book))
				.append(String.format("Speed:%2d\tVision:%12s\n", speed, vision))
				.append(String.format("Language: Common,%-10s\n", secondLanguage))
				.append(String.format("Ability: +2 to %s, ", standardAbility.longName));

		sb.append(optionalAbility);
		sb.append("\n+2 to ");
		sb.append(enhancedSkill);
		sb.append("\nRacial powers: ");
		sb.append(powers);
		sb.append("\nWeapon profficiencies: ");
		sb.append(weapons);
		sb.append("\nRacial features: ");
		sb.append(feats);
		sb.append("\n");
		System.out.print(sb.toString());

	}
}
