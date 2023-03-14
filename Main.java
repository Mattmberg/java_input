import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner myInput = new Scanner(System.in);  //Create a Scanner object that is found in java.util
      System.out.println("Enter your first name:");
      
      String firstName = myInput.nextLine();
      
      System.out.println("Your first name is " + firstName);
    
      System.out.println("Hello World");

      String name = "Example";
      int faveNum = 32;
      char faveLetter = "T";
      boolean firstBoolean = false;
      float firstFloat = 6.89f;
    }
  }
