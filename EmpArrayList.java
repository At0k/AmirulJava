import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

class EmpArrayList {
    private String name;
    private double baseSalary;
    private double[] salary = new double[2];
    private double totalSalary;

    // Constructor
    public EmpArrayList(String name, double baseSalary, double healthAllowance, double transportAllowance) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.salary[0] = healthAllowance;
        this.salary[1] = transportAllowance;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for salary
    public double[] getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double[] salary) {
        this.salary = salary;
    }

    // Calculation for total salary
    public double totalSalary() {
        totalSalary = baseSalary;
        for (double s : salary) {
            totalSalary += s;
        }
        return totalSalary;
    }

    // Calculate bonus based on base salary
    public double assignBonus() {
        double bonus = 0;
        if (baseSalary >= 50000) {
            bonus = baseSalary * 0.1;
        } else if (baseSalary >= 30000) {
            bonus = baseSalary * 0.05;
        }
        return bonus;
    }

    // Main method
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = myObj.nextLine();

        System.out.println("Enter your base salary:");
        double baseSalary = myObj.nextDouble();

        double[] salary = new double[2];
        System.out.println("Enter your health allowance:");
        salary[0] = myObj.nextDouble();

        System.out.println("Enter your transport allowance:");
        salary[1] = myObj.nextDouble();

        // Create an employee object
        EmpArrayList employData = new EmpArrayList(name, baseSalary, salary[0], salary[1]);

        // Output the results
        System.out.println("Name: " + employData.getName());
        System.out.println("Health Allowance: " + salary[0]);
        System.out.println("Transport Allowance: " + salary[1]);
        System.out.println("Total Salary: " + employData.totalSalary());

        // Predicate test
        Predicate<Double> bonusTest = (num) -> num > 10;
        if (bonusTest.test(employData.assignBonus())) {
            System.out.println(":)" + employData.assignBonus());
        } else {
            System.out.println(":p" + employData.assignBonus());
        }
    }
}
