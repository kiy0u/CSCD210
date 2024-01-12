package cscd210lab1; 

import java.util.Scanner; 
import java.text.DecimalFormat; 

public class CSCD210Lab1 {
   public static void main(final String[]args) {
      int shoeSize, bYear; 
      Scanner kb = new Scanner(System.in);
      
      System.out.print("Please enter your shoe size (no half sizes) ");
      shoeSize = kb.nextInt();
      
      System.out.print("Please enter your birth year (yyyy) "); 
      bYear = kb.nextInt();
      
      DecimalFormat fmt = new DecimalFormat("00,00");
      
      System.out.println("Your shoe size is the numbers before the comma " + "and your age (presuming you've had your bday for 2019 " + "is the numbers after the comma " + fmt.format(((shoeSize * 5 + 50) * 20 + 1019 - bYear)));
         }
} 
