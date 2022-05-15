package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of employees: ");
		int numberEmployees = sc.nextInt();
		
		List<Employee> employees = new ArrayList<>();
		
		for (int i = 1; i<=numberEmployees; i++) {
			System.out.println("Employee #"+ i +"data:");
			System.out.print("Outsourced (y/n)? ");
			String question = sc.next();
			if (question.equals("n")) {
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Hours: ");
				Integer hours = sc.nextInt();
				System.out.print("Value per Hours: ");
				Double valuePerHours = sc.nextDouble();
				Employee employee = new Employee(name, hours, valuePerHours);
				employees.add(employee);
			}else if (question.equals("y")) {
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Hours: ");
				Integer hours = sc.nextInt();
				System.out.print("Value per Hours: ");
				Double valuePerHours = sc.nextDouble();
				System.out.print("Additional Charge: ");
				Double additionalCharge = sc.nextDouble();
				Employee Outsourced = new OutsourcedEmployee(name, hours, valuePerHours, additionalCharge);
				employees.add(Outsourced);
			}
		}
		
		for (Employee employee: employees) {
			System.out.println(employee.getName() + " -$ " + employee.payment());
		}
		
		sc.close();
	}

}
