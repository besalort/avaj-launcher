package avaj;

public class Helicopter extends Aircraft {
    public Helicopter(long p_id, String p_name, Coordinates p_coordinates) {
        super(p_id, p_name, p_coordinates);
    }

    @Override
    public void updateConditions(){
        System.out.println(weatherTower.getWeather(coordinates));
        //Recuperer les conditions meteorologiques et adapter les coords ?
    }
}
