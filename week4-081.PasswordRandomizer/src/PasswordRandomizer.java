import java.util.Random;

public class PasswordRandomizer {
    // Define the variables

    private Random random;
    private int length;


    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        this.random = new Random();

    }

    public String createPassword() {
        // write code that returns a randomized password
        int i = 0;
        String passwordCharacters = "abcdefghijklmnopqrstuvwxyz";
        String password = "";
        while (i < this.length) {
            int randomNumber = this.random.nextInt(passwordCharacters.length());
            char letter = passwordCharacters.charAt(randomNumber);
            //this only randomizes for index positions 0-this.length, not all 26 characters
            password += letter;
            i++;

        }
        return password;
    }

    //My code that outputs the same random password every time


//    private Random random;
//    private int length;
//    private String passwordCharacters;
//    private String password;
//
//    public PasswordRandomizer(int length) {
//        // Initialize the variable
//        this.length = length;
//        this.random = new Random();
//        this.passwordCharacters = "abcdefghijklmnopqrstuvwxyz";
//        this.password = "";
//    }
//
//    public String createPassword() {
//        // write code that returns a randomized password
//        ArrayList<String> passwords = new ArrayList<String>();
//        while (this.password.length() < this.length) {
//
//            char symbol = this.passwordCharacters.charAt(this.random.nextInt(length));
                    // this only randomizes for index positions 0-this.length, not all 26 characters
//            this.password += symbol;
//
//        }
//
//        passwords.add(this.password);
//
//        return this.password;
//    }


}