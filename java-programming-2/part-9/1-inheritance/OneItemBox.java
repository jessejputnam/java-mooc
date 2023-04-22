import java.util.ArrayList;

public class OneItemBox extends Box {
    private ArrayList<Item> items;

    public OneItemBox() {
        this.items = new ArrayList<>();
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }

    @Override
    public void add(Item item) {
        if (items.size() == 0)
            items.add(item);
    }

}
