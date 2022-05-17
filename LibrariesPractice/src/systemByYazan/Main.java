package systemByYazan;

import java.util.ArrayList;
import java.util.Scanner;
import employee.*;
import salaryCalculator.*;
import java.math.*;
import java.time.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		LocalDate currentDate = LocalDate.now();
		FullTime employee1 = new FullTime(17);
		PartTime employee2 = new PartTime(12);
		int salary1, salary2;
		ArrayList myArr = new ArrayList<String>();
		myArr.add(employee1);
		myArr.add(employee2);
		
		System.out.println("Name of the first employee : ");
		employee1.setName(sc.nextLine());
		
		if (employee1.getName().contains("a")) {
			System.out.println("You get a 20JDs bonus " + employee1.getName());
		}
		if (employee1.getName().startsWith("U")) {
			System.out.println("You are unique " + employee1.getName());
		}
		
		System.out.println("Name of the second employee : ");
		employee2.setName(sc.nextLine());
		
		if (employee2.getName().contains("a")) {
			System.out.println("You get a 20JDs bonus " + employee2.getName());
		}
		if (employee2.getName().startsWith("U")) {
			System.out.println("You are unique " + employee2.getName());
		}
		
		System.out.println();
		System.out.println("Salary Report - " + currentDate);
		System.out.println();
		
		System.out.println(employee1.getName() + " & " + employee2.getName() + "'s salaries: \n");
		salary1 = BasicSalary.calculateSalary(employee1.getHourRate(), employee1.getHoursWorked());
		System.out.println(employee1.getName() + " : " + salary1);
		salary2 = BasicSalary.calculateSalary(employee1.getHourRate(), employee2.getHoursWorked());
		System.out.println(employee2.getName() + " : " + salary2);
		
		System.out.println(Math.max(salary1, salary2) + " is the higher salary.");
		
		System.out.println();
		
		System.out.println(employee1.getName() + " & " + employee2.getName() + "'s salaries with overtime: \n");
		
		salary1 = BasicSalary.calculateSalary(employee1.getHourRate(), employee1.getHoursWorked(), true, 9);
		System.out.println(employee1.getName() + " : " + salary1 + " - 14 hours of overtime.");
		salary2 = BasicSalary.calculateSalary(employee2.getHourRate(), employee2.getHoursWorked(), true, 14);
		System.out.println(employee2.getName() + " : " + salary2 + " - 9 hours of overtime.");
		
		System.out.println(Math.max(salary1, salary2) + " is the higher salary.");
		
	}

}
