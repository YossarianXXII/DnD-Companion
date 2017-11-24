package app.yoss.boss.character;

public class Character {
	public String name;
	public String playerName;
	public String party;
	
	public Race race;
	public CharacterClass charClass;
	
	public int level;
	public int experience;
	
	public AbilityScores score;
	public DefenseScores defense;
	
	public HealthSpace health;
	
	public Skills skills;
	
	
	
	
	public Character(String name, String playerName, String party, int experience) {
		
		this.name = name;
		this.playerName = playerName;
		this.party = party;
		this.experience = experience;
		this.level = Level.countLevel(experience);
		this.charClass = new CharacterClass("Ranger");
		this.race = new Race("Elf");
		
	}




	public String displayString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%-10s%-10s%-10s%-10s%3d%7d", name, party, race.getName(), charClass.getName(), level, experience));
		
		
		return sb.toString();
	}
	
}
