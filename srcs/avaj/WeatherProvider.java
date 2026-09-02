package avaj;

public class WeatherProvider {
    private static WeatherProvider instance = new WeatherProvider(); //Make this class singleton (one object at a time)
    private WeatherProvider(){}
    
    private String weather[] = {"RAIN", "FOG", "SUN", "SNOW"};

    public static WeatherProvider getInstance() {
        return instance;
    } // Singleton mais peut etre faut le retirer

        
    public String getCurrentWeather(Coordinates p_coordinates){
        return "";
    }
}