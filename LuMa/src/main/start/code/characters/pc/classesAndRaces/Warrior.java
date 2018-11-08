package main.start.code.characters.pc.classesAndRaces;

import main.start.code.characters.pc.PlayableCharacter;

public class Warrior extends PlayableCharacter {

	//In dem Konstruktor werden erst anhand der Klasse Werte bestimmt und danach durch die Rasse justiert (in playable character)
	public Warrior(String name, String race) {
		super(12,6,name,4,1,0,0,race);
		
			
		
	}

	@Override
	public int basicAttack() {
		// TODO Auto-generated method stub
		return this.getAd();
	}

	@Override
	public int abilityOne() {
//WIP Verstärkter Schlag Prüfung ob Mana abgezogen werden kann in Util klasse
		this.setMana(getMana()-3);
		return this.getAd()+3;
	}

	@Override
	public int abilityTwo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int abilityThree() {
		// TODO Auto-generated method stub
		return 0;
	}

}
