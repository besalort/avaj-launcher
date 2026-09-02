package avaj;

// UML :

// + public
// - private
// # protected
// ~ package

public class Main {
    public static void main(String[] args) {
        try {
            String test = "World!";
            System.out.println("Hello " + test);
            Coordinates coords = new Coordinates(1, 1, 1);
            coords.setLongitude(2);
            Helicopter helico = new Helicopter(1, "TestHelico", coords);
            System.out.println(helico.coordinates.getHeight());
        } catch(BadValueException e) {
            System.out.println(e.getMessage());
        }
    }
}