package cardecisionstring;

import java.util.Scanner;

public class cardecisionstring {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in); 
    	
        
        System.out.println("Enter the info for the regular car (format Make and Model, Cost, MPG): ");
        String regularInfo = in.nextLine();
        
        System.out.println("Enter the info for the hybrid car (format Make and Model, Cost, MPG): ");
        String hybridInfo = in.nextLine();
        
        System.out.println("Enter the miles traveled in a year: ");
        double milesTraveled = in.nextDouble();
        
        System.out.println("Enter the cost per gallon gas: ");
        double costGallon = in.nextDouble();
        
// Splits and variables from u input 
        String carRegularName = regularInfo.substring(0, 14);	    	             
        String costRegular = regularInfo.substring(15, 20);
        String milesPerGallon = regularInfo.substring(21, 23);
        int costReg = Integer.parseInt(costRegular);
        int mpgRegular = Integer.parseInt(milesPerGallon);
                
        String carHybrid = hybridInfo.substring(0, 12);
        String costHyb = hybridInfo.substring(13, 18);
        String carHybGallon = hybridInfo.substring(19, 21);
        int costHybrid = Integer.parseInt(costHyb);
        int mpgHybrid = Integer.parseInt(carHybGallon);
                
  //calculations 
         double yearGasregular = (milesTraveled / mpgRegular) * costGallon;
         double yearRegular = costReg + yearGasregular;
         double year2Regular = yearGasregular + yearRegular;
         double year3Regular = yearGasregular + year2Regular;
         double year4Regular = yearGasregular + year3Regular;
         double year5Regular = yearGasregular + year4Regular;
         double yearGashybrid = (milesTraveled / mpgHybrid) * costGallon; 
         double yearHybrid = costHybrid + yearGashybrid;
         double year2Hybrid = yearGashybrid + yearHybrid;
         double year3Hybrid = yearGashybrid + year2Hybrid;
         double year4hybrid = yearGashybrid + year3Hybrid;
         double year5hybrid = yearGashybrid + year4hybrid; 
         
   // Info dump
           System.out.println("cost to own " + carRegularName + " after 1 year : " + yearRegular + " for " + carHybrid + ": " + yearHybrid);
           System.out.println("cost to own " + carRegularName + " after 2 year : " + year2Regular + " for " + carHybrid + ": " + year2Hybrid);
           System.out.println("cost to own " + carRegularName + " after 3 year : " + year3Regular + " for " + carHybrid + ": " + year3Hybrid);
           System.out.println("cost to own " + carRegularName + " after 4 year : " + year4Regular + " for " + carHybrid + ": " + year4hybrid);
           System.out.println("cost to own " + carRegularName + " after 5 year : " + year5Regular + " for " + carHybrid + ": " + year5hybrid);

           


           
   // Is the hybrid less expensive after 5 years?
           if (year5hybrid < year5Regular);
           {
        	       System.out.println("The " + costHybrid + "pays back to owner after 5 years");
                   }
           
   }             		
        
                
        
        
        
        

}
