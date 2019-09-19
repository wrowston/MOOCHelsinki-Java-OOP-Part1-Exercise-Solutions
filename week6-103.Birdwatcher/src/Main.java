import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner reader = new Scanner(System.in);

        BirdWatcher birdWatcher = new BirdWatcher();

        while (true){
            String input;

            System.out.print("? ");
            input = reader.nextLine();

            if (input.equalsIgnoreCase("quit")){
                break;
            } else if(input.equalsIgnoreCase("add")){
                addBird(reader, birdWatcher);
            } else if(input.equalsIgnoreCase("observation")){
                System.out.print("What was observed:? ");
                String birdName = reader.nextLine();
                increaseCount(birdName, birdWatcher);
            } else if(input.equalsIgnoreCase("statistics")){
                birdWatcher.statistics();
            } else if(input.equalsIgnoreCase("show")){
                System.out.print("What? ");
                String birdName = reader.nextLine();
                showBird(birdName, birdWatcher);
            }
        }

    }

    /*This method adds bird to the birdWatcher. */

    public static void addBird(Scanner reader, BirdWatcher birdWatcher) {
        System.out.print("Name: ");
        String inputName = reader.nextLine();

        System.out.print("Latin Name: ");
        String inputLatinName = reader.nextLine();

        birdWatcher.addBird(inputName, inputLatinName);
    }

    /* This method increases the count for bird for the observation. The count increment
 works with both the name and the latin name.
 */
    public static void increaseCount(String bird, BirdWatcher birdWatcher){
        for (Bird b : birdWatcher.getBirds()){
            if (b.getBirdName().equalsIgnoreCase(bird) || b.getLatinName().equalsIgnoreCase(bird)) {
                b.increaseCount();
                return;
            }
        }
        System.out.println("Is not a bird!");
    }

    public static void showBird(String bird, BirdWatcher birdWatcher){
        for (Bird b : birdWatcher.getBirds()){
            if (b.getBirdName().equalsIgnoreCase(bird) || b.getLatinName().equalsIgnoreCase(bird)){
                System.out.println(b);
                return;
            }
        }
    }

}
