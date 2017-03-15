/* 
   Author: Dustin Deal
   Date: 3/1/2017
   File Name: Quadratic.java
   
   This program will solve a quadratic equation of the form ax2 + bx + c = 0
   Where a, b, and c are real numbers and are inputted by the user. 
   
*/ 

  import java.util.Scanner; // To capture user input
  import java.lang.Math; // To calculate the square root 
  import java.text.DecimalFormat; // To format output
  
  class Quadratic { 
      public static void main ( String [] args) {
  
      // Directing the user of the function of the program & what to input  
      
      System.out.println("Welcome to my Quadratic calculator!");
      System.out.println("I will solve equations of the form   < A*x2 + B * x + C = 0 > for the variable x."); 
      System.out.println("Please enter in the three coefficients in order of A, B and C.");
      
      // Setting up the input  
      
      Scanner keyboard = new Scanner(System.in);
            
      double coefficientA;    // creating three variables to store the coefficients
      double coefficientB;
      double coefficientC;
      
      // Receiving input  
      
      System.out.print("A: ");
      coefficientA = keyboard.nextDouble();
      
      System.out.print("B: ");
      coefficientB = keyboard.nextDouble();
      
      System.out.print("C: "); 
      coefficientC = keyboard.nextDouble(); 
      
  
      System.out.println("You input: " + coefficientA + "x^2 + " + coefficientB + "x + " + coefficientC + " = 0");  //Displaying what the user input
      
      
      // Calculations // 
      
      /* Here I set up an if statement to check if the user input 0 for A
         which would not be a quadratic equation and therefore be unsolvable. */  
      
      if (coefficientA == 0){ 
            System.out.println("Sorry, this equation is not a quadratic.");
            }
            
            else { 
  
             double answerRoot; 
     
             answerRoot = (coefficientB*coefficientB)-(4*(coefficientA*coefficientC)); // b^2 - 4ac 
             
             if (answerRoot < 0){ // Making sure the discriminant is positive 
               System.out.println("There are no real solutions.");
               }
               
               else{
               
                     answerRoot = Math.sqrt(answerRoot); // Taking the square root of the discriminant
                      
                      // Solution adding B 
                      double answerPos;
                      answerPos = (-1*coefficientB)+answerRoot; // adding -b
                      answerPos = answerPos / (coefficientA*2.0); // /2a 
         
  
                      // Solution subtracting B  
                      
                      double answerNeg;
                      answerNeg = (-1*coefficientB)-answerRoot; // subtracting -b
                      answerNeg = answerNeg / (coefficientA*2.0); // /2a 
                   

                      // Final Output  
         
                      DecimalFormat twoplaces = new DecimalFormat("0.00"); // Formatting the output to 2 decimal places
         
                      System.out.println("The solutions to this problem are:"); 
                      System.out.println("X: "+twoplaces.format(answerNeg));
                      System.out.println("x: "+twoplaces.format(answerPos));   
  
  
               } // End of else statement checking for real numbers
  
            } // End of else statement checking for a=0
            
            System.out.println("Thank you for using my quadratic solving program!");
            
    } // End of main method
  
  } // end of class 