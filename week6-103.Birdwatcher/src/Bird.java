public class Bird {
    private final String birdName;
    private final String latinName;
    private int count;

    public Bird(String name, String latin) {
        this.birdName = name;
        this.latinName = latin;
        this.count = count;
    }

    public String getBirdName() {
        return birdName;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getCount() {
        return count;
    }

    public void increaseCount(){
        count++;
    }

    @Override
    public String toString() {
        return this.birdName + " (" + this.latinName + "): " + this.count + " observations";
    }
}
