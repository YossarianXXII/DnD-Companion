package app.yoss.boss.character;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "PowerXMLList")
@XmlAccessorType(XmlAccessType.FIELD)
public class PowerXMLList {
	@XmlElement(name="PowerXMLtest")
	public List<PowerXMLtest> powers = null;
}
