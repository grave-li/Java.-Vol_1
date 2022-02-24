/**
 *Java 1. Homework #5.
 *
 * @author Grave Elizaveta
 * @version 24.02.2022
 *
 */


public class Homework5 {
    public static void main(String[]args) {
        Employee[]empJob = new Employee[5];
        empJob[0] = new Employee("Lastochkin Evgeniy", "PR-manager", "lastochkin@mail.com", "89160000011", 60000, 42);
        empJob[1] = new Employee("Golubeva Anna", "QA-engineer", "golubeva@mail.com", "89160001100", 50000, 30);
        empJob[2] = new Employee("Sokolov Petr", "manager", "sokolov@mail.com", "89161000000", 25000, 40);
        empJob[3] = new Employee("Vorobiova Olga", "financier", "vorobiova@mail.com", "89160010000", 55000, 20);
        empJob[4] = new Employee("Sorokin Alexey", "administrator", "sorokin@mail.com", "89160001000", 30000, 45);
        for (Employee employee: empJob)
            if (employee.getAge() > 40)
                System.out.println(employee);

    }
}
class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }

     @ Override
    public String toString() {
        return ("Name: " + name + "; " + "Position: " + position + "; " + "Email: " + email + "; " + "Phone: " + phone + "; " + "Salary: " + salary + "; " + "Age: " + age + ";");
    }
}

