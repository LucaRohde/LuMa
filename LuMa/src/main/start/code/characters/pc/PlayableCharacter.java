package main.start.code.characters.pc;

import main.start.code.characters.GameCharacter;

//Diese Klasse verfeinert die Blaupause von GameCharacter zu einer für spielbare Charaktere
public abstract class PlayableCharacter extends GameCharacter{

	//Auflistung der Items
	//ArrayList<Items> = new ArrayList<>;
	//Wert wie viel der Charakter tragen kann
	int strength;
	//WIP
	//Nicht referenziert= nicht equiped
	//Helmet h = null;
	//Referenziert = equiped
	//Glove g = new Glove();
	
	
	//Der Konstruktor gibt die Parameter durch super() an den Konstrukter von GameCharacter weiter
	public PlayableCharacter(int maxHP, int maxMana, String name, int ad, int ap, int dex, int strength) {
		super(maxHP,maxMana,name,ad,ap,dex);
		this.strength = strength;
	}

	
	//Diese, nicht ausgeführten Methoden müssen von alle Klassen, die diese Klasse ableiten implementiert und ausgeführt werden
	public abstract int basicAttack();
	public abstract int abilityOne();
	public abstract int abilityTwo();
	public abstract int abilityThree();
	
}
