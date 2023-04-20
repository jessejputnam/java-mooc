public class Main {
    public static void main(String... args) {
        VehicleRegistry registry = new VehicleRegistry();

        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("D", "B WQ-431");
        LicensePlate li4 = new LicensePlate("FI", "DEF-345");

        System.out.println(registry.add(li1, "Giorgio"));
        System.out.println(registry.add(li2, "Fiore"));
        System.out.println(registry.add(li3, "Luna"));
        System.out.println(registry.add(li4, "Giorgio"));

        registry.printLicensePlates();
        registry.printOwners();
    }
}