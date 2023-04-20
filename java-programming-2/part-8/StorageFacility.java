import java.util.ArrayList;
import java.util.HashMap;

/**
 * public void remove(String storageUnit, String item) removes the given item
 * from the given storage unit. NB! Only removes one item — if there are several
 * items with the same name, the rest still remain. If the storage unit would be
 * empty after the removal, the method also removes the unit.
 * 
 * public ArrayList<String> storageUnits() returns the names of the storage
 * units as a list. NB! Only the units that contain items are listed.
 */

public class StorageFacility {
    private HashMap<String, ArrayList<String>> lockers;

    public StorageFacility() {
        this.lockers = new HashMap<>();
    }

    public void add(String unit, String item) {
        if (!lockers.containsKey(unit))
            lockers.put(unit, new ArrayList<>());
        lockers.get(unit).add(item);
    }

    public ArrayList<String> contents(String unit) {
        if (!lockers.containsKey(unit))
            return new ArrayList<>();
        return lockers.get(unit);
    }

    public void remove(String unit, String item) {
        ArrayList<String> locker = lockers.get(unit);
        locker.remove(item);
        if (locker.size() == 0)
            lockers.remove(unit);
    }

    public ArrayList<String> storageUnits() {
        return new ArrayList<String>(lockers.keySet());
    }
}
