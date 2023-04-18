import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

public class UserInterface {
    public void start() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Recipe> recipes;

        System.out.print("File to read: ");
        String fileName = scanner.nextLine();
        System.out.println();

        recipes = getRecipesFromFile(fileName);

        listCommands();

        while (true) {
            String command = getCommand(scanner);

            if (command.equals("list")) {
                listRecipes(recipes);
            }

            if (command.equals("find name")) {
                ArrayList<Recipe> list = getRecipesByName(scanner, recipes);
                listRecipes(list);
            }

            if (command.equals("find cooking time")) {
                ArrayList<Recipe> list = getRecipesByTime(scanner, recipes);
                listRecipes(list);
            }

            if (command.equals("find ingredient")) {
                ArrayList<Recipe> list = getRecipesByIngredient(scanner, recipes);
                listRecipes(list);
            }

            if (command.equals("stop")) {
                break;
            }

        }

        scanner.close();
    }

    public void listCommands() {
        System.out.println("Commands: ");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");
    }

    public String getCommand(Scanner scanner) {
        System.out.println();
        System.out.print("Enter command: ");
        return scanner.nextLine();
    }

    public void listRecipes(ArrayList<Recipe> recipes) {
        System.out.println();
        System.out.println("Recipes: ");
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }

    public ArrayList<Recipe> getRecipesByName(Scanner scanner, ArrayList<Recipe> recipes) {
        System.out.print("Searched word: ");
        String search = scanner.nextLine();
        ArrayList<Recipe> list = new ArrayList<>();

        System.out.println("Recipes: ");
        for (Recipe recipe : recipes) {
            if (recipe.getName().contains(search)) {
                list.add(recipe);
            }
        }

        return list;
    }

    public ArrayList<Recipe> getRecipesByTime(Scanner scanner, ArrayList<Recipe> recipes) {
        System.out.print("Max cooking time: ");
        int maxTime = Integer.valueOf(scanner.nextLine());
        ArrayList<Recipe> list = new ArrayList<>();

        for (Recipe recipe : recipes) {
            if (recipe.getTime() <= maxTime) {
                list.add(recipe);
            }
        }

        return list;
    }

    public ArrayList<Recipe> getRecipesByIngredient(Scanner scanner, ArrayList<Recipe> recipes) {
        System.out.print("Ingredient: ");
        String search = scanner.nextLine();
        ArrayList<Recipe> list = new ArrayList<>();

        for (Recipe recipe : recipes) {
            if (recipe.getIngredients().contains(search)) {
                list.add(recipe);
            }
        }

        return list;
    }

    public ArrayList<Recipe> getRecipesFromFile(String fileName) {
        ArrayList<Recipe> recipes = new ArrayList<>();

        try (Scanner scanner = new Scanner(Paths.get(fileName))) {
            boolean isName = true;
            boolean isTime = false;
            Recipe recipe = new Recipe("null");

            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();

                if (isName) {
                    recipe = new Recipe(row);
                    isTime = true;
                    isName = false;
                } else if (isTime) {
                    recipe.setTime(Integer.valueOf(row));
                    isTime = false;
                } else if (row.equals("")) {
                    recipes.add(recipe);
                    isName = true;
                } else {
                    recipe.addIngredient(row);
                }
            }

            recipes.add(recipe);
        } catch (Exception e) {
            System.out.println("Error: Reading the file '" + e.getMessage() + "' failed.");
        }

        return recipes;
    }
}
