package DungeonsAndDragons.business;

import java.util.Scanner;

public class Game {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Character king = new King();
        Character queen = new Queen();
        Character knight = new Knight();
        Character gnome = new Gnome();

        Character[] characters = {king, queen, knight, gnome};

        System.out.println("Welcome to Dungeons and Dragons!");

        for (Character character : characters) {
            character.display();
            if (character.getWeapon() == null) {
                character.setWeapon(WeaponFactory.getRandomWeapon());
            }
            character.performFight();
        }

        while (true) {
            System.out.println("Do you want to change weapons for any character? (yes/no)");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("yes")) {
                changeWeapon(characters);
            } else {
                break;
            }
        }

        System.out.println("Now let's simulate some fights!");
        simulateFight(king, queen);
        simulateFight(knight, gnome);
    }

    private static void changeWeapon(Character[] characters) {
        for (int i = 0; i < characters.length; i++) {
            System.out.println((i + 1) + ". " + characters[i].getClass().getSimpleName());
        }

        System.out.println("Choose a character to change weapon (1-4):");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice >= 1 && choice <= 4) {
            Character selectedCharacter = characters[choice - 1];
            selectedCharacter.setWeapon(WeaponFactory.getRandomWeapon());
            System.out.println("Weapon changed!");
            selectedCharacter.performFight();
        } else {
            System.out.println("Invalid choice.");
        }
    }

    private static void simulateFight(Character character1, Character character2) {
        int totalPower1 = character1.getPower() + character1.getWeapon().getPower();
        int totalPower2 = character2.getPower() + character2.getWeapon().getPower();
        System.out.println(character1.getClass().getSimpleName() + " with " + character1.getWeapon().getClass().getSimpleName() +
                " vs " + character2.getClass().getSimpleName() + " with " + character2.getWeapon().getClass().getSimpleName());
        character1.performFight();
        character2.performFight();
        System.out.println("Total Power" + totalPower1 + "vs" + totalPower2);
        System.out.println("El ganador es: " + (totalPower1 > totalPower2 ? character1.getClass().getSimpleName() : character2.getClass().getSimpleName()));

        if (totalPower1 > totalPower2) {
            System.out.println("El ganador es: " + character1.getClass().getSimpleName());
        } else if (totalPower1 < totalPower2) {
            System.out.println("El ganador es: " + character2.getClass().getSimpleName());
        } else {
            System.out.println("¡Empate!");
        }
    }
}