package main.start.code.characters.pc;

import main.start.code.characters.GameCharacter;

//Diese Klasse verfeinert die Blaupause von GameCharacter zu einer für spielbare Charaktere
public abstract class PlayableCharacter extends GameCharacter {

	// Auflistung der Items
	// ArrayList<Items> = new ArrayList<>;
	// Wert wie viel der Charakter tragen kann
	private int strength;
	// WIP
	// Nicht referenziert= nicht equiped
	// Helmet h = null;
	// Referenziert = equiped
	// Glove g = new Glove();

	// Der Konstruktor gibt die Parameter durch super() an den Konstrukter von
	// GameCharacter weiter
	public PlayableCharacter(int maxHP, int maxMana, String name, int ad, int ap, int dex, int strength,String race) {
		super(maxHP, maxMana, name, ad, ap, dex);
		this.strength = strength;
		switch (race) {
		case "elf":
			this.setAd(this.getAd()-1);
			this.setAp(this.getAp()+1);
			this.setDex(6);
			this.setStrength(4);
			break;
		case "orc":
			this.setAd(getAd()+1);
			this.setDex(4);
			this.setStrength(6);
			break;
		case "human":
			this.setDex(6);
			this.setStrength(5);
			break;}
	}

	// Diese, nicht ausgeführten Methoden müssen von alle Klassen, die diese Klasse
	// ableiten implementiert und ausgeführt werden
	public abstract int basicAttack();

	public abstract int abilityOne();

	public abstract int abilityTwo();

	public abstract int abilityThree();

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

}
