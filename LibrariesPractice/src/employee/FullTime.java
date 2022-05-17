package employee;

public class FullTime {

	private int hoursWorked;
	private int hourRate = 10;
	private String name;
	
	public FullTime() {
		
	}
	
	public FullTime(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public int getHourRate() {
		return hourRate;
	}
	public void setHourRate(int hourRate) {
		this.hourRate = hourRate;
	}

	
	
}
