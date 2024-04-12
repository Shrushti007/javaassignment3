package assignment3;

import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter salary: $");
        double salary = scanner.nextDouble();
        System.out.print("Enter number of hours of work per day: ");
        int hoursOfWork = scanner.nextInt();

        Employee employee = new Employee();

        employee.getInfo(salary, hoursOfWork);

        employee.addSal();
        employee.addWork();

        employee.printFinalSalary();

        scanner.close();

	}

}
