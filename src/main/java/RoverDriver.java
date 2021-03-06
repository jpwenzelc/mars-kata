public class RoverDriver {
    private Rover rover;

    public RoverDriver(Rover rover) {
        this.rover = rover;
    }

    public String execute(String command) {
        for (char character : command.toCharArray()) {
            selectAction(character);
        }
        return roverEndPosition();
    }

    private String roverEndPosition() {
        return rover.currentLocalization();
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
