package org.wecancodeit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualPetTest {
//homework - for Mod 3 Pet Shelter

	VirtualPet underTest = new VirtualPet(null); // calling default constructor

	@Test
	public void hungerShouldBe0AtStart() {
		// act
		int result = underTest.getHunger(); // makes a method in VP2 class
		// assert
		assertEquals(0, result);
	}

	@Test
	public void hungerShouldDecreaseToZeroAfterFeed() {
		// act
		int beforeFeed = underTest.getHunger();
		underTest.feed(); // void - just eats
		int result = underTest.getHunger();
		// assert
		assertEquals(beforeFeed == 0, result);

	}

	@Test
	public void thirstShouldBe0AtStart() {

		// act
		int result = underTest.getThirst(); // makes a method in VP2 class

		// assert
		assertEquals(0, result);

	}

	@Test
	public void thirstShouldDecreaseBy1AfterGiveWater() {
		// act

		int beforeGiveWater = underTest.getThirst();
		underTest.giveWater(); // void - just eats
		int result = underTest.getThirst();
		// assert
		assertEquals(beforeGiveWater - 1, result);

	}

	@Test
	public void boredomShouldBe0AtStart() {

		// act
		int result = underTest.getBoredom(); // makes a method in VP2 class

		// assert
		assertEquals(0, result);

	}

	@Test
	public void boredomShouldDecreaseBy1AfterPlay() {
		// act

		int beforePlay = underTest.getBoredom();
		underTest.play(); // void - just eats
		int result = underTest.getBoredom();
		// assert
		assertEquals(beforePlay - 1, result);

	}

	@Test
	public void boredomShouldIncreaseBy1AfterTick() {
		// Act
		int beforePlay = underTest.getBoredom();
		underTest.tick();
		int result = underTest.getBoredom();
		assertEquals(beforePlay + 1, result);
	}

	@Test
	public void thirstShouldIncreaseBy1AfterTick() {
		// Act
		int beforeDrink = underTest.getThirst();
		underTest.tick();
		int result = underTest.getThirst();
		assertEquals(beforeDrink + 1, result);
	}

	@Test
	public void hungerShouldIncreaseBy1AfterTick() {
		// Act
		int beforeEat = underTest.getHunger();
		underTest.tick();
		int result = underTest.getHunger();

		// assert
		assertEquals(beforeEat + 1, result);
	}

	@Test
	public void shouldReturnBobAndLittleAndCuteOnInitialization() {

		// arrange
		VirtualPet petBio = new VirtualPet("Bob", "little and cute!");
		// act
		String petName = petBio.getPetName();
		String petDescription = petBio.getPetDescription();

		// assert
		assertEquals("Bob", petName);
		assertEquals("little and cute!", petDescription);
	}

	@Test
	public void shouldReturnFluffyAndTiredOnInitialization() {

		// arrange
		VirtualPet petBio = new VirtualPet("Fluffy", "Tired");
		// act
		String petName = petBio.getPetName();
		String petDescription = petBio.getPetDescription();

		// assert
		assertEquals("Fluffy", petName);
		assertEquals("Tired", petDescription);
	}

	@Test
	public void shouldReturnDefaultValues() {
		// return name, description, hunger, thirst, and boredom

		// arrange
		VirtualPet fullPet = new VirtualPet("Fluffy", "Tired", 2, 3, 4, 0);
		// act
		String petName = fullPet.getPetName();
		String petDescription = fullPet.getPetDescription();
		int petHunger = fullPet.getHunger();
		int petThirst = fullPet.getThirst();
		int petBoredom = fullPet.getBoredom();

		// assert
		assertEquals("Fluffy", petName);
		assertEquals("Tired", petDescription);
		assertEquals(2, petHunger);
		assertEquals(3, petThirst);
		assertEquals(4, petBoredom);

	}
}
