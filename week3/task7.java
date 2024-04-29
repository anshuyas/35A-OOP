package week3;

public class task7 {
    public static void main(String[] args) {
        /*Write a Java program that takes a student's grade as input (A, B, C, D, or F) and converts it to the corresponding GPA value. Use a switch case statement to handle different grades */
        String grade = "B";
        switch (grade) { 
        case "A+":
            System.out.println("Student has scored between 90 to 100");
            break;
        case "A":
            System.out.println("Student has scored between 80 to 90");
            break;
        case "B":
            System.out.println( "Student has scored between 70 to 80");
            break;
        case "C":
            System.out.println("Student has scored between 60 to 70");
            break;
        case "D":
            System.out.println("Student has scored between 50 to 60");
            break;
        default:
            System.out.println("Invalid grade");
        }
    }
}
