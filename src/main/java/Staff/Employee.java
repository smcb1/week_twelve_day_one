package Staff;

public abstract class Employee {

    public String name;
    public String niNumber;
    public double salary;

    public Employee(String name, String niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String setName(String addName) {
        if (addName == "") {
            return "Error";
        } else {
            this.name = addName;
        }
        return name;
    }

    public String getNiNumber() {
        return niNumber;
    }

    public double getSalary() {
        return salary;
    }

    public double getRaise(double raise) {
        if (raise <= 0) {
            return 0;
        } else {
            return salary += raise;
        }
    }

    public double payBonus() {
        return salary / 100;
    }

    public abstract void addName(String addName);
}
