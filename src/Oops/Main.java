package Oops;
public class Main {
    public static void main(String[] args) {
        // Test Person
        Person p = new Person("Alice", 25);
        System.out.println("Person: " + p.getName() + ", Age: " + p.getAge());

        // Test Employee
        Employee emp = new Employee(101, "John", "Doe", 50000);
        System.out.println(emp);
        emp.raiseSalary(10);
        System.out.println("After raise: " + emp);
        System.out.println("Annual Salary: " + emp.getAnnualSalary());

        // Test Circle
        Circle c = new Circle(7);
        System.out.println("Circle with radius " + c.getRadius() + " has circumference " + c.getCircumference());

        // Test Account
        Account acc = new Account("Ravi", 123456, 1000.0);
        System.out.println(acc);
        acc.deposit(500.0);
        acc.withdraw(300.0);
        System.out.println("Current Balance: " + acc.checkBalance());
    }
}
