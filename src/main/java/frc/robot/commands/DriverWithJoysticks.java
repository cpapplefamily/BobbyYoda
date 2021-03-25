// RobotBuilder Version: 3.1
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package frc.robot.commands;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import frc.robot.subsystems.Drivetrain;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS

/**
 *
 */
public class DriverWithJoysticks extends CommandBase {

   
        private final Drivetrain m_drivetrain;
        private final Joystick m_leftJoystick;
        private final Joystick m_rightJoystick;
    

 
    
       
    

    public DriverWithJoysticks(Joystick leftstick, Joystick rightstick, Drivetrain subsystem) {


        m_leftJoystick = leftstick;
        m_rightJoystick = rightstick;
        m_drivetrain = subsystem;
        addRequirements(m_drivetrain);

 
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        double leftSpeed = m_leftJoystick.getRawAxis(1);
        double rightSpeed = -m_rightJoystick.getRawAxis(1);
        m_drivetrain.my_DriveTankDrive(leftSpeed, rightSpeed);

    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        m_drivetrain.my_DriveTankDrive(0.0,0.0);
    
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public boolean runsWhenDisabled() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DISABLED
        return false;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DISABLED
    }
}
