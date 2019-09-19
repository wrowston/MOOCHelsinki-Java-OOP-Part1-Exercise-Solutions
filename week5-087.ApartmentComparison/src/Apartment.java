
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;
    private int priceOfApartment;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
        this.priceOfApartment = squareMeters * pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApartment){
        return this.squareMeters > otherApartment.squareMeters;
    }

//    private int price(){
//        return pricePerSquareMeter*squareMeters;
//    }
//
//    public int priceDifference(Apartment compared) {
//        // Math.abs returns the absolute value
//        return Math.abs(this.price()-compared.price());
//    }

    public int priceDifference(Apartment otherApartment){
        return Math.abs(this.priceOfApartment - otherApartment.priceOfApartment);
    }

    public boolean moreExpensiveThan(Apartment otherApartment){
        return this.priceOfApartment > otherApartment.priceOfApartment;
    }
}
