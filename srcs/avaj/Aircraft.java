package avaj;

import java.util.ArrayList;
import java.util.List;

// List<int> aicraft_ids = new List<int>();

public class Aircraft extends Flyable {
    protected long id;
    protected String name;
    protected Coordinates coordinates;

    protected Aircraft(long p_id, String p_name, Coordinates p_coordinates){
        id = p_id;
        name = p_name;
        coordinates = p_coordinates;
    }
    @Override
    public void updateConditions() {}
}
