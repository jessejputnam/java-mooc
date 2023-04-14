public class Dog {
    private String name;
    private String breed;
    private int age;
    public String dog;

    public Dog(String initialName, String initialBreed, int initialAge) {
        this.name = initialName;
        this.breed = initialBreed;
        this.age = initialAge;
        this.dog = "dog";
    }

    public static void speak(int treats) {
        for (int i = 0; i < treats; i++)
            System.out.println("Woof woof!");
    }

    public void printName() {
        System.out.println(this.name);
    }

    public void printInfo() {
        System.out.println(this.name + " is a " + this.breed + " dog who is " + this.age + " years old.");
    }
}
