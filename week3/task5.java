package week3;

public class task5 {
    public static void main(String[] args) {
        /*Write a JAVA program to check whether a year is a leap year or not. 
 Hint: if year%4==0; if year%100!==0 ; year%400==0; */
 
 int year = 2020;
 if(year%4==0){
   if(year%100!=0){
       System.out.println("Leap Year");
   }
   else if(year%400==0){
       System.out.println("Leap Year");
       }
   else{
       System.out.println("Not a Leap Year");
   }
   }
 else{
   System.out.println("Not a Leap Year");
   }
  }
}
