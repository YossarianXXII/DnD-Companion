package app.yoss.boss.character.enums;

public enum UsageType {
	AtWill("At-Will"),
	Encounter("Encounter"),
	Daily("Daily");
	
	public String longName;
	private UsageType(String in) {
		longName = in;
	}
}
