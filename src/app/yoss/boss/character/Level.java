package app.yoss.boss.character;

public class Level {
	private final static int[] level = {0,
	1000,
	2250,
	3750,
	5500,
	7500,
	10000,
	13000,
	16500,
	20500,
	26000,
	32000,
	39000,
	47000,
	57000,
	69000,
	83000,
	99000,
	119000,
	143000,
	175000,
	210000,
	255000,
	310000,
	375000,
	450000,
	550000,
	675000,
	825000,
	1000000};
	
	public static int countLevel(int experience) {
		if(experience < 1000000) {
			for(int i = 1; i<level.length; i++) {
				if(experience < level[i] && experience >= level[i-1] ) return i;				
			}
		}
		else return 30;
		return 0;
		
	}	

}
