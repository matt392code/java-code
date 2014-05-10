// This program determines the amount of money that is compounded at 8%
// over time (subtracting 30% per month for taxes. 
// Run this program from the command line.
// User is prompted to enter the number of years that they want to invest,
// amount that they want to deposit each month and the initial amount.
// Results sent to screen and text file.
// Distributed under the GNU GPL: www.gnu.org

import javax.swing.JOptionPane;
import java.io.*;
import java.text.DecimalFormat;

class Compound9
  {   // Start class Compound9
      // Declare variables
  float mike, mike2, mike3, mike4;
  float interest;  // Interest amount 
  float amount, amount2;    // Initial amount invested
         double i=1;
  float months, months2;   //  Number of months money is going to be
                  //  deposited/invested; calculated from years
  float MonthlyAmount;  //  Amount deposited each month
  float initial, initial2; // Initial deposit
  float years, hotel2, hotel3;
  int n;
  String line;
 
  String bravo;
  String charlie;
  int delta, redhat;
  int echo;
  int foxtrot;

    // Method to ask user to enter in number of years
    // Method returns float
    float NumberYears() throws java.io.IOException
        {  // Start NumberYears method
         int delta = 0;       
         float hotel;  // Number of years money is going to be deposited/invested
         hotel = 0;
         String alpha;
           do {
                try {
                    // Print input question to screen
                    System.out.println("\nHow many years do you want to invest?");
                    //  Use the standard input stream in the System class, feed keyboard input
                    //  into variable "isr" of InputStreamReader class
              InputStreamReader isr = new InputStreamReader(System.in);
                    //  Feed information from variable "isr" into variable "br" of BufferedReader class
              BufferedReader br = new BufferedReader(isr);
                    //  Reading the Buffered Reader "br" into the String variable "alpha"
                    alpha = br.readLine();
                    // Cast String "alpha" into an float and return result
                    // to main part of program
                    hotel = (Float.parseFloat(alpha));
                    delta++;  // Increment do-while flag variable if a number is entered
                     } // end try loop
                    
           catch (IOException golf) {  // Start catch for IOException
                    System.out.println("IO Error - error caught: " + golf.getMessage());
                    golf.printStackTrace();
                    } // End catch IO Exception
                   
            // Catch exception if letter is entered
           catch (NumberFormatException echo) {
                System.out.println("You did not enter a number.");
                System.out.println("Error caught; you entered: " + echo.getMessage());
                echo.printStackTrace();
                // When program reaches this point, delta is still 0
                // therefore it will do the loop again
                }  // End catch
           } // End do
           while (delta == 0);
           // returns value in hotel to main program
           return hotel;
        } // End NumberYears method

     // Method to get amount deposited each month from user
    float MonthlyDeposit() throws java.io.IOException
        {  // Start MonthlyDeposit method
        do
            {  // Start do loop
                try
                    { // Start try section
                    // Print input question to screen
                    System.out.println("\nHow much do you want to deposit each month?");
                    //  Use the standard input stream in the System class, feed keyboard input
                    //  into variable "isr" of InputStreamReader class
              InputStreamReader isr = new InputStreamReader(System.in);
                    //  Feed information from variable "isr" into variable "br" of BufferedReader class
              BufferedReader br = new BufferedReader(isr);
                    //  Reading the Buffered Reader "br" into the String variable "bravo"
                    bravo = br.readLine();
                    // Cast String "bravo" into an float
                    hotel2 = Float.parseFloat(bravo);
                    // If exception is thrown on the line before, foxtrot++ is skipped
                    foxtrot++;
                    } //  End try section
                  
                   catch (IOException xray) {
                            System.out.println("IO Error - error caught: " + xray.getMessage());
                            xray.printStackTrace();
                            } // End IOException
                           
                   // Catch exception if letter is entered
                   catch (NumberFormatException hp) { 
                        System.out.println("You did not enter a number.");
                        System.out.println("Error caught; you entered: " + hp.getMessage());
                        hp.printStackTrace();
                        // Foxtrot is still zero at this point
                        }  // End catch for NumberFormatException
            } // End do loop      
               //  Flag that determines when do-while loop ends
               while (foxtrot == 0);    
               return hotel2;
        }  // End MonthlyDeposit method
       
    // InitialAmount method gets the initial amount invested
    float InitialAmount() throws java.io.IOException {
    do {  // Start do loop
        try {
            System.out.println("\nHow much is the initial investment?");
            // Feed keyboard input into InputStreamReader "isr"
            InputStreamReader isr = new InputStreamReader(System.in);
            // Feed InputStreamReader into BufferedReader
            BufferedReader br = new BufferedReader(isr);
            // Read the BufferedReader into variable "charlie"
            charlie = br.readLine();
            //  Cast String "charlie" into float and put into variable "hotel3"
            hotel3 = (Float.parseFloat(charlie));
            // Increment do-while flag variable if a number is entered
            redhat++;
            }  // End try section
       
        catch (IOException redhat2) {
            System.out.println("IOError - error caught: " + redhat2.getMessage());
            redhat2.printStackTrace();
            }  // End IO catch statement
           
        catch (NumberFormatException suse) {
            System.out.println("You did not enter a number");
            suse.getMessage();
            suse.printStackTrace();
            }  // End of NumberFormat catch
        } // End do loop
        while (redhat == 0);
            return hotel3;
    } // End InitialAmount method
   
    // NegativeCheck method checks for a negative number
    float NegativeCheck(float kilo) {
            if (kilo < 0) {
                System.out.println("Please enter a positive number.");
                mike = 0;
                          }  // End if statement
            else {
                mike = 1;
                 }
            return mike;
            }  // End NegativeCheck

float months()   // Method to calculate number of months
  {
  months = years * 12;
  System.out.println("The number of months is: " + months);
  return months;
  }
 
    // Method to calculate interest, print it out to the
    // the screen and write it to a file
float calculate(float months3, float initial2) 
  {
      try  // Loop to try to write to a file
   {
                 File temp = new File("Compound9.txt"); // Create new file
             FileWriter fw = new FileWriter(temp); // Create new FileWriter
             BufferedWriter out = new BufferedWriter(fw);// Create new BufferedWriter
     // Pass initial2 into variable "amount"
             amount = initial2;
        
     // Calculate interest for the first month
            // Calculate monthly interest (.08/12)
            // 8% annual growth (historical avg for stocks)
           interest = (float)(amount * .00667);
    // 20% taxes taken out
       interest = (float)(interest * .8);
            //  Interest added to running total
              amount = (amount + interest);
            //  Format the output to 2 decimal places and put a comma in (US style)
                            DecimalFormat roundTwo = new DecimalFormat("###,###,###,###.##");
            // Information placed in the String object "line" to be sent to file
                line = ("The amount after " + i + " months is $ " + roundTwo.format(amount) + "\n");
            // Information sent to screen
                System.out.println("The amount after " + i + " months is $ " + roundTwo.format(amount));
            // Write String "line" to file
       out.write(line);
   // NOTE: The reason that the first month interest is separate from the main loop is
   // because I wanted to make sure that the first month's interest was only calculated
   // for the initial deposit, not the initial deposit plus the first month's deposit.
            // Loop calculates from month 2 onward
            // Start for loop to determine compounding interest; limited by the number of months
   for (i = 2; i <=months3; i++)
    {
            //  Add monthly deposit to total amount
    amount = (amount + MonthlyAmount);
            // Calculate monthly interest (.08/12)
            // 8% annual growth (historical avg for stocks)
      interest = (float)(amount * .00667);
    // 20% taxes taken out
           interest = (float)(interest * .8);
            //  Interest added to running total
    amount = (amount + interest);
            //  Format the output to 2 decimal places and put a comma in (US style)
            //  DecimalFormat roundTwo = new DecimalFormat("###,###,###,###.##");
            // Information placed in the String object "line" to be sent to file
                line = ("The amount after " + i + " months is $ " + roundTwo.format(amount) + "\n");
            // Information sent to screen
                System.out.println("The amount after " + i + " months is $ " + roundTwo.format(amount));
            // Write String "line" to file
       out.write(line);
    }  // End for loop
    out.close(); // Close text file
   }  // End try loop

       catch (Exception e) { // Catch exception if fail to write file
    System.out.println("An error has occured: " + e.toString());
   } // End catch
   return amount;
  }  // End calculate method

            // Start main method, telling program to throw IO Exception
  public static void main(String[] arguments) throws java.io.IOException
    {
  // Ask user to answer upcoming questions with dialogue box   
    JOptionPane.showMessageDialog(
                null, "Please answer the following questions. " );
       
      // Create new handle called "foxtrot" of type "Compound9"
                // Attach handle to new "Compound9" object
    Compound9 foxtrot = new Compound9();

                // Get number of years
                do {
                    // return variable "hotel" is being passed into variable "years"
                    foxtrot.years = foxtrot.NumberYears();
                    // pass variable "years" into NegativeCheck method
                    // result goes into "mike2"
                    foxtrot.mike2 = foxtrot.NegativeCheck(foxtrot.years);
                    }  // End do
                   // if "mike" is equal to 0, user is asked for the information again
                 while(foxtrot.mike2 == 0);
                 System.out.println("The number of years you entered is: " + foxtrot.years);
               
                // Get amount per month to be deposited
                do {   
                    // return variable "hotel2" is passed into variable "MonthlyAmount"
                    foxtrot.MonthlyAmount = foxtrot.MonthlyDeposit();
                    // pass variable "MonthlyAmount" into NegativeCheck method
                    // result goes into "mike3"
                    foxtrot.mike3 = foxtrot.NegativeCheck(foxtrot.MonthlyAmount);
                    }  // End do loop
                    // if mike3 is 0, user is asked for input again
                    while (foxtrot.mike3 == 0);
                System.out.println("The amount per month entered is: " + foxtrot.MonthlyAmount);

                // Get initial amount to be deposited
                do {
                    // Return variable "redhat" and place in variable "initial"
                    foxtrot.initial = foxtrot.InitialAmount();
                    // Pass "initial" into NegativeCheck method and return result into "mike4"
                    foxtrot.mike4 = foxtrot.NegativeCheck(foxtrot.initial);
                    } // while "mike4" is 0, user will be asked for input
                    while (foxtrot.mike4 == 0);
                System.out.println("The initial amount entered is: " + foxtrot.initial);
               
                // Call months method to determine number of months
             foxtrot.months2 = foxtrot.months(); 
        // Call calculate method to calculate interest
          foxtrot.amount2 = foxtrot.calculate(foxtrot.months2, foxtrot.initial); 

                // Create "roundTwo" object of DecimalFormat class to properly format screen output
                
                DecimalFormat roundTwo = new DecimalFormat("###,###,###,###.##");

// Show results to user on command line
System.out.println("\nThe initial amount of $" + foxtrot.initial + " after adding $ " + foxtrot.MonthlyAmount + " per month" );
System.out.println ("for " + foxtrot.years + " years and growing at 8% per year (with 20% taken off for taxes)");
System.out.println ("becomes >>>>>>>> $" + roundTwo.format(foxtrot.amount2) + " <<<<<<<<<" + "\n");
System.out.println ("This has been written to a text file called: compound9.txt.\n");

   // Show results to user in dialogue box
   JOptionPane.showMessageDialog(
   null, "The initial amount amount of $" + foxtrot.initial + " after adding $" + foxtrot.MonthlyAmount + " per month for " + foxtrot.years + " years \n and growing at 8% per year (with 20% taken off for taxes) becomes >> $" + roundTwo.format(foxtrot.amount2) + "\n This has been written to a text file called: compound9.txt.");
   System.exit( 0 );

    }  // Close main() method
  }  // Close class compound9
