package RoachSimulation;

public class RoachSimulation

        public static void main(String[] args) {

            populationOfRoaches bugs = new populationOfRoaches();


            bugs.startRoach(10);
            int roachTotal = getRoaches.bugs();
            System.out.println("Initial Roach population is " + roachTotal);

            breed.bugs();
            roachTotal = getRoaches.bugs();
            System.out.println("Roach population after cycle 1 breeding is " + roachTotal);

            spray.bugs(50);
            roachTotal = getRoaches.bugs();
            System.out.println("Roach population after cycle 1 50% spraying is " + roachTotal);

            breed.bugs();
            roachTotal = getRoaches.bugs();
            System.out.println("Roach population after cycle 2 breeding is " + roachTotal);

            spray.bugs(60);
            roachTotal = getRoaches.bugs();
            System.out.println("Roach population after cycle 2 60% spraying is " + roachTotal);

            breed.bugs();
            roachTotal = getRoaches.bugs();
            System.out.println("Roach population after cycle 3 breeding is " + roachTotal);

            spray.bugs(70);
            roachTotal = getRoaches.bugs();
            System.out.println("Roach population after cycle 3 70% spraying is " + roachTotal);

            breed.bugs();
            roachTotal = getRoaches.bugs();
            System.out.println("Roach population after cycle 4 breeding is " + roachTotal);

            spray.bugs(80);
            roachTotal = getRoaches.bugs();
            System.out.println("Roach population after cycle 4 80% spraying is " + roachTotal);

        }
}




