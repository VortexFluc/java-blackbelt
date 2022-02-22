package collections.list_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(-3);
        list.add(8);
        list.add(12);
        list.add(-8);
        list.add(0);
        list.add(5);
        list.add(10);
        list.add(1);
        list.add(150);
        list.add(-30);
        list.add(19);
        
        Collections.sort(list);
        System.out.println("list = " + list);
        
        Collections.reverse(list);
        System.out.println("list = " + list);
        
        Collections.shuffle(list);
        System.out.println("list = " + list);
        
//
//        Collections.sort(list);
//        System.out.println("list = " + list);
//        int index1 = Collections.binarySearch(list, 12);
//        System.out.println("Collections.binarySearch(list, 12): " + index1);

//        Employee emp1 = new Employee(100, "Zaur", 1234);
//        Employee emp2 = new Employee(15, "Ivan", 6542);
//        Employee emp3 = new Employee(123, "Petr", 8542);
//        Employee emp4 = new Employee(15, "Mariya", 5678);
//        Employee emp5 = new Employee(182, "Kolya", 125);
//        Employee emp6 = new Employee(15, "Sasha", 9874);
//        Employee emp7 = new Employee(250, "Elena", 1579);
//
//        List<Employee> employeeList = new ArrayList<>();
//        employeeList.add(emp1);
//        employeeList.add(emp2);
//        employeeList.add(emp3);
//        employeeList.add(emp4);
//        employeeList.add(emp5);
//        employeeList.add(emp6);
//        employeeList.add(emp7);
//
//        System.out.println("employeeList = " + employeeList);
//
//        Collections.sort(employeeList);
//        System.out.println("employeeList = " + employeeList);
//
//        int index2 = Collections.binarySearch(employeeList,
//                new Employee(182, "Kolya", 125));
//        System.out.println("int index2 = Collections.binarySearch(employeeList, + new Employee(182, \"Kolya\", 125)): " + index2);
        
        
//        int[] array = {-3, 8, 12, -8, 0, 5, 10, 1, 150, -30, 19};
//        System.out.println("array: " + Arrays.toString(array));
//
//        Arrays.sort(array);
//        System.out.println("array after sort: " + Arrays.toString(array));
//
//        int index3 = Arrays.binarySearch(array, 150);
//        System.out.println("Arrays.binarySearch(array, 150): " + index3);
    }
}

class Employee implements Comparable<Employee>{
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee otherEmp) {
        int result = this.id - otherEmp.id;
        if (result == 0) {
            result = this.name.compareTo(otherEmp.name);
        }
        return result;
    }
}
