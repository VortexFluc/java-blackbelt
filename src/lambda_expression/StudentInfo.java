package lambda_expression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;

public class StudentInfo {

    void testStudents(ArrayList<Student> students, Predicate<Student> pr) {
        for(Student s: students) {
            if(pr.test(s)) {
                System.out.println(s);
            }
        }
    }
}

class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Maria", 'f', 23, 3, 9.1);

        ArrayList<Student> students = new ArrayList<>();

        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();

        System.out.println("-".repeat(40));
        info.testStudents(students, (Student s) -> {return s.age < 30;});

        System.out.println("-".repeat(40));
        info.testStudents(students, (Student s) -> {return s.avgGrade > 8;});

        System.out.println("-".repeat(40));
        info.testStudents(students, (Student s) -> {
            return s.age > 20 && s.avgGrade > 7 && s.sex == 'm';
        });

        Predicate<Student> p1 = student -> student.avgGrade > 7.5;
        Predicate<Student> p2 = student -> student.sex == 'm';

        System.out.println("-".repeat(40));
        info.testStudents(students, p1);

        System.out.println("-".repeat(40));
        info.testStudents(students, p2);

        System.out.println("-".repeat(40));
        info.testStudents(students, p1.and(p2));

//        Function<Student, Double> function = student -> student.avgGrade;

        Double result = avgOfSomething(students, student -> student.avgGrade);
        System.out.println("result = " + result);

        result = avgOfSomething(students, student -> (double)student.course);
        System.out.println("result = " + result);

        result = avgOfSomething(students, student -> (double)student.age);
        System.out.println("result = " + result);
    }

    private static double avgOfSomething(List<Student> list, Function<Student, Double> f) {
        double result = 0;
        for (Student s: list) {
            result += f.apply(s);
        }
        result = result / list.size();
        return result;
    }
}

//interface StudentChecks {
//    boolean check(Student s);
//}