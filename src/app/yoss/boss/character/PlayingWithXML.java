package app.yoss.boss.character;

import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import app.yoss.boss.character.enums.ActionType;

public class PlayingWithXML {
	public static void main(String[] args) throws Exception{
		
		PowerXMLList lei = new PowerXMLList();
		PowerXMLtest item1 = new PowerXMLtest();
		PowerXMLtest item2 = new PowerXMLtest();
		
		item1.name = "Hit and run";
		item1.description = "Move does not trigger opportunity attack.";
		item1.type = "Class";
		item1.action = ActionType.Standard;
		item1.source = new ArrayList<>();
		item1.source.add("Martial");
		item1.source.add("Weapon");
		
		item2.name = "Elven Accuracy";
		item2.description = "Reroll attack";
		lei.powers = new ArrayList<PowerXMLtest>();
		lei.powers.add(item1);
		lei.powers.add(item2);
		
		
		JAXBContext context = JAXBContext.newInstance(PowerXMLList.class);
		Marshaller marshall = context.createMarshaller();
		
		marshall.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		
		marshall.marshal(lei, System.out);
		
		
	}
}
