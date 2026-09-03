package avaj;

class BadValueException extends RuntimeException {
    public BadValueException(String message) {
        super(message);
    }
}

public class Coordinates {
    private int longitude;
    private int latitude;
    private int height;

    Coordinates(int p_longitude, int p_latitude, int p_height){
        longitude = p_longitude;
        latitude = p_latitude;
        height = p_height;
    }
    public int getLongitude(){return longitude;}
    public int getLatitude() {return latitude;}
    public int getHeight() {return height;}

    public void setLongitude(int p_longitude) {
        if (p_longitude >= 0)
            longitude = p_longitude;
        else
            throw new BadValueException("Error: invalid longitude value.");
    }
    public void setLatitude(int p_latitude) {
        if (p_latitude >= 0)
            latitude = p_latitude;
        else
            throw new BadValueException("Error: invalid latitude value.");
    }
    public void setHeight(int p_height) {
        if (p_height >= 0)
        {
            if (p_height > 100)
                height = 100;
            else
                height = p_height;
        }
        else
            throw new BadValueException("Error: invalid height value.");
    }
}
