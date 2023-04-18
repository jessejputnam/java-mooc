import java.util.ArrayList;

public class Recipe {
    private String name;
    private int time;
    private ArrayList<String> ingredients;

    public Recipe(String name) {
        this.name = name;
        this.time = 0;
        this.ingredients = new ArrayList<String>();
    }

    public String getName() {
        return this.name;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getTime() {
        return this.time;
    }

    public void addIngredient(String ingredient) {
        this.ingredients.add(ingredient);
    }

    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }

    public String toString() {
        return this.getName() + ", cooking time: " + this.getTime();
    }
}
