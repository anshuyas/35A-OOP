package week3;

public class task9 {
    public static void main(String[] args) {
        /*Write a Java program that takes an integer input (1 to 12) representing a month and prints the corresponding season (e.g., 1-3: Winter, 4-6: Spring, 7-9: Summer, 10-12: Fall) using a switch case */
        int month = 12;
        if (month < 1 || month > 12) {
            System.out.println("Invalid input. Please enter a number between 1 and 12.");
        } else {
            String season;
            switch (month) {
                case 12:
                case 1:
                case 2:
                    season = "Winter";
                    break;
                case 3:
                case 4:
                case 5:
                    season = "Spring";
                    break;
                case 6:
                case 7:
                case 8:
                    season = "Summer";
                    break;
                case 9:
                case 10:
                case 11:
                    season = "Fall";
                    break;
                default:
                    season = "Invalid month";
            }
            System.out.println("The season for month " + month + " is: " + season);
        }

    }  
}
