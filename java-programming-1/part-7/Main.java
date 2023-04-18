import java.util.Scanner;

/**
 * add amount adds the amount of liquid specified by the parameter to the first
 * container. The inserted amount must be specified as an integer. The container
 * can't hold more than a hundred liters and everything added past that will go
 * to waste.
 * 
 * move amount moves the amount of liquid specified by the parameter from the
 * first container to the second container. The given amount must be specified
 * as an integer. If the program is requested to move more liquid than than the
 * first container currently holds, move all the remaining liquid. The second
 * container can't hold more than one hundred liters of liquid and everything
 * past that will go to waste.
 * 
 * remove amount removes the amount of liquid specified by the parameter from
 * the second container. If the program is requested to remove more liquid than
 * the container currently holds, remove all the remaining liquid.
 */

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println();
            System.out.println("First: " + firstContainer);
            System.out.println("Second: " + secondContainer);

            String input = scanner.nextLine();
            if (input.equals("quit"))
                break;

            String command = input.split(" ")[0];
            int amount = Integer.valueOf(input.split(" ")[1]);

            if (command.equals("add")) {
                firstContainer.add(amount);
                continue;
            }
            if (command.equals("move")) {
                firstContainer.remove(amount);
                secondContainer.add(amount);
                continue;
            }
            if (command.equals("remove")) {
                secondContainer.remove(amount);
                continue;
            }

            scanner.close();
        }
    }
}