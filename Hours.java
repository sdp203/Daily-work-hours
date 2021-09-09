/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hours;
import java.util.Scanner;
import java.util.*;
/**
 *
 * @author Staff
 */
public class Hours {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
         Scanner keyboard = new Scanner(System.in);
      Scanner console = new Scanner(System.in);
      double overtime=0;
         

      Scanner ed = new Scanner(System.in);
        String name;

                {


double wages = 0, rate=0, hours;
System.out.print("Enter the working hours:");
hours = console.nextDouble();
System.out.println();

 

 

if(hours < 36)

wages = hours * rate;

else if (hours > 36.0 && hours<=41)

                wages = 36.0 * rate +

                                                1.5 * rate * (hours - 36.0);

 

 

else if (hours > 41.0 && hours<=48)

                wages = 36.0 * rate +

                                                2 * rate * (hours - 36.0);

 

               

 

System.out.printf("The TotalSalary are $%.2f %n",wages);

 

System.out.println();

 

}

    }
}

