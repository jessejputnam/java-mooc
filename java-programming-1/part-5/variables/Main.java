public class Main {
    public static void main(String... args) {
        Song jackSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
        Song anotherSparrow = new Song("The Lonely ISland", "Jack Sparrow", 196);
        Song yetAnotherSparrow = jackSparrow;

        if (jackSparrow.equals(anotherSparrow)) {
            System.out.println("Songs are equal.");
        } else {
            System.out.println("Not a chance");
        }

        if (jackSparrow.equals(yetAnotherSparrow)) {
            System.out.println("Strange things are afoot.");
        }
    }
}