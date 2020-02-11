import java.util.Map;

import static java.util.Map.*;

public class Orientation {

    private String orientation;

    private Map<String, String> right = of(
            "N","E",
            "E","S",
            "S","W",
            "W","N"
    );

    private Map<String,String> left = of(
            "N","W",
            "W","S",
            "S","E",
            "E","N"
    );

    public Orientation() {
        orientation = "N";
    }

    public Orientation(String orientation) {
        this.orientation = orientation;
    }

    void rotateLeft() {
        orientation = left.get(orientation);
    }

    void rotateRight() {
        orientation = right.get(orientation);
    }

    public String getOrientation() {
        return orientation;
    }

}