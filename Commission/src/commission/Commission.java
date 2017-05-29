
package commission;
import java.util.Scanner;

public class Commission {

    
    public static void main(String[] args) {
      //Create scanner to obtain user input
        Scanner input = new Scanner( System.in );
   
       
   
    double Total = 0;
    double AnnualSales = 0;
    double Comission ;
    
    
    Comission = .05; //Establishes the comission is 5 percent
    
        //Prompts the user to enter data
        System.out.print( "Enter Your Sales For The Year: ");
        AnnualSales = input.nextInt();//Input the user data
 
    //Engages the bonus if sales are more than $120,000. 
     while ( AnnualSales >=120000 )
        { 
        Comission = AnnualSales * 0.05; //calculate the user data 
        Total = Comission + 60000;//Calculate the Comission and default salary
        System.out.printf( " Your Total Annual Salary is $%.2f\n" , Total );
        break;
        }
 
     //If sales are less than $120,000, the screen will display the default salary.
     while ( AnnualSales < 120000 )
        {
         //Display the annual salary    
   
      System.out.println( " Your Total Annual Salary is $60,000 " ); 
           
        break;
        }
     
     //If sales are more than $150,000, the extra bonus will be enabled.
      while ( AnnualSales > 150000 )
      {
        Comission = AnnualSales * 0.065; //calculate the user data 
        Total = Comission + 60000;//Calculate the Comission and default salary
System.out.printf( " Congratulations! You have exceeded the sales goal for the year.\n" );
System.out.printf( " You have earned a bonus, your new salary, including the yearly bonus is $%.2f\n" , Total );
System.out.print( " The following examples are the potential compensations you could have earned\n");     
System.out.print ( " In increments of $ 5,000 \n");
break;
      }
      
    //Displays the potential salary in increments of $5,000.
      double Increment = 5000;
      double PotentialEarnings;
       PotentialEarnings = 0;
      
              
       PotentialEarnings = Total + Increment;
       
       while ( PotentialEarnings <= AnnualSales *0.5) 
       {

           System.out.printf( " $%.2f\n ", PotentialEarnings);
          PotentialEarnings = PotentialEarnings + 5000;
          
                  
        }
      

         
         }
        
    }
    

