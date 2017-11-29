package app.yoss.boss.character;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import app.yoss.boss.character.enums.ActionType;
import app.yoss.boss.character.enums.Attack;
import app.yoss.boss.character.enums.UsageType;

@XmlRootElement(name = "Power")
@XmlAccessorType(XmlAccessType.FIELD)
public class Power {

	
	@XmlAttribute public String name;		
	@XmlAttribute public String type;	
	@XmlAttribute public String charClass;
	@XmlAttribute public int level;
	
	public UsageType usage;  //At-Will/Encounter/Daily
	public ActionType action;  //Standard/Minor/...
	
	public List<String> source;  //Martial, Elemental, Psionic...
	
	public String target; //One creature/one enemy...
	public String area;  //Melee, Ranged, Close burst...
	
	public List <Attack> attack;  // STR vs AC, DEX vs AC, Int vs Reflex ...
	
	
	public String requirement;
	public String trigger;
	
	
	public String hit;
	public String effect;

}
