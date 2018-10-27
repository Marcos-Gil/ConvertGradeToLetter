/**
 * By: Name: Marcos Gil
 * 
 * This is a program that asks the user for an integer that respresents
 * a letter grade. The program finds what grade range the input falls 
 * into then returns your letter grade.
 * 
 * Using DrJava: Hit the compile button to compile, then in the 
 * Interactions window, type
 * 
 *  Convert.convertToLetter(num)
 * 
 * Using cmd.exe (windows) or terminal (mac)
 * Compilation: javac Convert.java
 * Usage      : java Convert.convertToLetter(num)
 *
 * Examples: (run in the interaction window of DrJava, or a shell)
 *  
 * > Convert.convertToLetter(3)
 * "F"
 * 
 * > Convert.convertToLetter(99)
 * "A+"
 * 
 * > Convert.convertToLeter(101)
 * "Sorry, that input was not valid. "
 */

public class Convert{
  
  /* A class with 1 method that will take a number from the user and return the Grade equivalent of that grade */
  
  public static String convertToLetter(double grade){
    
    /**
    * This method will return a String that will contain a letter representation
    * of the users Grade.
    *  
    * Input: A double that holds the users Grade
    * Return: A string that holds the grade Equivalent of the users Grade
    * 
    * Contract:
    *  convertToLetter: double -> String
    *  
    *  Purpose: Take a number(users Grade in percent form), and return that letter equivalent of the Grade
    *  
    *  Pre-Conditions:
    *    A number entered between 0 and 100
    *  
    *  Post-Conditions:
    *    Outputs > "Grade Letter String"
    *            If a valid number in the range was entered 
    * 
    *            > "Sorry, that input was not valid."
    *            If an invalid number was entered
    * 
    *  Side Effecs:
    *    None
    */

    /* A series of if/else statemtents to determine the range the input falls into to find the appropriate letter */
    if (grade <= 100 && grade >= 90){
      String letterGrade = new String("A+");
      return letterGrade;
    } 
    
    else if (grade < 90 && grade >= 85){
      String letterGrade = new String("A");
      return letterGrade;
    }
    
    else if (grade < 85 && grade >= 80){
      String letterGrade = new String("A-");
      return letterGrade;
    }
    
    else if (grade < 80 && grade >= 77){
      String letterGrade = new String("B+");
      return letterGrade;
    }
    
    else if (grade < 77 && grade >= 73){
      String letterGrade = new String("B");
      return letterGrade;
    }
    
    else if (grade < 73 && grade >= 70){
      String letterGrade = new String("B-");
      return letterGrade;
    }
    
    else if (grade < 70 && grade >= 67){
      String letterGrade = new String("C+");
      return letterGrade;
    }
    
    else if (grade < 67 && grade >= 63){
      String letterGrade = new String("C");
      return letterGrade;
    }
    
    else if (grade < 63 && grade >= 60){
      String letterGrade = new String("C-");
      return letterGrade;
    }
    
    else if (grade < 60 && grade >= 57){
      String letterGrade = new String("D+");
      return letterGrade;
    } 
    
    else if (grade < 57 && grade >= 53){
      String letterGrade = new String("D");
      return letterGrade;
    }
    
    else if (grade < 53 && grade >= 50){
      String letterGrade = new String("D-");
      return letterGrade;
    }
    
    else if (grade < 50 && grade >= 0){
      String letterGrade = new String("F");
      return letterGrade;
    } 
    
    /* If the number does fall into any of the above ranges, then it was an invalid number and returns a message to the user */
    else{
      String invalidInput = new String("Sorry, that input was not valid. ");
      return invalidInput;
    }
  }
}