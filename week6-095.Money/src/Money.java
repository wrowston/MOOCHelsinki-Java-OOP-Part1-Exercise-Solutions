
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {

        return euros;
    }

    public int cents() {

        return cents;
    }

    public Money plus(Money added){

        Money clone = new Money(this.euros, this.cents);

        int euroSum = clone.euros + added.euros();
        int centSum = clone.cents + added.cents();

        clone = new Money(euroSum, centSum);

        return clone;
    }

    public boolean less(Money compared) {

        boolean lessThan = false;
        if (euros < compared.euros){
            lessThan = true;
        }
        if (euros <= compared.euros && cents < compared.cents){
            lessThan = true;
        }
        return lessThan;
    }

    public Money minus(Money decremented){

        Money clone = new Money(this.euros, this.cents);

        int euros = clone.euros - decremented.euros();
        int cents = clone.cents - decremented.cents();

        if (euros < 0){
            euros = 0;
            cents = 0;
        } else if (euros > 0 && cents < 0) {
            euros -= 1;
            cents = 100 - decremented.cents();
        }

        clone = new Money(euros, cents);

        return clone;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
