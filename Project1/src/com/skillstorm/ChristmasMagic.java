package com.skillstorm;

import java.util.Scanner;

public class ChristmasMagic {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to Christmas Magic Adventure!");
		System.out.print("Enter your name: ");
		String playerName = scanner.nextLine();
		Player player = createPlayer(playerName);

		PlayGame playGame = new PlayGame();
		playGame.play(player);

		scanner.close();
	}

	private static Player createPlayer(String playerName) {
		int initialHP = 3;
		int initialChristmasMagic = 0;

		System.out.println("Hello, " + playerName + "! " + "Let the Adventure begin! ");
		System.out.println("HP: " + initialHP);
		System.out.println("Christmas Magic: " + initialChristmasMagic);
		return new Player(playerName, initialHP, initialChristmasMagic);
	}

	public static class PlayGame {
		public void play(Player player) {

			Scenes scenes = new Scenes();
			Scanner scanner = new Scanner(System.in);
			scenes.sceneInit();
			scenes.homeScene(scanner, player);
			
			scanner.close();

		}
	}

	public static void santaWorkshop(Player player) {
		
		// Display game ending based on player properties
		System.out.println("\nYou made it back to Santa's workshop! Let's see if you have enough Christmas Magic\n");
		if (player.getChristmasPower() >= 3) {
			System.out.println("\nCongratulations! You've brought Christmas to the world!");
		} else {
			System.out.println("\nYou did not bring enough Christmas magic to the world.... Game Over.");

			

		}
		

	}
}
