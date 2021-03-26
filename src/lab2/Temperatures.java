package lab2;
import java.util.Arrays;
import java.util.ArrayList;


//problema 2 - instructiuni repetitive
// se da un sir cu valori reale de temperaturi
// impartire in 2 colectii -> temp anormale(>37) si temp normale (<37)

public class Temperatures {

    public static void main(String[] args) {

        double[] temperatures = {38.2, 36.2, 36, 39.0, 37.5};

        ArrayList<Double> normal_temperature = new ArrayList<Double>();
        ArrayList<Double> anormal_temperature = new ArrayList<Double>();
        System.out.println("Temperature list of patients: " + Arrays.toString(temperatures));

        for(int i = 0; i < temperatures.length; i++) {
            if(temperatures[i] > 37.0) {
                anormal_temperature.add(temperatures[i]);
                System.out.println("Pacient no. " + i + " has anormal temperature = " + temperatures[i]);
            } else {
                normal_temperature.add(temperatures[i]);
                System.out.println("Pacient no. " + i + " has normal temperature = " + temperatures[i]);
            }

        }
        System.out.println("Normal temperatures: " + normal_temperature);
        System.out.println("Anormal temperatures: " + anormal_temperature);

    }
}

