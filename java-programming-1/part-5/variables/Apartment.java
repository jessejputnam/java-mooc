public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSqaure) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSqaure;
    }

    public int getRooms() {
        return this.rooms;
    }

    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    }

    public int priceDifference(Apartment compared) {
        int thisPrice = this.pricePerSquare * this.squares;
        int compPrice = compared.pricePerSquare * compared.squares;
        return Math.abs(thisPrice - compPrice);
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int thisPrice = this.pricePerSquare * this.squares;
        int compPrice = compared.pricePerSquare * compared.squares;
        return thisPrice > compPrice;
    }
}
