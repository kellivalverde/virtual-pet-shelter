package org.wecancodeit;

import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	private Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();

	public int getHungerForAll() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void giveWaterAll() {

	}

	public int getThirstAll() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void petRoster() {

		System.out.println("The pets are " + pets);
	}

	public void add(VirtualPet petToAdd) {
		pets.put(petToAdd.getPetName(), petToAdd);
	}

	public VirtualPet findPet(String petName) {

		return pets.get(petName);
	}
}
