package generics.game;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan", 13);
        Schoolar schoolar2 = new Schoolar("Maria", 15);
        Schoolar schoolar3 = new Schoolar("Sergei", 16);
        Schoolar schoolar4 = new Schoolar("Olya", 14);

        Student student1 = new Student("Nikolay", 20);
        Student student2 = new Student("Ksenia", 18);

        Employee employee1 = new Employee("Zaur", 32);
        Employee employee2 = new Employee("Mikhail", 47);

        Team<Schoolar> scholarTeam = new Team("Dragons");
        scholarTeam.addNewParticipant(schoolar1);
        scholarTeam.addNewParticipant(schoolar2);
//        scholarTeam.addNewParticipant(employee1); //Using generics

        Team<Student> studentTeam = new Team("GO!");
        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        Team<Employee> employeeTeam = new Team("Workers");
        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        Team<Schoolar> schoolarTeam2 = new Team<>("Wisemans");
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

        scholarTeam.playWith(schoolarTeam2);

//        Team<String> stringTeam = new Team<String>("Fantasy"); // Using extends
//        stringTeam.addNewParticipant("First!");
    }
}
