package CarCostCalculation;

import java.util.Scanner;

public class CarCostCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Cost of regular car: ");
		double costRegularCar = scan.nextDouble();
		
		System.out.println("Enter MPG of regular car: ");
		double mpgRegular = scan.nextDouble();
		
		System.out.println("Enter Cost of hybrid car: ");
		double costHybrid = scan.nextDouble();
		
		System.out.println("Enter MPG of hybrid car: ");
		double mpgHybrid = scan.nextDouble();
		
		System.out.println("Enter miles traveled in a year: ");
		double milesTraveled = scan.nextDouble();
		
		System.out.println("Enter cost per gallon of gas: ");
		double costGallon = scan.nextDouble();
		
// Calculations 
		double yearGasregular = (milesTraveled / mpgRegular) * costGallon;
		
		double yearRegular = costRegularCar + yearGasregular; 
		
		double year2Regular = yearGasregular + yearRegular; 
		
		double year3Regular = yearGasregular + year2Regular; 
		
		double year4Regular = yearGasregular + year3Regular; 
		
		double year5Regular = yearGasregular + year4Regular; 
		
		double yearGashybrid = (milesTraveled / mpgHybrid) * costGallon;
		
		double yearHybrid = costHybrid + yearGashybrid; 
		
		double year2Hybrid = yearGashybrid + yearHybrid;
		
		double year3Hybrid = yearGashybrid + year2Hybrid;
		
		double year4Hybrid = yearGashybrid + year3Hybrid;
		
		double year5Hybrid = yearGashybrid + year4Hybrid; 
		
// Info dump 
		System.out.println("Cost to own after year 1 for regular car: " + yearRegular + " for hybrid car: " + yearHybrid);
		
		System.out.println("Cost to own after year 2 for regular car: " + year2Regular + " for hybrid car: " + year2Hybrid);
		
		System.out.println("Cost to own after year 3 for regular car: " + year3Regular + " for hybrid car: " + year3Hybrid);
		
		System.out.println("Cost to own after year 4 for regular car: " + year4Regular + " for hybrid car: " + year4Hybrid);
		
		System.out.println("Cost to own after year 5 for regular car: " + year5Regular + " for hybrid car: " + year5Hybrid);

// Is the hybrid less expensive after 5 years? 
		if (year5Hybrid < year5Regular)
	    {System.out.println("The hybrid car pays back after 5 years");
 			
        }
		
	}}																																							
