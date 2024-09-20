package task3;

import java.util.Scanner;


public class Donor {

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     try {
         
         System.out.print("Enter your age: ");
         int age=sc.nextInt();
         
         System.out.print("Enter your weight: ");
         int weight=sc.nextInt();
         
         
         if (age < 21 || age > 60) {
             throw new InvalidDonorException("Invalid age. Age must be between 21 and 60.");
         }
         
         if (weight < 40 || weight > 60) {
             throw new InvalidDonorException("Invalid weight. Weight must be between 40 and 60.");
         }
         
         System.out.println("You are eligible to donate.");
     
     } catch (InvalidDonorException e) {
         System.out.println(e.getMessage());
     }

     
 }
}
