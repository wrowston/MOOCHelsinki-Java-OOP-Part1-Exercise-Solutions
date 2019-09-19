import java.util.ArrayList;

public class BirdWatcher {

    private ArrayList<Bird> birdWatch;
    private Bird bird;

    public BirdWatcher() {
        this.birdWatch = new ArrayList<Bird>();
    }

    public void addBird(String name, String latinName){
        bird = new Bird(name, latinName);
        this.birdWatch.add(bird);
    }

    public ArrayList<Bird> getBirds(){
        return this.birdWatch;
    }

    public void statistics(){
        for (Bird bird : birdWatch) {
            System.out.println(bird);
        }
    }

    //    private String birdName;
//    private String birdLatinName;
//    private ArrayList<Bird> birdsList;
//    private Bird birds;
//    private String add;
//    private String isObservation;
//    private String stats;
//    private String show;
//    private String quit;
//
//    public BirdWatcher() {
//
//        this.birdName = "";
//        this.birdLatinName = "";
//        this.birds = new Bird(birdName, birdLatinName);
//        this.birdsList = new ArrayList<Bird>();
//        this.add = "add";
//        this.isObservation = "observation";
//        this.stats = "statistics";
//        this.show = "show";
//        this.quit = "quit";
//    }
//
//    public void addBird(Scanner reader){
//
//        while (true){
//
//            System.out.print("? ");
//            String input = reader.nextLine();
//
//            if (input.toUpperCase().equals(quit.toUpperCase())){
//                break;
//            } else if (add.toUpperCase().equals(input.toUpperCase())){
//
//                System.out.print("Name: ");
//                birds.setBirdName(reader);
//
//                System.out.print("Latin Name: ");
//                birds.setBirdLatinName(reader);
//
//                birdsList.add(birds);
//            } else if (isObservation.toUpperCase().equals(input.toUpperCase())) {
//
//                System.out.print("What was observed:? ");
//                String birdNameInput = reader.nextLine();
//
//                for (Bird bird : birdsList) {
//                    if (bird.getBirdName().toUpperCase().equals(birdNameInput.toUpperCase())) {
//                        bird.setObservations(1);
//                    } else{
//                        System.out.println("Is not a bird!");
//                    }
//                }
//            } else if(stats.toUpperCase().equals(input.toUpperCase())){
//                for (Bird bird : birdsList){
//                    System.out.println(bird);
//                }
//            } else if (show.toUpperCase().equals(input.toUpperCase())){
//
//                System.out.print("What? ");
//                String birdNameInput = reader.nextLine();
//
//                for (Bird bird : birdsList){
//                    if (birdNameInput.toUpperCase().equals(bird.getBirdName().toUpperCase())){
//                        System.out.println(bird);
//                    }
//                }
//            }
//        }
//    }
}
