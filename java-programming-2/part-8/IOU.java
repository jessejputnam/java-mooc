import java.util.HashMap;

/**
 * constructor public IOU() creates a new IOU
 * 
 * public void setSum(String toWhom, double amount) saves the amount owed and
 * the person owed to to the IOU.
 * 
 * public double howMuchDoIOweTo(String toWhom) returns
 */

public class IOU {
    private HashMap<String, Double> map;

    public IOU() {
        this.map = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        map.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return map.getOrDefault(toWhom, 0.0);
    }
}
