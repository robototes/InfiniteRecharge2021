package frc.team2412.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.Button;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.team2412.robot.Commands.ExampleCommand;
import frc.team2412.robot.Commands.IndexerCommands.ProcessBallsCommandGroup;

//This is the class in charge of all the buttons and joysticks that the drivers will use to control the robot
public class OI {

	// Joysticks
	public Joystick driverStick = new Joystick(0);

	// Buttons
	public Button exampleSubsystemMethod = new JoystickButton(driverStick, 1);
	public Button indexerShootButton = new JoystickButton(driverStick, 2);
	public Button indexerStopButton = new JoystickButton(driverStick, 3);

	// Constructor to set all of the commands and buttons
	public OI(RobotContainer robotContainer) {
		// telling the button that when its pressed to execute example command with the
		// robot container's instance of example subsystem
		indexerStopButton.toggleWhenPressed(new ProcessBallsCommandGroup(robotContainer.m_IndexerSubsystem, indexerShootButton));
		exampleSubsystemMethod.whenPressed(new ExampleCommand(robotContainer.m_ExampleSubsystem));
	}
}
