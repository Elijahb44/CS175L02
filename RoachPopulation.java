package RoachPopulation;

public class RoachPopulation {

    private int population;

    public void roachStart(int total) {
        population = total;
    }

    public int getRoaches() {
        return population;
    }

    public void breed() {
        population = population*2;
    }

    public void spray(int number) {
        population = population-(population*number)/100;

    }



}