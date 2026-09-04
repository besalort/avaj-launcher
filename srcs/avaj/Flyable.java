package avaj;

public abstract class Flyable {
    protected WeatherTower weatherTower;

    public abstract long getId();
    public abstract String getName();
    public abstract void updateConditions();

    public void registerTower(WeatherTower p_tower) {weatherTower = p_tower;}
}
