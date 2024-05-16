import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CeilingFanUserInterface {
  private JFrame frame;

  // Constructor
  public CeilingFanUserInterface() {
    initiateInterface();
  }

  // Method to initialize the frame
  private void initiateInterface() {
    // Create and set up the main frame
    frame = new JFrame("Ceiling Fan User Interface");
    frame.setSize(600, 600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new BorderLayout());

    // Creating an instance of CeilingFan
    CeilingFan ceilingFan = new CeilingFan();

    // Instructions label for the frame
    JLabel instructions = new JLabel("<html><div style='text-align: center; width: 100%;'>"
        + "This is a ceiling fan. To turn the ceiling fan on, you need to pull the speed cord. Each time you pull the speed cord, the speed of the fan will increase. The fan has four speeds, the fourth time you pull the speed cord, the speed of the fan will reset to 0. You can also change the direction of the fan by pulling the direction cord. The fan does not operate on December 25.</div></html>");
    frame.add(instructions, BorderLayout.NORTH);

    // A panel to hold the UI elements and add it to the frame
    JPanel UI = new JPanel(new GridLayout(2, 2));
    frame.add(UI, BorderLayout.CENTER);

    // Labels for displaying fan speed and direction
    JLabel speedMarker = new JLabel("Fan speed is: " + ceilingFan.getSpeed(), JLabel.CENTER);
    JLabel directionMarker = new JLabel(
        "Fan direction is: " + (ceilingFan.isClockwiseDirection() ? "Clockwise" : "Anti-Clockwise"),
        JLabel.CENTER);

    // Buttons for pulling the speed and direction cords
    JButton speedCord = new JButton("Pull Speed Cord");
    String nonOperational =
        "<html><div style='text-align: center; width: 100%;'>The fan is not operational on December 25th</div></html>";

    // Action listener for the speed cord button
    speedCord.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (!ceilingFan.isOffDay()) {
          ceilingFan.pullFanSpeedCord();
          speedMarker.setText("Fan speed is: " + ceilingFan.getSpeed());
        } else {
          speedMarker.setText(nonOperational);
        }
      }
    });

    // Action listener for the direction cord button
    JButton directionCord = new JButton("Pull Direction Cord");
    directionCord.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if (!ceilingFan.isOffDay()) {
          ceilingFan.pullFanDirectionCord();
          directionMarker.setText("Fan direction is: "
              + (ceilingFan.isClockwiseDirection() ? "Clockwise" : "Anti-Clockwise"));
        } else {
          directionMarker.setText(nonOperational);
        }
      }
    });

    // Add labels and buttons to the UI panel
    UI.add(speedMarker);
    UI.add(directionMarker);
    UI.add(speedCord);
    UI.add(directionCord);


    frame.setVisible(true);
  }

  public static void main(String[] args) {
    new CeilingFanUserInterface();
  }
}
