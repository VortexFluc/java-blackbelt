package comparation;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee emp1 = new Employee(100, "Zaur", "Tregulov", 12345);
        Employee emp2 = new Employee(15, "Ivan", "Petrov", 6542);
        Employee emp3 = new Employee(123, "Ivan", "Sidorov", 8542);

//        Arrays.sort(new Employee[] {emp1, emp2, emp3});  // ERROR! Cannot default cast to Comparable

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        System.out.println("Before sort\n" + employees);

        Collections.sort(employees, new SalaryComparator()); // We can rewrite rules of comparing using Comparator in classes, whose implements Comparable interface
        System.out.println("After sort\n" + employees);
    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    // This used when we implements Comparable<E> interface!!!!
    @Override
    public int compareTo(Employee otherEmp) {
        if (this.id == otherEmp.id) {
            return 0;
        } else if (this.id < otherEmp.id) {
            return -1;
        }
        return 1;
    }

//
////        return this.id - otherEmp.id; // If fields are Numeric!
//
//
////        return this.id.compareTo(otherEmp.id); // If we using wrapper classes
//
//
//
//        int result = this.name.compareTo(otherEmp.name);
//        if (result == 0) {
//            return this.surname.compareTo(otherEmp.surname);
//        }
//        return result;
}

    class IdComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee emp1, Employee emp2) {
            if (emp1.id == emp2.id) {
                return 0;
            } else if (emp1.id < emp2.id) {
                return -1;
            }
            return 1;
        }
    }

    class NameComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee emp1, Employee emp2) {
            return emp1.name.compareTo(emp2.name);
        }
    }

    class SalaryComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee emp1, Employee emp2) {
            return emp1.salary - emp2.salary;
        }
    }