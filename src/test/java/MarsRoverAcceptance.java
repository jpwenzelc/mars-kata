import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarsRoverAcceptance {

    private Rover rover;
    private String command;
    private RoverDriver roverDriver;
    private String output;

    @Test
    void should_return_the_last_position_and_orientation() {
        given_a_rover();
        given_a_string_of_commands();
        given_a_rover_driver();

        when_the_command_is_executed();

        then_should_return_last_position_and_orientation();
    }

    private void then_should_return_last_position_and_orientation() {
        assertEquals("2:3:N", output);
    }

    private void when_the_command_is_executed() {
        output = roverDriver.execute(command);
    }

    private void given_a_rover_driver() {
        roverDriver = new RoverDriver(rover);
    }

    private void given_a_string_of_commands() {
        command = "MMRMMLM";
    }

    private void given_a_rover() {
        rover = new Rover();
    }
}
