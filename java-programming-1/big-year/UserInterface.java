import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    public void start(Scanner scan, ArrayList<Bird> birdList) {
        printStartText();

        while (true) {
            System.out.print("?: ");
            String command = scan.nextLine();

            if (command.equals("Add")) {
                Bird bird = createBirdFromInput(scan);
                birdList.add(bird);
            }

            else if (command.equals("Observation")) {
                observeBird(scan, birdList);
            }

            else if (command.equals("All")) {
                printAllBirds(birdList);
            }

            else if (command.equals("One")) {
                printOneBird(scan, birdList);
            }

            else if (command.equals("help")) {
                printDirections();
            }

            else if (command.equals("Quit")) {
                break;
            }

            else {
                System.out.println("Unknown command...");
            }
        }

    }

    public void printStartText() {
        System.out.println();
        System.out.println("Welcome to Bird Keeper!");
        System.out.println("Type 'help' for directions");
        System.out.println();
    }

    public void printDirections() {
        System.out.println();
        System.out.println("Commands List:");
        System.out.println("Add - adds a bird");
        System.out.println("Observation - adds an observation");
        System.out.println("All - prints all birds");
        System.out.println("One - prints one bird");
        System.out.println("Quit - ends the program");
        System.out.println();
    }

    public Bird createBirdFromInput(Scanner scan) {
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Name in Latin: ");
        String latinName = scan.nextLine();
        return new Bird(name, latinName);
    }

    public void observeBird(Scanner scan, ArrayList<Bird> birdList) {
        System.out.print("Bird: ");
        String observedBird = scan.nextLine();

        for (Bird bird : birdList) {
            if (bird.getName().equals(observedBird)) {
                bird.observe();
                return;
            }
        }

        System.out.println(observedBird + " is not in list of birds");
    }

    public void printOneBird(Scanner scan, ArrayList<Bird> birdList) {
        System.out.print("Bird: ");
        String searchedBird = scan.nextLine();
        for (Bird bird : birdList) {
            if (bird.getName().equals(searchedBird)) {
                System.out.println(bird);
                return;
            }
        }

        System.out.println(searchedBird + " is not in the list of birds");
    }

    public void printAllBirds(ArrayList<Bird> birdList) {
        if (birdList.size() == 0) {
            System.out.println("No birds have been added to bird list");
            return;
        }

        for (Bird bird : birdList) {
            System.out.println(bird);
        }
    }
}
