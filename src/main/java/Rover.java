public class Rover {
    private String orientation;

    public Rover() {
        orientation = "N";
    }

    public String getOrientation() {
        return orientation;
    }

    public void newOrientation(String newOrientation) {
        orientation = newOrientation;
    }
}
