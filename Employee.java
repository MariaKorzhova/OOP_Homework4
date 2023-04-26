public class Employee extends User implements MethodAge {

    private int empId;

    public Employee(String firstName, String secondName, int age, int empId) {
        super(firstName, secondName, age);
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

}
