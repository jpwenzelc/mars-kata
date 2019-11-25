public class Rover {

    private int y;
    private int x;
    private String orientation;

    public Rover() {
        orientation = "N";
    }

    public int getYCoordinate() {
        return y;
    }

    public int getXCoordinate() {
        return x;
    }

    public String getOrientation() {
        return orientation;
    }

    void rotateLeft() {
        if (orientation.equals("N")){
            orientation = "W";
        } else if (orientation.equals("W")){
            orientation = "S";
        } else if (orientation.equals("S")){
            orientation = "E";
        } else if (orientation.equals("E")){
            orientation = "N";
        }
    }

    void rotateRight() {
        if (orientation.equals("N")){
            orientation = "E";
        } else if (orientation.equals("E")){
            orientation = "S";
        } else if (orientation.equals("S")){
            orientation = "W";
        } else if (orientation.equals("W")){
            orientation = "N";
        }
    }

    void moveForward() {
        if ("E".equals(orientation)){
            x ++;
        } else if ("N".equals(orientation)){
            y ++;
        } else if ("W".equals(orientation)){
            x --;
        } else if ("S".equals(orientation)){
            y --;
        }
    }

}
