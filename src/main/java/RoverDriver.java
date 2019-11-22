public class RoverDriver {
    private Rover rover;

    public RoverDriver(Rover rover) {
        this.rover = rover;
    }

    public String executeCommand(String command) {
        for (char character: command.toCharArray()) {
            if (character == 'R'){
                rotateRight();
            }
            if (character == 'L'){
                rotateLeft();
            }
        }
        return String.format("0:0:%s", rover.getOrientation());
    }

    private void rotateLeft() {
        if (rover.getOrientation().equals("N")){
            rover.newOrientation("W");
        } else if (rover.getOrientation().equals("W")){
            rover.newOrientation("S");
        } else if (rover.getOrientation().equals("S")){
            rover.newOrientation("E");
        } else if (rover.getOrientation().equals("E")){
            rover.newOrientation("N");
        }
    }

    private void rotateRight() {
        if (rover.getOrientation().equals("N")){
            rover.newOrientation("E");
        } else if (rover.getOrientation().equals("E")){
            rover.newOrientation("S");
        } else if (rover.getOrientation().equals("S")){
            rover.newOrientation("W");
        } else if (rover.getOrientation().equals("W")){
            rover.newOrientation("N");
        }
    }
}
