package app.yoss.boss.character.enums;

public enum Ability {
	STR("Strength"),
	CON("Constitution"),
	DEX("Dexterity"),
	INT("Intelligence"),
	WIS("Wisdom"),
	CHA("Charisma");
	
	private Ability(String name) {
		longName = name;
	}
	public String longName;
}
