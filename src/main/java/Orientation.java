import java.util.Map;

public class Orientation {

    String orientation;

    Map<String, String> right = Map.of(
            "N","E",
            "E","S",
            "S","W",
            "W","N"
    );

    Map<String,String> left = Map.of(
            "N","W",
            "W","S",
            "S","E",
            "E","N"
    );

    public Orientation() {
        orientation = "N";
    }

    void rotateLeft() {
        orientation = left.get(orientation);
    }

    void rotateRight() {
        orientation = right.get(orientation);
    }

}