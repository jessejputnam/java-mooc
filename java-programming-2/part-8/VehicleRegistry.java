
/**
 * public boolean add(LicensePlate licensePlate, String owner) assigns the owner
 * it received as a parameter to a car that corresponds to the license plate
 * received as a parameter. If the license plate doesn't have an owner, the
 * method returns true. If the license already has an owner attached, the method
 * returns false and does nothing.
 * 
 * public String get(LicensePlate licensePlate) returns the owner of the car
 * corresponding to the license plate received as a parameter. If the car isn't
 * in the registry, the method returns null.
 * 
 * public boolean remove(LicensePlate licensePlate) removes the license plate
 * and attached data from the registry. The method returns true if removed
 * successfully and false if the license plate wasn't in the registry.
 */

import java.util.HashMap;
import java.util.ArrayList;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (registry.containsKey(licensePlate))
            return false;

        registry.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        return registry.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (!registry.containsKey(licensePlate))
            return false;

        registry.remove(licensePlate);
        return true;
    }

    public void printLicensePlates() {
        System.out.println(registry.keySet());
    }

    public void printOwners() {
        ArrayList<String> list = new ArrayList<>();

        for (LicensePlate license : registry.keySet()) {
            if (!list.contains(registry.get(license)))
                list.add(registry.get(license));
        }

        System.out.println(list);
    }
}