package avaj;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


// UML :

// + public
// - private
// # protected
// ~ package

public class Main {


    private static void readFile(String file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;

        while ((line = reader.readLine()) != null){
            System.out.println(line);
        }
        reader.close();
    }

    public static void main(String[] args) throws IOException {
        try {
            // Ajouter une protection contre aucun fichier dispo
            if (args.length == 0)
                return;

            readFile(args[0]);
            for (int i = 0 ; i < args.length ; i++)
                System.out.println(args[i]);
            Tower t = new Tower();
            
            // WeatherTower wt = new WeatherTower();
            // String test = "World!";
            // System.out.println("Hello " + test);
            Coordinates coords = new Coordinates(1,1,1);
            Helicopter helico = new Helicopter(1, "TestHelico", coords);
            t.register(helico);
            t.unregister(helico);
            t.unregister(helico);
            t.showAll();
            // System.out.println(helico.coordinates.getHeight());
            // helico.updateConditions();
        } catch(BadValueException e) {
            System.out.println(e.getMessage());
        }
    }
}