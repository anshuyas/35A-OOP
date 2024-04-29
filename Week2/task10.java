package Week2;

public class task10 {
    public static void main(String[] args) {
/*Write a program to calculate the total marks of four subjects of a student and the total percentage secured. And use the following conditions to generate the final result;
a. If equal to or more than 70 -> First Class
b. If more than 59 -> Upper Second Class
c. If more than 49 -> Second class
d. If more than 39 -> Third class and if below than 40 the result is fail. 
Hint: Use ternary operator*/
        int math = 90;
        int physics = 80;
        int chemistry = 70;
        int total = math + physics + chemistry;
        String result=total > 70 ? "First Class" :
         total > 59 ? "Upper Second Class" : 
        total > 49 ? "Second Class" :
        total > 39 ? "Third Class" : "Fail";
        System.out.println(result);
        }
}
