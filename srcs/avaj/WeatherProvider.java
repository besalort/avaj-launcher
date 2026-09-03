package avaj;

public class WeatherProvider {
    private static WeatherProvider instance = new WeatherProvider(); //Make this class singleton (one object at a time)
    private WeatherProvider(){}
    
    private String weather[] = {"RAIN", "FOG", "SUN", "SNOW"};

    public static WeatherProvider getInstance() {
        return instance;
    } // Singleton mais peut etre faut le retirer

    
    // FOG | RAIN
    // -        -
    // SUN | SNOW
    public String getCurrentWeather(Coordinates p_coordinates){
        if (p_coordinates.getLatitude()%360 >= 180)
        {
            if (p_coordinates.getLongitude()%360 >= 180)
                return weather[0];
            else
                return weather[1];
        }
        else
            if (p_coordinates.getLongitude()%360 >= 180)
                return weather[3];
        return weather[2];
    }
}