package org.wecancodeit;

import java.util.Collection;
import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {

		VirtualPetShelter myPets = new VirtualPetShelter();
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to the WCCI Pet Shelter!");
		System.out.println("\n********************************************** \n");

		printMenu();

		// default starter pets
		VirtualPet pet1 = new VirtualPet("MeiLing", "big, fat, fluffy cat", 0, 0, 0, 2);
		VirtualPet pet2 = new VirtualPet("Rigby", "skinny sleek black cat", 3, 0, 0, 0);
		VirtualPet pet3 = new VirtualPet("Oliver", "scruffy old gray cat", 0, 0, 1, 0);

		myPets.add(pet1);
		myPets.add(pet2);
		myPets.add(pet3);
		
// loop start

		while (true) {

			System.out.println("What would you like to do?");
			String menuOption = input.nextLine();

			if (menuOption.contentEquals("help")) {
				printMenu();
				continue;

			} else if (menuOption.contentEquals("1")) {

				System.out.println("\nStatus for all pets: ");
				
				System.out.println("Name \t Hunger \t Thirst \t Boredom" );
				// get status for all pets
				Collection<VirtualPet> petStats = myPets.getAllPets();
				// Collection is a type like String or int, etc.
				for (VirtualPet currentPet : petStats) {
					
					
					
					
					System.out.println(currentPet.getPetName());
				}
				
				
				
				

			} else if (menuOption.contains("2")) {

				Collection<VirtualPet> petRoster = myPets.getAllPets();
				// Collection is a type like String or int, etc.

				for (VirtualPet currentPet : petRoster) {
					System.out.println(currentPet.getPetName());
				}

			} else if (menuOption.contentEquals("3")) {
				System.out.println("Feeding time! Come and get it, pets!");
				myPets.feedAllPets();

			} else if (menuOption.contentEquals("4")) {
				System.out.println("Who's thirsty? Here's some water.");
				myPets.waterAllPets();

			} else if (menuOption.contentEquals("5")) {
				System.out.println("Yay! Let's play!");
				System.out.println("Which pet would you like to play with?");

				String selectedPet = input.nextLine();
				myPets.playWithPet(selectedPet);

			} else if (menuOption.contentEquals("6")) {
				System.out.println("It's getting stinky in here. Time to scoop the poop!");
				myPets.cleanAllPets();

			} else if (menuOption.contentEquals("7")) {
				System.out.println("Which pet would you like to adopt?");

				String adoptedPet = input.nextLine();
				VirtualPet petToAdopt = myPets.findPet(adoptedPet);
				System.out.println("Thank you for adopting " + adoptedPet);
				myPets.remove(petToAdopt);

			} else if (menuOption.contentEquals("8")) {
				System.out.println("What would you like to name this new pet?");
				String petName = input.nextLine();

				System.out.println("description:");
				String petDescription = input.nextLine();

				VirtualPet petToIntake = new VirtualPet(petName, petDescription);
				myPets.add(petToIntake);

				System.out.println("Thanks! Nice to meet " + petName + " the " + petDescription + ".");

			} else if (menuOption.contentEquals("9")) {
				System.out.println("Thank you for volunteering! Good-bye!");
				break;
			} else {
				System.out.println("What?! Say that again.");
			}

			myPets.tickAllPets();

			System.out.println("Press enter to do another action.");
			input.nextLine();

		} // loop end

		input.close();

	}

	private static void printMenu() {
		System.out.println("1: Check status for all pets");
		System.out.println("2: Print a pet roster");
		System.out.println("3: Feed all the pets");
		System.out.println("4: Give all the pets water");
		System.out.println("5: Play with a pet");
		System.out.println("6: Clean up after the pets");
		System.out.println("7: Adopt a pet");
		System.out.println("8: Admit a new pet");
		System.out.println("9: Quit");

		System.out.println("To see menu again, type \"help\".");

	}

	public static void pterryAscii() {
		System.out.println("         			");
		System.out.println("      	  ^	   ^	");
		System.out.println("      	>(  '_o_'<   )<   	");
		System.out.println("         m    m        ");
	}

}
