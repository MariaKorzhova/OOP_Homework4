
import java.util.ArrayList;
import java.util.List;

public class TeacherService implements iUserService<Teacher> {
    private int count;
    private int teacherId;
    private String academicDegree;
    private List<Teacher> teachers;
    
    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }
    
    public void create(String firstName, String secondName, int age) {
        Teacher per = new Teacher(firstName, secondName, age, teacherId, academicDegree);
        count = count + 1;
       teachers.add(per);
    }

    @Override
    public List<Teacher> getAll()
    {
        return teachers;
    }

    public List<Teacher> getSortedByFIOStudentGroup(int numberGroup)
    {
        List<Teacher> teach = new ArrayList<>(teachers);
        teach.sort(new UserComparator<Teacher>());
        return teach;
    }
}
