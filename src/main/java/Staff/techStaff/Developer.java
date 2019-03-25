package Staff.techStaff;

import Staff.Employee;

public class Developer extends Employee {

    private String deptName;

    public Developer(String name, String niNumber, double salary, String deptName) {
        super(name, niNumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void addName(String addName) {

    }
}
