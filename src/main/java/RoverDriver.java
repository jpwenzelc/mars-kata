public class RoverDriver {
    private Rover rover;

    public RoverDriver(Rover rover) {
        this.rover = rover;
    }

    public String executeCommand(String command) {
        computeEachCommand(command);
        return String.format("%s:%s:%s", rover.getXCoordinate(), rover.getYCoordinate(), rover.getOrientation());
    }

    private void computeEachCommand(String command) {
        for (char character: command.toCharArray()) {
            selectAction(character);
        }
    }

    private void selectAction(char character) {
        if (character == 'R'){
            rover.rotateRight();
        }
        if (character == 'L'){
            rover.rotateLeft();
        }
        if (character == 'M'){
            rover.moveForward();
        }
    }

}
