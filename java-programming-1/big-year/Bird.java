public class Bird {
    private String name;
    private String latinName;
    private int observations;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observations = 0;
    }

    public String getName() {
        return this.name;
    }

    public void observe() {
        this.observations++;
    }

    public int getObservations() {
        return this.observations;
    }

    public String toString() {
        String observeString = (this.observations == 1) ? " observation" : " obervations";
        return this.name + " (" + this.latinName + "): " + this.observations + observeString;
    }
}
