import java.net.NoRouteToHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class App {
    public static void main(String[] args) throws Exception {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Сергей", "Иванов", 22, (long)101));
        students.add(new Student("Даша", "Цветкова", 23, (long)171));
        AverageAge<Student> studentAverageAge = new AverageAge<>(students);
        System.out.println(studentAverageAge);


        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Андрей", "Сидоров", 38, 552, "к.ф.н."));
        teachers.add(new Teacher("Сергей", "Петров", 45, 123, "к.ф.н."));
        AverageAge<Teacher> teacherAverageAge = new AverageAge<>(teachers);
        System.out.println(teacherAverageAge);


        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Олег", "Иванов", 50, 120));
        employees.add(new Employee("Анастасия", "Желтова", 30, 115));
        AverageAge<Employee> employeeAverageAge = new AverageAge<>(employees);
        System.out.println(employeeAverageAge);

        // Emploee peron1 = new Emploee("Иванов", "Олег", 55, 110);
        // Student s1 = new Student("Сергей", "Иванов", 22, (long)101);

        //EmploeeController contrEmp = new EmploeeController();
        // EmploeeController.paySalary(peron1);
        //contrEmp.paySalary(s1);

        // Integer studHour[] = {124,234,231,1,45};
        // System.out.println(EmploeeController.mean(studHour));

        // Double emplSalary[] = {12555.23,34213.5,10000.0};
        // System.out.println(EmploeeController.mean(emplSalary));
        
        //System.out.println(u1);
        //System.out.println(s1);
        //System.out.println(group);
    }
}