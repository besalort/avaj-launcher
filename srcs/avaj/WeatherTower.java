package avaj;

public class WeatherTower {
    
    public String getWeather(Coordinates p_coordinates) {
        WeatherProvider wp = WeatherProvider.getInstance();

        return wp.getCurrentWeather(p_coordinates);
    }

    public void changeWeather(){}
}
