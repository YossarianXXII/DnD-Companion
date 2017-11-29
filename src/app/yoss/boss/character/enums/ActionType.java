package app.yoss.boss.character.enums;

import javax.xml.bind.annotation.XmlEnum;

@XmlEnum
public enum ActionType {
	Standard("Standard Action"),
	Move("Move Action"),
	Minor("Minor Action"),
	Free("Free Action"),
	ImmediateReaction("Immediate Reaction"),
	ImmediateInterrupt("Immediate Interrupt"),
	Opportunity("Opportunity Action"),
	NoAction("No Action");
	
	public String longName;
	private ActionType(String in) {
		longName = in;
	}
}
