package systemByYazan;

import employee.*;
import salaryCalculator.*;

public class Main {

	public static void main(String[] args) {
		
		FullTime employee1 = new FullTime(17);
		PartTime employee2 = new PartTime(12);
		
		System.out.println("Full time, Full time w/overtime");
		int salary = BasicSalary.calculateSalary(employee1.getHourRate(), employee1.getHoursWorked());
		System.out.println(salary);
		salary = BasicSalary.calculateSalary(employee1.getHourRate(), employee1.getHoursWorked(), true, 14);
		System.out.println(salary);
		
		System.out.println();
		
		System.out.println("Part time, Part time w/o overtime");
		salary = BasicSalary.calculateSalary(employee2.getHourRate(), employee2.getHoursWorked());
		System.out.println(salary);
		salary = BasicSalary.calculateSalary(employee2.getHourRate(), employee2.getHoursWorked(), false, 9);
		System.out.println(salary);
		
		
	}

}
