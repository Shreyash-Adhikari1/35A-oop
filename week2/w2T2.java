package task.week2;
        /*Task2
      * Write a program  to print simple interest from variables
      * make 3 variable for amount,time and rate and save the calculation into variable
      * Formula:
      * si=amount*time*rate/100;
      */
public class w2T2 {
    public static void main(String[] args) {

     float amount=(float) 10000.99,time=(float) 2.4,rate=10;
     float si=amount*time*rate/100;
     System.out.println("Simple interest is "+si);
 }
}
