package org.wecancodeit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VirtualPetShelterTest {

//arrange 

	private VirtualPetShelter underTest; // calling default constructor of VPS
	private VirtualPet pet1;
	private VirtualPet pet2;

	@Before
	public void setUp() { // method that sets up project so you can have objects for your test
		underTest = new VirtualPetShelter();
		pet1 = new VirtualPet("MeiLing", "the big fluffy cat", 0, 0, 0, 2);
		pet2 = new VirtualPet("Rigby", "the sleek black cat", 3, 0, 0, 0);

	}

	@Test
	public void shouldBeAbleToAddAPet() {
		underTest.add(pet1);
		underTest.add(pet2);
		VirtualPet retrievedAccount = underTest.findPet("MeiLing");
		assertThat(retrievedAccount, is(pet1));

	}

//feed all pets
	// @Test

//	public void shouldResetHungerTo0AfterFeedAllPets() {
////act	
//		int beforeFeedAll = underTest.getHungerForAll();
//		underTest.feedAll(); // void - just eats
//		int result = underTest.getHungerForAll();
//		// assert
//		assertEquals(beforeFeedAll - 1, result);
//	}

	// water all pets

	// play with one pet - takes a name

	// calls tick() method after each loop - all stats increase

	// allow adoption (remove pet)

	// allow intakes (add pet)

	// should return a specific pet given it's name (pet descriptions?)

	// should return a collection of all the pets in the shelter

};