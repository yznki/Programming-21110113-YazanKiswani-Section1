package employee;

public class PartTime {

	private int hoursWorked;
	private int hourRate = 10;
	
	public PartTime() {
		
	}
	
	public PartTime(int hoursWorked) {
		this.hoursWorked = hoursWorked;
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
