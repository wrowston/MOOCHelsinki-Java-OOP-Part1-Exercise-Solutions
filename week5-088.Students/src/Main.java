import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program

        Scanner reader = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();

        while(true) {
            System.out.print("name: ");
            String inputName = reader.nextLine();

            if (inputName.isEmpty()){
                break;
            }

            System.out.print("studentnumber: ");
            String inputStudentNumber = reader.nextLine();

            Student newStudent = new Student(inputName, inputStudentNumber);
            list.add(newStudent);

        }

        System.out.println("");

        for (Student studentInfo : list){
            System.out.println(studentInfo);
        }

        System.out.println("");

        System.out.print("Give search term: ");
        String search = reader.nextLine();
        System.out.println("Result:");

        for (Student studentInfo : list) {
            if (studentInfo.getName().contains(search)) {
                System.out.println(studentInfo);
            } else if (studentInfo.getStudentNumber().contains(search)) {
                System.out.println(studentInfo);
            }
        }
    }
}
