package GPACalculation;

import java.util.Scanner;

public class GpaCalculation {

	public static void main(String[] args) {
		
		 Scanner in = new Scanner(System.in);

	        double Totalgp = 0;
	        double Totalcredit = 0;
	        double Gp = 0;

	        final double A = 4.0;
	        final double AMINUS = 3.7;
	        final double BPLUS = 3.33;
	        final double B = 3.0;
	        final double BMINUS = 2.7;
	        final double CPLUS = 2.3;
	        final double C = 2.0;
	        final double CMINUS = 1.7;
	        final double DPlUS = 1.3;
	        final double D = 1.0;
	        final double DMINUS = .7;
	        final double F = 0.00;






	        System.out.println("How many classes do you have?");
	        String Class1 = in.next();
	        int classes = Integer.parseInt(Class1);


	        for (int i = 1; i <= classes; i++) {
	            System.out.println("Enter the course information (Title,Credit hours,Letter grade (grade can be followed by + or -), or enter Q to quit: ");


	            String Courseinfo = in.next();

	            if (Courseinfo.equals("Q")) {
	                break;
	            }
	            String[] data = Courseinfo.split(",");
	            String info = data[0];
	            String hours = (data[1]);
	            String grade = data[2];
	            int credits = Integer.parseInt(hours);








	            if (grade.equals("A") || grade.equals("a")) {
	                Gp = A * credits;
	                Totalgp += Gp;
	                Totalcredit += credits;

	                System.out.println(" Course " + info + " Credit Hours " + credits + " Grade " + grade + " Grade Points " + Gp );





	            } else if (grade.equals("A-") || grade.equals("a-")) {
	                Gp = AMINUS * credits;
	                Totalgp += Gp;
	                Totalcredit += credits;

	                System.out.println(" Course " + info + " Credit Hours " + credits + " Grade " + grade + " Grade Points " + Gp );





	            } else if (grade.equals("B+") || grade.equals("b+")) {
	                Gp = BPLUS * credits;
	                Totalgp += Gp;
	                Totalcredit += credits;

	                System.out.println(" Course " + info + " Credit Hours " + credits + " Grade " + grade + " Grade Points " + Gp );




	            } else if (grade.equals("B") || grade.equals("b")) {
	                Gp = B * credits;
	                Totalgp += Gp;
	                Totalcredit += credits;

	                System.out.println(" Course " + info + " Credit Hours " + credits + " Grade " + grade + " Grade Points " + Gp );




	            } else if (grade.equals("B-") || grade.equals("b-")) {
	                Gp = BMINUS * credits;
	                Totalgp += Gp;
	                Totalcredit += credits;

	                System.out.println(" Course " + info + " Credit Hours " + credits + " Grade " + grade + " Grade Points " + Gp );




	            } else if (grade.equals("C+") || grade.equals("c+")) {
	                Gp = CPLUS * credits;
	                Totalgp += Gp;
	                Totalcredit += credits;

	                System.out.println(" Course " + info + " Credit Hours " + credits + " Grade " + grade + " Grade Points " + Gp );




	            } else if (grade.equals("C") || grade.equals("c")) {
	                Gp = C * credits;
	                Totalgp += Gp;
	                Totalcredit += credits;

	                System.out.println(" Course " + info + " Credit Hours " + credits + " Grade " + grade + " Grade Points " + Gp );





	            } else if (grade.equals("C-") || grade.equals("c-")) {
	                Gp = CMINUS * credits;
	                Totalgp += Gp;
	                Totalcredit += credits;

	                System.out.println(" Course " + info + " Credit Hours " + credits + " Grade " + grade + " Grade Points " + Gp );





	            } else if (grade.equals("D+") || grade.equals("d+")) {
	                Gp = DPlUS * credits;
	                Totalgp += Gp;
	                Totalcredit += credits;

	                System.out.println(" Course " + info + " Credit Hours " + credits + " Grade " + grade + " Grade Points " + Gp );





	            } else if (grade.equals("D") || grade.equals("d")) {
	                Gp = D * credits;
	                Totalgp += Gp;
	                Totalcredit += credits;

	                System.out.println(" Course " + info + " Credit Hours " + credits + " Grade " + grade + " Grade Points " + Gp );





	            } else if (grade.equals("D-") || grade.equals("d-")) {
	                Gp = DMinus * credits;
	                Totalgp += Gp;
	                Totalcredit += credits;

	                System.out.println(" Course " + info + " Credit Hours " + credits + " Grade " + grade + " Grade Points " + Gp );




	            } else if (grade.equals("F") || grade.equals("f")) {
	                Gp = D * credits;
	                Totalgp += Gp;
	                Totalcredit += credits;

	                System.out.println(" Course " + info + " Credit Hours " + credits + " Grade " + grade + " Grade Points " + Gp );




	            } else {


	            }
	        }
	       double Gpa = Totalgp / Totalcredit ;
	        System.out.println("Your Gpa is " + Gpa);

	        }

	    }
