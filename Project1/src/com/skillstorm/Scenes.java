package com.skillstorm;

import java.util.Scanner;
import java.util.ArrayList;

public class Scenes {

	ArrayList<String> listOfScenes = new ArrayList<>();

	public void sceneInit() {
		listOfScenes.add("marketScene");
		listOfScenes.add("snowValleyScene");
		listOfScenes.add("desertScene");
	}

	private void displayOptions(String options) {
		System.out.println(options);
	}

	private int getChoice(Scanner scanner) {
		System.out.print("Enter your choice: ");
		return scanner.nextInt();
	}

	public void homeScene(Scanner scanner, Player player) {
		System.out.println("\nAs you're walking home from school, you notice something unusual in the "
				+ "forest near your house. A faint, shimmering light\nbeckons you towards a hidden "
				+ "clearing. Intrigued, you cautiously step into the clearing and discover a magical"
				+ " portal that\nseems to lead to a snowy landscape.");

		while (true) {
			displayOptions("\nWhat do you want to do?" + "\n1. Walk towards the light\n2. Run home\n3. Call for help");

			int choice = getChoice(scanner);

			switch (choice) {
			case 1:
				forestScene(scanner, player);
				return;
			case 2:
				runScene(scanner, player);
				return;
			case 3:
				callScene(scanner, player);
				return;
			default:
				System.out.println("Invalid choice!");

			}
		}
	}

	private void forestScene(Scanner scanner, Player player) {
		System.out.println("\nYou made it through the portal. Looking around, you see the snowfall clears."
				+ "\nTo your surprise, you realize you are in the heart of the North Pole, surrounded "
				+ "\nby the enchanting sights and sounds of Santa's workshop! Elves hurried around, "
				+ "\nwrapping presents and preparing sleighs for Santa's grand journey. ");

		while (true) {
			displayOptions("\nWhat do you want to do?" + "\n1. Head inside the workshop\n2. Run back to the portal");

			int choice = getChoice(scanner);

			switch (choice) {
			case 1:
				workshopScene(scanner, player);
				return;
			case 2:
				turnAwayScene(scanner, player);
				return;
			default:
				System.out.println("Invalid choice!");
			}
		}
	}

	private void workshopScene(Scanner scanner, Player player) {
		System.out.println("\nAmazed by the view, you are then greeted by a friendly elf named "
				+ "\nJingles. Jingles explained that something terrible had happened. \"The Christmas "
				+ "\nmagic, the source of all the holiday joy, had been mysteriously draining away. "
				+ "\nIf the magic isn't restored in time, Christmas would be in jeopardy!\" ");

		while (true) {
			displayOptions("\nWhat do you want to do?" + "\n1. Help save Christmas!\n2. Touch Jingles' ear");

			int choice = getChoice(scanner);

			switch (choice) {
			case 1:
				helpScene(scanner, player);
				return;
			case 2:
				hammerScene(scanner, player);
				return;
			default:
				System.out.println("Invalid choice!");
			}
		}
	}

	public void marketScene(Scanner scanner, Player player) {

		System.out.println("\nYou arrive at what looks like the twinkling markets of a foreign city. "
				+ "\nThe streets are bustling and everyone around is walking like they are in a "
				+ "\nhurry. You notice a newsstand with a glowing light behind the counter. That "
				+ "\nmust be some Christmas magic!");
		marketChoice(scanner, player);

	}

	private void marketChoice(Scanner scanner, Player player) {
		displayOptions("\n What will you do?" + "\n1. Greet the newspaper vendor\n2. Reach for the Christmas magic"
				+ "\n3. Sing a Christmas carol");

		int choice = getChoice(scanner);

		while (true) {
			switch (choice) {
			case 1:
				greetScene(scanner, player);
				return;
			case 2:
				reachScene(scanner, player);
				return;
			case 3:
				carolScene(scanner, player);
				return;
			default:
				System.out.println("Invalid choice!");
			}
		}
	}

	public void snowValleyScene(Scanner scanner, Player player) {
		System.out.println("\nYou arrive at another snowy landscape, where you encounter a reindeer "
				+ "\nand a glowing light on a frost-covered tree. That must be some Christmas magic! ");
		snowValleyChoice(scanner, player);
	}

	private void snowValleyChoice(Scanner scanner, Player player) {
		displayOptions("What do you want to do?"
				+ "\n1. Walk up to the Reindeer\n2. Climb up the tree\n3. Knock it down with snowballs");

		int choice = getChoice(scanner);

		while (true)
			switch (choice) {
			case 1:
				deerScene(scanner, player);
				return;

			case 2:
				treeScene(scanner, player);
				return;

			case 3:
				snowballScene(scanner, player);
				return;

			default:
				System.out.println("Invalid choice!");
			}
	}

	private void deerScene(Scanner scanner, Player player) {

		System.out.println("\nYou slowly approach the renideer, captivated by its majestic presence, "
				+ "\nits antlers adorned with glistening ornaments, embodying the enchanting spirit of"
				+ "\nthe holiday season. Suddenly, the Christmas Magic atop the tree begins to glow"
				+ "\neven brighter, shooting from the top of the tree straigh into your magic sack!");
		
		System.out.println("\n--------------------------------------------------"
				+ "\n(You gained 1 Christmas magic!!!)" + "\n--------------------------------------------------");
		checkChristmasPower(player);
		portalGottaGo(scanner, player);
	}

	private void treeScene(Scanner scanner, Player player) {

		System.out.println("\nYou try to climb the tree, however all the snow on the tree makes it very"
				+ "\ndifficult to climb. You almost make it to the top of the tree. \nSuddenly...");
		portalGottaGo(scanner, player);
		
	}

	private void snowballScene(Scanner scanner, Player player) {

		System.out.println("\nYou look around to see if there's anything you can use to help get the"
				+ "\nChristmas magic down from the tree. You decide to make some snowballs and throw them"
				+ "\nat the top of the tree. Suddenly, all of the snow on the tree violently falls off"
				+ "\nand startles the reindeer, causing it to charge wildly and knock you a few yards back.");
		
		System.out.println("\n--------------------------------------------------"
				+ "\n(You take 1 HP damage)"
				+ "\n--------------------------------------------------");
		
		checkHealth(player, scanner);
		portalGottaGo(scanner, player);
	}

	public void desertScene(Scanner scanner, Player player) {

		System.out.println("\nIn the heart of a vast desert landscape, where the stars shine "
				+ "\nbrightly in the night sky, an unexpected sight unfolded. A lone cactus stood "
				+ "\ntall, adorned with a peculiar shimmering glow. There's Christmas Magic shining "
				+ "\natop the cactus!");

		desertChoice(scanner, player);
	}

	private void desertChoice(Scanner scanner, Player player) {
		displayOptions("\nWhat do you want to do?\n1. Explore the desert\n2. Grab the Christmas magic\n3. "
				+ "Stare at the night sky.");

		int choice = getChoice(scanner);

		while (true) {
			switch (choice) {
			case 1:
				oasisScene(scanner, player);
				return;
			case 2:
				cactusScene(scanner, player);
				return;
			case 3:
				starScene(scanner, player);
				return;
			default:
				System.out.println("Invalid choice!");
			}
		}
	}

	private void oasisScene(Scanner scanner, Player player) {

		System.out.println("\nYou explored the desert and found a mysterious oasis. At the Oasis, you "
				+ "\nsee what looks like a caravan of travelers. One of the travelers is holding a "
				+ "\nnewborn baby. When you look at the baby, the baby stares back at you. The baby "
				+ "\nlet's out a great big smile, which fills your heart with joy. Suddenly, the Christmas"
				+ "\nMagic glows even brighter, then flies right into your magic sack.");

		System.out.println("\n--------------------------------------------------"
				+ "\n(You gained 1 Christmas magic!!!)" + "\n--------------------------------------------------");

		checkChristmasPower(player);
		portalGottaGo(scanner, player);

	}

	private void cactusScene(Scanner scanner, Player player) {

		System.out.println("\nYou reach for the Christmas Magic atop the cactus, however you slip "
				+ "\nand land on the cactus needles. ");
		System.out.println("\n--------------------------------------------------" + "\n(You take 1 HP damage)"
				+ "\n--------------------------------------------------");

		checkHealth(player, scanner);
		portalGottaGo(scanner, player);

	}

	private void starScene(Scanner scanner, Player player) {

		System.out.println("\nYou stare out to the clear night sky, proving that even in the most "
				+ "\nunexpected places, the magic of Christmas could be found and celebrated. As "
				+ "\nyou continue to stare out in amazement, the Christmas Magic glows even brighter, "
				+ "\nthen flies right into your magic sack.\"");

		System.out.println("\n--------------------------------------------------"
				+ "\n(You gained 1 Christmas magic!!!)" + "\n--------------------------------------------------");

		checkChristmasPower(player);
		portalGottaGo(scanner, player);
	}

	private void runScene(Scanner scanner, Player player) {

		System.out.println("\nYou sprint away from the magical portal back into the forest. While "
				+ "\nsprinting, you hear a distant bark and without hesitation, you now sprint in a "
				+ "\nnew direction. A shadow danced around you, getting much closer. A dog, its eyes "
				+ "\nglinting with primal determination, darts toward you. The woods become a blur as "
				+ "\nyou pushed through the branches, driven by the desperate need to escape the "
				+ "\npursuit. You then catch your foot into a tree root, stumbling down the forest "
				+ "\nslope and taking a few hard bumps before rolling right into the portal.");

		System.out.println("\n--------------------------------------------------" + "\n(You take 1 HP damage)"
				+ "\n--------------------------------------------------");
		checkHealth(player, scanner);

		forestScene(scanner, player);

	}

	private void callScene(Scanner scanner, Player player) {

		System.out.println("\nYou look around and cry out for help, however all you hear back is the"
				+ "\nempty echo of your cry.");

		while (true) {
			displayOptions("\nWhat do you want to do?" + "\n1. Walk towards the light\n2. Run home\n3. Call for help");

			int choice = getChoice(scanner);

			switch (choice) {
			case 1:
				forestScene(scanner, player);
				return;
			case 2:
				runScene(scanner, player);
				return;
			case 3:
				callScene(scanner, player);
				return;
			default:
				System.out.println("Invalid choice!");

			}
		}
	}

	private void turnAwayScene(Scanner scanner, Player player) {

		System.out.println("\nYou refuse to believe what you see, deciding it is best head back into"
				+ "\nthe portal. You run and jump back into the portal, only to have the portal disappear"
				+ "\nmid-jump. You plant your face right into the ground. ");

		System.out.println("\n--------------------------------------------------" + "\n(You take 1 HP damage)"
				+ "\n--------------------------------------------------");

		checkHealth(player, scanner);

		System.out.println("\nWith no other option, you make your way into the workshop.");
		workshopScene(scanner, player);
	}

	private void helpScene(Scanner scanner, Player player) {
		System.out.println("\nDetermined to save Christmas, you offered to help. Jingles handed you "
				+ "\na magical sack and explained that Santa's Workshop had portals connected to "
				+ "\ndifferent parts of the world. Your mission is to travel through these portals, "
				+ "\ncollect the Christmas magic, and bring it back to the workshop. With magical sack "
				+ "\nin hand, you jump into the portal. ");

		portalScene(scanner, player);

	}

	

	private void hammerScene(Scanner scanner, Player player) {

		System.out.println("\nTo your surprise, the ears feel like real elf ears! However, Jingles"
				+ "\ndoesn't seem very happy about you touching them, as he proceeds to raise a bright,"
				+ "\n\red hammer over his head and bring it down with a loud \" BONK! \" over your" + "own head");
		System.out.println("\n--------------------------------------------------" + "\n(You take 1 HP damage)"
				+ "\n--------------------------------------------------");
		System.out.println("What are you doing weirdo? Are you going to help or not?");

		checkHealth(player, scanner);

		while (true) {
			displayOptions("\nWhat do you want to do?" + "\n1. Help save Christmas!\n2. Touch Jingles' " + "ear again");

			int choice = getChoice(scanner);

			switch (choice) {
			case 1:
				helpScene(scanner, player);
				return;
			case 2:
				hammerScene(scanner, player);
				return;

			default:
				System.out.println("Invalid choice!");

			}
		}

	}

	private void greetScene(Scanner scanner, Player player) {

		System.out.println("\nYou greet the newsstand vendor. \"Hey bud! You looking to buy a "
				+ "\nnewspaper? What's that? Christmas Magic? I have no idea what you're talking "
				+ "about.\" You try to explain to the vendor about your mission. Suddenly...");

		portalGottaGo(scanner, player);
	}

	private void reachScene(Scanner scanner, Player player) {

		System.out.println("\n\"What are you doing? Trying to steal one of my newspapers?\" The vendor"
				+ "\ngrabs a rolled-up newspaper and hits you over the head with it. \n\"Get outta here,"
				+ "\nyou thief!\"");

		System.out.println("\n--------------------------------------------------" + "\n(You take 1 HP damage)"
				+ "\n--------------------------------------------------");

		checkHealth(player, scanner);
		portalGottaGo(scanner, player);
	}

	private void carolScene(Scanner scanner, Player player) {

		System.out.println("\nYou begin to sing Christmas carols. While you are in the middle of your "
				+ "\nangelic melody, strangers begin to surround you and join you in singing carols. "
				+ "\nYou feel a great sense of joy caroling together with everyone and begin to smile "
				+ "\nuncontrollably. Suddenly, the Christmas Magic glows even brighter and flies right"
				+ "\ninto your magic sack." + "\n--------------------------------------------------"
				+ "\n(You gained 1 Christmas magic!!!)" + "\n--------------------------------------------------");

		checkChristmasPower(player);
		portalGottaGo(scanner, player);
	}

	private void portalGottaGo(Scanner scanner, Player player) {

		System.out.println("\nYou see the portal begin to flicker. It's time to go to the next location");

		portalScene(scanner, player);

	}
	
	public void portalScene(Scanner scanner, Player player) {

		int sceneSelector = ((int) (listOfScenes.size() * Math.random() - 1));
		
		if (listOfScenes.isEmpty()) {
			ChristmasMagic.santaWorkshop(player);
			return;
		}
			else {	
		
		switch (listOfScenes.get(sceneSelector)) {
		case "marketScene":
			listOfScenes.remove(sceneSelector);
			marketScene(scanner, player);
			break;
		case "snowValleyScene":
			listOfScenes.remove(sceneSelector);
			snowValleyScene(scanner, player);
			break;
		case "desertScene":
			listOfScenes.remove(sceneSelector);
			desertScene(scanner, player);
			break;
		default:
			return;

		}
		
		}
		
	}

	// Check for game end conditions
	public void checkHealth(Player player, Scanner scanner) {

		int currentHP = player.getHealthPoints();
		int newHP = currentHP - 1;
		player.setHealthPoints(newHP);

		System.out.println("Current HP: " + newHP);

		if (player.getHealthPoints() <= 0) {

			gameOver(scanner);

		}

	}

	public void checkChristmasPower(Player player) {

		int currentCM = player.getChristmasPower();
		int newCM = currentCM + 1;
		player.setChristmasPower(newCM);

		System.out.println("Current Christmas Magic: " + newCM);
	}

	public void gameOver(Scanner scanner) {
		System.out.println("\nGame Over.");
		System.out.println("\n");

		while (true) {
			displayOptions("\nPress 1 to try again");

			int choice = getChoice(scanner);

			switch (choice) {
			case 1:
				System.out.println("\n");
				ChristmasMagic.main(null);
			default:
				System.out.println("Invalid choice!");

			}
		}

	}

}