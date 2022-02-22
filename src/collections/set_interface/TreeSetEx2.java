package collections.set_interface;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetEx2 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();

        Student st1 = new Student("Zaur", 5);
        Student st2 = new Student("Misha", 1);
        Student st3 = new Student("Igor", 2);
        Student st4 = new Student("Marina", 3);
        Student st5 = new Student("Olya", 4);

        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);

        System.out.println("treeSet = " + treeSet);

        System.out.println("treeSet.first() --> " + treeSet.first());

        System.out.println("treeSet.last() --> " + treeSet.last());

        Student st6 = new Student("Oleg", 3);
        System.out.println("treeSet.headSet(st6) --> " + treeSet.headSet(st6));

        System.out.println("treeSet.tailSet(st6) --> " + treeSet.tailSet(st6));

        st6.course = 2;
        Student st7 = new Student("Ivan", 4);
        System.out.println("treeSet.subSet(st6, st7) --> " + treeSet.subSet(st6, st7));

        System.out.println("st3.equals(st6) --> " + st3.equals(st6));
        System.out.println("st3.hashCode() == st6.hashCode() --> " + (st3.hashCode() == st6.hashCode()));
    }
}

// Class must implements Comparable<T> or have Comparator<T>
class Student implements Comparable<Student>{
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.course - o.course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course; // Must remove name if in compareTo we comparing by course
    }

    @Override
    public int hashCode() {
        return Objects.hash(course); // Remove name
    }
}
