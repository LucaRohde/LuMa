package main.start.code.characters;

//Benennung zu GameCharacter damit kein Fehler wegen Character von java
//Diese abstrakte Klasse dient als eine Art Blaupause für alle Charaktere, die erstellt werden
public abstract class GameCharacter {

	// maximale Lebenspunkte
	private int maxHP;
	// maximale Manapunkte
	private int maxMana;
	// momentane Lebenspunkte
	private int hp;
	// momentane Manapukte
	private int mana;
	// momentane Angriffssärke
	private int ad;
	// momentane Zauberstärke
	private int ap;
	// name des Charakters
	private String name;
	// Geschwindigkeit des Charakters
	private int dex;

	// Im Konstruktor werden die Attribute werde initialisiert
	public GameCharacter(int maxHP, int maxMana, String name, int ad, int ap, int dex) {
		this.maxHP = maxHP;
		this.maxMana = maxMana;
		this.hp = maxHP;
		this.mana = maxMana;
		this.ad = ad;
		this.ap = ap;
		this.name = name;
		this.dex = dex;

	}

	//getter und setter der Attribute
	
	public int getMaxHp() {
		return maxHP;
	}

	public void setMaxHp(int maxHP) {
		this.maxHP = maxHP;
	}

	public int getMaxMana() {
		return maxMana;
	}

	public void setMaxMana(int maxMana) {
		this.maxMana = maxMana;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getAd() {
		return ad;
	}

	public void setAd(int ad) {
		this.ad = ad;
	}

	public int getAp() {
		return ap;
	}

	public void setAp(int ap) {
		this.ap = ap;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDex() {
		return dex;
	}

	public void setDex(int dex) {
		this.dex = dex;
	}

}
