import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class RoverDriverTest {

    private RoverDriver roverDriver;
    private String command;

    @Mock private Rover rover;

    @BeforeEach
    void setUp() {
        given_a_rover_driver();
    }

    @Test
    void execute_the_r_command_should_call_the_rotate_right_method_on_the_rover() {
        given_a_command("R");

        when_the_command_is_executed();

        then_rover_driver_should_make_the_rover_turn_right();
    }

    @Test
    void execute_the_rr_command_should_call_the_rotate_right_method_twice_on_the_rover() {
        given_a_command("RR");

        when_the_command_is_executed();

        then_rover_driver_should_make_the_rover_turn_right_twice();
    }

    @Test
    void execute_the_rrr_command_should_call_the_rotate_right_method_three_times_on_the_rover() {
        given_a_command("RRR");

        when_the_command_is_executed();

        then_rover_driver_should_make_the_rover_turn_right_three_times();
    }

    @Test
    void execute_the_l_command_should_call_the_rotate_left_method_on_the_rover() {
        given_a_command("L");

        when_the_command_is_executed();

        then_rover_driver_should_make_the_rover_turn_left();
    }

    @Test
    void execute_command_with_a_m_should_call_the_move_method_on_the_rover() {
        given_a_command("M");

        when_the_command_is_executed();

        then_rover_driver_should_make_the_rover_move_forward();
    }

    @Test
    void execute_command_with_a_m_should_call_the_move_method_twice_on_the_rover() {
        given_a_command("MM");

        when_the_command_is_executed();

        then_rover_driver_should_make_the_rover_move_forward_twice();
    }

    @Test
    void execute_command_with_a_rm_should_make_the_rover_end_in_10E() {
        given_a_command("RM");

        when_the_command_is_executed();

        then_rover_driver_should_make_the_rover_rotate_right_and_then_move();
    }

    private void given_a_command(String command) {
        this.command = command;
    }

    private void given_a_rover_driver() {
        roverDriver = new RoverDriver(rover);
    }

    private void when_the_command_is_executed() {
        roverDriver.execute(command);
    }

    private void then_rover_driver_should_make_the_rover_rotate_right_and_then_move() {
        InOrder inOrder = inOrder(rover);
        inOrder.verify(rover).rotateRight();
        inOrder.verify(rover).moveForward();
    }

    private void then_rover_driver_should_make_the_rover_move_forward_twice() {
        verify(rover, times(2)).moveForward();
    }

    private void then_rover_driver_should_make_the_rover_move_forward() {
        verify(rover, times(1)).moveForward();
    }

    private void then_rover_driver_should_make_the_rover_turn_left() {
        verify(rover, times(1)).rotateLeft();
    }

    private void then_rover_driver_should_make_the_rover_turn_right_twice() {
        verify(rover, times(2)).rotateRight();
    }

    private void then_rover_driver_should_make_the_rover_turn_right() {
        verify(rover).rotateRight();
    }

    private void then_rover_driver_should_make_the_rover_turn_right_three_times() {
        verify(rover, times(3)).rotateRight();
    }
}