package CarCostCalculation2;

import java.util.Scanner;

public class CarCostCalculationdos {

	    public static void main(String[] args) {
		
                        // v2 User inputs
	    	                    @SuppressWarnings("resource");
	    	                    Scanner in = new Scanner(system.in);
	    	                    @SuppressWarnings("resource");
	    	                    Scanner in1 = new Scanner(System.in);
	    	                    
	    	                    System.out.println("Enter the info for the regular car (format Make and Model, Cost, MPG): ");
	    	                    String regularInfo = in.nextLine();
	    	                    
	    	                    System.out.println("Enter the info for the hybrid car (format Make and Model, Cost, MPG): ");
	    	                    String hybridInfo = in.hasNextLine();
	    	                    
	    	                    System.out.println("Enter the miles traveled in a year: ");
	    	                    double milesTraveled = in.nextDouble();
	    	                    
	    	                    System.out.println("Enter the cost per gallon gas: ");
	    	                    double costGallon = in.nextDouble();
	    	                    
	    	            // Splits and variables from u input 
	    	                    String[] arrRegularinfo = regularInfo.split(", ");
	    	                            String mmRegular = arrRegularinfo[0];
	    	                            int costRegular = Integer.parseInt(arrRegularinfo[1]);
	    	                            int mpgRegular = Integer.parseInt(arrRegularinfo[2]);
	    	                            
	    	                    String[] arrHybridinfo = hybridInfo.split(", ");
	    	                            String mmHybrid = arrHybridinfo[0];
	    	                            int costHybrid = Integer.parseInt(arrHybrid[1]);
	    	                            int mpgHybrid = Integer.parseInt(arrHybridinfo[2]);
	    	                            
	    	              //calculations 
	    	                     double yearGasregular = (milesTraveled / mpgRegular) * costGallon;
	    	                     double yearRegular = costRegular + yearGasregular;
	    	                     double year2Regular = yearGasregular + yearRegular;
	    	                     double year3Regular = yearGasregular + year2Regular;
	    	                     double year4Regular = yearGasregular + year3Regular;
	    	                     double year5Regular = yearGasregular + year4Regular;
	    	                     double yearGashybrid = (milesTraveled / mpgHybrid) * costGallon; 
	    	                     double yearHybrid = costHybrid + yearGashybrid;
	    	                     double year2Hybrid = yearGashybrid + yearHybrid;
	    	                     double year3Hybrid = yearGashybrid + year2hybrid;
	    	                     double year4hybrid = yearGashybrid + year3Hybrid;
	    	                     double year5hybrid = yearHashybrid + year4Hybrid; 
	    	                     
	    	               // Info dump
	    	                       System.out.println("cost to gain ownership after year 1 for " + mmRegular + ": " + yearRegular + " for " + mmHybrid + ":
	    	                       System.out.println("cost to gain ownership after year 2 for " + mmRegular + ": " + year2Regular + " for " + mmHybrid + ":
	    	                       System.out.println("cost to gain ownership after year 3 for " + mmRegular + ": " + year3Regular + " for " + mmHybrid + ":
	    	                       System.out.println("cost to gain ownership after year 4 for " + mmRegular + ": " + year4Regular + " for " + mmHybrid + ":
	    	                       System.out.println("cost to gain ownership after year 5 for " + mmRegular + ": " + year5Regular + " for " + mmHybrid + ":
	    	      	    	                                                               
	    	                       
	    	               // Is the hybrid less expensive after 5 years?
	    	                       if (year5Hybrid < year5Regular);
	    	                       {
	    	                    	       System.out.println("The " + mmHybrid + "pays back to owner after 5 years");
	    	                               }
	    	                       
	                       }             		
	    	                    
	    	                            
	    	                    
	    	                    
	    	                    
	    	                    

}
