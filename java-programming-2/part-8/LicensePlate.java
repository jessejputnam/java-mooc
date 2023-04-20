public class LicensePlate {
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public boolean equals(Object compareObject) {
        if (this == compareObject)
            return true;

        if (!(compareObject instanceof LicensePlate))
            return false;

        LicensePlate obj = (LicensePlate) compareObject;

        if (this.liNumber == obj.liNumber && this.country == obj.country) {
            return true;
        }

        return false;
    }
}