package Staff.Management;

import Staff.Employee;

public class Director extends Manager {

    private double budget;

    public Director(String name, String niNumber, double salary, String deptName, double budget) {
        super(name, niNumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double payBonus() {
        return getSalary() * 0.02;
    }
}
