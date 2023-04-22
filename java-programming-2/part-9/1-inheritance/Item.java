import java.util.Objects;

public class Item {
    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }

    @Override
    public boolean equals(Object compareObj) {
        if (this == compareObj)
            return true;

        if (getClass() != compareObj.getClass())
            return false;

        Item obj = (Item) compareObj;

        if (this.name.equals(obj.name))
            return true;

        return false;
    }

}
