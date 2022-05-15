package salaryCalculator;

public class BasicSalary {
	
	public static int calculateSalary(int hourRate, int hoursWorked) {
		
		int salary = hourRate * hoursWorked;
		return salary;
	}
	public static int calculateSalary(int hourRate, int hoursWorked, boolean overtime, int overtimeWorked) {
		
		int salary = calculateSalary(hourRate, hoursWorked);
		
		if (overtime) {
			salary = OvertimeSalary.overtimeCalculate(salary, overtimeWorked);
		}
			
		return salary;
	}

}
