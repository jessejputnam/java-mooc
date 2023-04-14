import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Name of the file: ");
        String fileName = input.nextLine();

        ArrayList<String> list = new ArrayList<>();

        boolean fileExists = getNames(fileName, list);
        if (!fileExists) {
            input.close();
            return;
        }

        System.out.print("Search for: ");
        String name = input.nextLine();
        input.close();

        System.out.println(checkNames(name, list));

    }

    public static boolean getNames(String fileName, ArrayList<String> list) {
        try (Scanner scanner = new Scanner(Paths.get(fileName))) {

            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                list.add(row);
            }

            return true;
        } catch (Exception e) {
            System.out.println("Error: Reading the file '" + e.getMessage() + "' failed.");
            return false;
        }
    }

    public static String checkNames(String name, ArrayList<String> list) {
        boolean check = list.contains(name);

        if (check)
            return "Found!";
        else
            return "Not found.";
    }
}