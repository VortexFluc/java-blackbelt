package collections.list_interface;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 29, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Mariya", 'f', 23, 3, 7.4);

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);
        studentList.add(st4);
        studentList.add(st5);

        System.out.println(studentList);

        Student st6 = new Student("Mariya", 'f', 23, 3, 7.4);

//        studentList.remove(st6);
//        System.out.println(studentList);

        int index = studentList.indexOf(st6);
        System.out.println("studentList.indexOf(st6): " + index);
    }
}
