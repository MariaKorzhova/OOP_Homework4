import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements iUserService<Employee> {
    private int count;
    private List<Employee> emploees;
    public EmployeeService() {
        this.emploees = new ArrayList<Employee>();
    }
    @Override
    public void create(String firstName, String secondName, int age) {
       Employee per = new Employee(firstName, secondName, age, count);
       count++;
       emploees.add(per);
    }

    @Override
    public List<Employee> getAll()
    {
        return emploees;
    }

    public List<Employee> getSortedByFIOStudentGroup(int numberGroup)
    {
        List<Employee> emps = new ArrayList<>(emploees);
        emps.sort(new UserComparator<Employee>());
        return emps;
    }
}