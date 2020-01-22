package org.wecancodeit;
//homework - for Mod 3 Pet Shelter
public class VirtualPet {

	private int hunger = 0; // baby bear
	private int thirst = 0;
	private int boredom = 0;
	private int poop = 0;
	private String petName;
	private String petDescription;

	

	public VirtualPet(String petName) {
		this.petName = petName;
	}
	
	
	public VirtualPet(String petNameParameter, String petDescriptionParameter) {
		this.petName = petNameParameter;
		this.petDescription = petDescriptionParameter;

	}

	public VirtualPet(String petNameParameter, String petDescriptionParameter, int hungerPar, int thirstPar, int boredomPar, int poopPar) {
		this.petName = petNameParameter;
		this.petDescription = petDescriptionParameter;
		this.hunger = hungerPar;
		this.thirst = thirstPar;
		this.boredom = boredomPar;
		this.poop = poopPar;
	}
	
	
	// getters

	public String getPetName() {
		return this.petName;
	}

	public String getPetDescription() {
		return this.petDescription;
	}

	

	// food
	public int getHunger() {
		return hunger;
	}

	public void feed() {
		hunger = 0;
		poop++;
	}

	// thirst
	public int getThirst() {
		return thirst;
	}

	public void giveWater() {
		thirst = 0;
	}

	// poop level
	public int getPoop() {
		return poop;
	}

	public void cleanPoop() {
		poop = 0;
	}

	// boredom
	public int getBoredom() {
		return boredom;
	}

	public void play() {
		boredom = -1;
		thirst++;
	}

	// tick() method
	public void tick() {
		hunger++;
		thirst++;
		poop++;
		boredom++;
	}

}
