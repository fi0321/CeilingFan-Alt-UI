# Ceiling Fan Simulation

## Overview

This project simulates a ceiling fan with two classes: `CeilingFan` and `CeilingFanUserInterface`. The fan has adjustable speed and direction, and it does not operate on December 25th.

## Classes

### `CeilingFan`

The `CeilingFan` class represents a ceiling fan with the following features:
- **Speed Control**: The fan has four speed settings (0 to 3). Pulling the speed cord increases the speed by one until it resets to 0 after reaching the maximum speed.
- **Direction Control**: The fan can rotate in clockwise and anti-clockwise directions. Pulling the direction cord toggles the rotation direction.
- **Off Day**: The fan does not operate on December 25th. Any attempts to change speed or direction on this day will have no effect.

### `CeilingFanUserInterface`

The `CeilingFanUserInterface` class provides a graphical user interface (GUI) to interact with the ceiling fan. It includes:
- **Interface Initialization**: Sets up the main frame and layout for the GUI.
- **Speed and Direction Controls**: Buttons to pull the speed and direction cords, updating the fan's state and displaying the current speed and direction.
- **Non-Operational Notification**: Displays a message if the user tries to interact with the fan on December 25th.

## Space and Time Complexity

- **Time Complexity**: O(n) where n is the number of user interactions.
- **Space Complexity**: O(1) since it uses a fixed amount of space for the variables and objects.

## Compilation and Execution

1. **Compile the Code**:
    
    javac src/*.java -d bin
   

2. **Run the Application**:
    
    java -cp bin CeilingFanUserInterface
   

## Usage

1. **Start the Application**:
   - The GUI will display instructions and provide buttons to control the fan.

2. **Control the Fan**:
   - Use the buttons to pull the speed and direction cords:
     - **Pull Speed Cord**: Increases the fan's speed, resetting to 0 after reaching the maximum speed.
     - **Pull Direction Cord**: Toggles the fan's rotation direction between clockwise and anti-clockwise.

3. **Fan Behavior**:
   - The speed and direction of the fan will be updated and displayed after each action.
   - If the date is December 25th, the fan will be off, and pulling the cords will have no effect.

## Example

Upon running the application, the GUI will display the current speed and direction of the fan. Users can interact with the fan through the provided buttons, and the interface will update accordingly.
