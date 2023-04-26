
public class TeacherController implements iUserController<Teacher> {
    private final TeacherService teachService = new TeacherService();

    @Override
    public void create(String firstName, String secondName, int age) {
        teachService.create(firstName, secondName, age);
    }

    static public <T extends Teacher> void paySalary(T person)
    {
        System.out.println(((User) person).getFirstName()+" зп 10000р ");
    }

    static public <T extends Number> Double mean(T[] num)
    {
        double sum = 0.0;
        for(int i =0; i<num.length;i++)
        {
            sum= sum+num[i].doubleValue();
        }
        sum=sum/num.length;
        return sum;
    }
}