import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint = 0;

    public NightSky(double density){
        this(density, 20, 10);
    }
    public NightSky(int width, int height){
        this(0.1, width, height);
    }
    public NightSky(double density, int width, int height){
        this.density = density;
        this.width = width;
        this.height = height;
    }

    public void printLine(){
        Random randomizer = new Random();

        for (int i = 0; i < this.width; i++) {
            double probabilityOfStar = randomizer.nextDouble();

            if (probabilityOfStar <= this.density){
                System.out.print("*");
                starsInLastPrint++;
            } else {
                System.out.print(" ");
            }
        }
        System.out.println("");
    }

    public void print(){
        starsInLastPrint = 0; //resets variable to 0 before for loop is run

        for (int i = 0; i < this.height; i++){
            this.printLine();
        }
    }

    public int starsInLastPrint(){

        return starsInLastPrint;
    }
}
