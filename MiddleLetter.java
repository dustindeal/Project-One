/* 
   Author: Dustin Deal
   Date: 3/1/2017
   File Name: MiddleLetter.java
   
   
   This program will ask the user to input a multiple word phrase and store it in a string.
   It will then output the: length of string, substring of original with first and last letter
   missing, the location of the first letter "e" , and the middle letter of the string.
   
*/ 

  import java.util.Scanner; // To capture user input  
  class MiddleLetter { 
      public static void main ( String [] args) {
  
  // Introducing the user and asking for input 
  
      Scanner keyboard = new Scanner(System.in); 
      System.out.println("Welcome to my phrase program!");
      System.out.println("Please input a multiple word phrase of your choice: ");
      
      String phrase = keyboard.nextLine();
      
 // String Properties 
       
      int length = phrase.length(); // Determining string length 
      String substring = phrase.substring(1,(length-1)); // Creating a substring without the first and last characters 
      int indexE = phrase.indexOf("e"); // Searching the string for "e"
      char middleChar; 
    
    // Created an if statement depending on when the string is even or odd
    // to find the middle letter. 
    
      if (length % 2 !=0){
      middleChar = phrase.charAt(length/2);
         }
         
         else {
         middleChar = phrase.charAt((length/2)-1);
         }
      
    // Outputting the properties to the user 
    
         System.out.println("You input the phrase: "+phrase);
         System.out.println("Length: "+length+" characters.");
         System.out.println("Substring without first and last letters: "+substring);
         System.out.println("The middle character: "+middleChar);
       
       // If statement for when the user enters a phrase without the letter E 
         
             if (indexE<0){  
               System.out.println("Position where first 'E' appears: No 'E' within phrase.");
               }
             else {
               System.out.println("Position where first 'E' appears: "+indexE);
                 }
           
         System.out.println("Thank you for using my program.");
            
    } // End of main method
  
  } // end of class 