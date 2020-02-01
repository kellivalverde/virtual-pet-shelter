package org.wecancodeit;
//Mod 3: Virtual Pet Shelter

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	private Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();

	// find a pet - return a specific pet given it's name (pet descriptions?)

	//add an in-shelter || not in-shelter field in the map and gather in-maps (not in map = hidden)
	// add unique key (string pet ID number)
	
	public VirtualPet findPet(String petName) {
		return pets.get(petName);
	}

	// allow intakes (add pet)
	public void add(VirtualPet petToAdd) {
		pets.put(petToAdd.getPetName(), petToAdd);
	}

	// allow adoption(remove pet)
	public void remove(VirtualPet petToRemove) {
		pets.remove(petToRemove.getPetName(), petToRemove);
	}

	// play with one pet
	public int getBoredomForPet(String petToPlayWith) {
		VirtualPet playWithPet = pets.get(petToPlayWith); // calls to my VP class
		return playWithPet.getBoredom();

		// add if/else or switch/case activities

	}

	public void playWithPet(String petToPlayWith) {
		VirtualPet playWithPet = pets.get(petToPlayWith);
		playWithPet.play(); // calls play on VP

	}

	// get all pets - Roster
	public Collection<VirtualPet> getAllPets() {
		return pets.values();
		
		//change key from the pet's name to a number?
		// Could add keys for each pet so we could see past pets	
		// totalKeys++;
		// petKey = totalKeys();
	}

	// feed all pets
	public void feedAllPets() {
		for (VirtualPet hungryPet : getAllPets()) {
			hungryPet.feed();
		}
	}

	// water all pets
	public void waterAllPets() {
		for (VirtualPet thirstyPet : getAllPets()) {
			thirstyPet.giveWater();
		}
	}

	// clean up after all pets
	public void cleanAllPets() {
		for (VirtualPet poopyPet : getAllPets()) {
			poopyPet.cleanPoop();
		}
	}

	// ticks all pets
	public void tickAllPets() {
		for (VirtualPet shelterPet : getAllPets()) {
			shelterPet.tick();
		}

	}

}
