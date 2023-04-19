import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birdList = new ArrayList<>();
        UserInterface ui = new UserInterface();

        ui.start(scan, birdList);

        scan.close();

    }

}