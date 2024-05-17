import java.time.LocalDate;

public class CeilingFan {
	private int speed;// variable that holds the current speed of the fan
	private boolean clockwiseDirection;// direction of the fan

	public CeilingFan() {
		this.speed = 0;
		this.clockwiseDirection = true;

		// Information the user that the fan will not operate on December 25.
		if (isOffDay()) {
			System.out.println("The fan is off for today, pulling either of the cords will have no effect.");

		}
	}

	// Getter methods for the attributes
	public boolean isClockwiseDirection() {
		return clockwiseDirection;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}


	// Setting offday as true if the current date is December 25.
	public boolean isOffDay() {
		LocalDate presentDate = LocalDate.now();
		return presentDate.getMonthValue() == 12 && presentDate.getDayOfMonth() == 25;
	}

	// Method that enacts the pulling the cord for speed
	public void pullFanSpeedCord() {
		// initially checks if it is an OffDay, if it is, it displays a message and returns
		if (isOffDay()) {
			speed = 0;
			System.out
					.println("The fan is off. Pulling this cord on the 25th of December will have no effect.");
			return;
		}
		// cycling through the different options of the speed cord
		if (speed < 3) {
			speed++;
		} else {
			speed = 0;
		}

	}

	// Method that enacts the pulling the cord for direction
	public void pullFanDirectionCord() {
		// initially checks if it is an OffDay, if it is, it displays a message and returns
		if (isOffDay()) {
			System.out
					.println("The fan is off. Pulling this cord on the 25th of December will have no effect.");
			return;
		}
		// reverses the direction of the fan
		clockwiseDirection = !clockwiseDirection;

	}
}
