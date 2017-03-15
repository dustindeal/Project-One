/* 
   Author: Dustin Deal
   Date: 3/1/2017
   File Name: Change.java
   
   This program will figure out the change required for a purchase.
   It will then report the number of each denomination of change is required to complete transaction. 
   
*/ 

  import java.util.Scanner; // To capture user input 
  import java.text.DecimalFormat; // To format output
 
  class Change { 
      public static void main ( String [] args) {
  
  // Introducing the user and asking for input 
      Scanner keyboard = new Scanner(System.in); 
      System.out.println("Welcome to my change maker!");
      System.out.print("Please enter the cost of the item: $");
      
      double cost = keyboard.nextDouble();
    
      System.out.print("Please enter the amount tendered: $");
      
      double tender = keyboard.nextDouble();
  
  // Making sure tendered amount is larger than the cost 
     if (tender<cost) {
         System.out.print("You haven't paid enough yet! Please pay more to receive change.");
         }
         
         else {    //Figuring out the denominations 
                   //Checking to see if a denomination fits, then subtracting the denomination from the change. 
        
                   int change = (int)((tender-cost)*100); 
                  
                   int hundred = (change/10000);            // $100 
                   change = change-(hundred*10000);
                   
                   int twenty = (change/2000);              // $20
                   change = change-(twenty*2000);
                   
                   int ten = (change/1000);                 // $10
                   change = change-(ten*1000);
                   
                   int five = (change/500);                 // $5
                   change = change-(five*500);
                   
                   int one = (change/100);                  // $1
                   change = change-(one*100);
                   
                   int quarter = (change/25);               // $0.25
                   change = change-(quarter*25);
                   
                   int dime = (change/10);                  // $0.10
                   change = change-(dime*10);
                   
                   int nickel = (change/5);                 // $0.05
                   change = change-(nickel*5);
                   
                   int penny = (change/1);                  // $0.01 
                   change = change-(penny*1);
               
               // Final Output 
               // Verifyig what the user input, then outputting denominations 
                     
                     DecimalFormat twoplaces = new DecimalFormat("0.0#"); // Formatting the output to 2 decimal places

                     System.out.println("You said the item cost: $"+cost+" and you paid $"+tender);
                     System.out.println("Your change is: $"+twoplaces.format((tender-cost)));
                     
                     System.out.println(hundred+ " $100 bills");
                     System.out.println(twenty+ " $20 bills");
                     System.out.println(ten+ " $10 bills");
                     System.out.println(five+ " $5 bills");
                     System.out.println(one+ " $1 bills");
                     System.out.println(quarter+ " quarters");
                     System.out.println(dime+ " dimes");
                     System.out.println(nickel+ " nickels");
                     System.out.println(penny+ " pennies");
               
    
                     System.out.println("Thank you for your business!");
                     
              } // end of else statement 
            
    } // End of main method
  
  } // end of class 