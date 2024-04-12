package assignment3;

class Employee {
    private double salary;
    private int hoursOfWork;

    public void getInfo(double salary, int hoursOfWork) {
        this.salary = salary;
        this.hoursOfWork = hoursOfWork;
    }

    public void addSal() {
        if (salary < 500) {
            salary += 10;
        }
    }

    public void addWork() {
        if (hoursOfWork > 6) {
            salary += 5;
        }
    }

        public void printFinalSalary() {
        System.out.println("Final Salary: $" + salary);
    }
}
