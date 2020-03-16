package NoaaHeatIndex;

import java.util.Scanner;

public class HeatIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	        Scanner sc = new Scanner(System.in);

	        System.out.println(" NOAAs National Weather Service");
	        System.out.println(" heatInd");
	        System.out.println(" ");
	        System.out.println("relTemp(F)");
	        System.out.println("Hum(%)");

	        System.out.printf("       ");


	        for (int temperature = 80; temperature <= 110; temperature = temperature+2) {
	            System.out.printf("%6d", temperature);
	        }
	        System.out.println();
	        System.out.println("____________________________________________________________________________________________");


	        for (int hum = 40; hum <= 100; hum = hum+5) {

	            System.out.printf("%3d  | ", hum );for(int a = 80; a <= 110; a = a + 2) {

	                String nothing = " ";

	                int calculation = (int)(-42.379 + (2.04901523 * a) + (10.14333127 * hum) - (.22475541 * a * hum) - (.00683783 * a * a) - (.05481717 * hum * hum) - (.00122874 * a * a * hum) - (.00085282 * a * hum * hum) - .00000199 * a * a * hum * hum);
	                if (calculation <= 137) {
	                    System.out.printf("%6d", calculation);
	                }
	                else

	                    System.out.printf("%6s", nothing);


	                System.out.println();
	            }


	            boolean run = true;
	            while(run == true){
	                System.out.println("Enter temperature or 0 to end: ");
	                double temperature2 = sc.nextDouble();
	                if (temperature2 == 0) {
	                    run = false;
	                    System.out.println("You quit");
	                    break;
	                }


	                System.out.println("Enter relative humidity: ");
	                double hum2 = sc.nextDouble();

	                double thi = -42.379 + (2.04901523 * temperature2) + (10.14333127 * hum2) -
	                        (.22475541 * temperature2 * hum2) - (.00683783 * temperature2 * temperature2) - (.05481717 * hum2 * hum2) +
	                        (.00122874 * temperature2 * temperature2 * hum2) + (.00085282 * temperature2 * hum2 * hum2) - .00000199 * temperature2 * temperature2 * hum2 * hum2;
	                System.out.println("The THI for a temperature of " + (int) temperature2 + " and relative humidity of " + (int) hum2 + " is " + (int) thi);

	                if (thi <= 90) {
	                    System.out.println("Caution Advisory");
	                }
	                else if (thi < 105) {
	                    System.out.println("Extreme Caution Advisory");
	                }
	                else if (thi < 126) {
	                    System.out.println("Danger Advisory");
	                }
	                else {
	                    System.out.println("Extreme Danger Advisory ");
	                }
	            }
	        }




	    }

	



	}


