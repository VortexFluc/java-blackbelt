package collections.map_interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {
    public static void main(String[] args) {
        // KEY MUST BE IMMUTABLE
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Maria", "Ivanova", 1);
        Student st3 = new Student("Sergei", "Petrov", 4);

        map.put(st1, 7.5);
        map.put(st2, 8.7);
        map.put(st3, 9.2);

        System.out.println("map = " + map);
        System.out.println(map.containsKey(st1));

        System.out.println(st1.hashCode());

        //st1.course = 4; final fields or private fields without setters
        System.out.println(st1.hashCode());
        System.out.println(map.containsKey(st1));

//        Student st4 = new Student("Zaur", "Tregulov", 3);
////        boolean result = map.containsKey(st4);
////
////        System.out.println("result = " + result);
//
//        System.out.println("st1.hashCode(): " + st1.hashCode());
//        System.out.println("st2.hashCode(): " + st2.hashCode());
//
//
//        Student st5 = new Student("Igor", "Sidorov", 4);
//        System.out.println("st5.hashCode(): " + st5.hashCode());
    }

}

final class Student implements Comparable<Student> {
    final String name;
    final String surname;
    final int course;

    public Student(String name, String surname, int course) {
        this.name = name;
        this.surname = surname;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, course);
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

    //    @Override
//    public int hashCode() {
//        return name.length() * 7 + surname.length() * 11 + course * 53;
//    }
}