package app.yoss.boss.character;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import app.yoss.boss.character.enums.ActionType;

@XmlRootElement(name = "PowerXMLtest")
@XmlAccessorType(XmlAccessType.FIELD)
public class PowerXMLtest {

	@XmlAttribute public String name;
	public String description;
	@XmlAttribute public String type;
	public List<String> source;
	public ActionType action;
	
	
}
