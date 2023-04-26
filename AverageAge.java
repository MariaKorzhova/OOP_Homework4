import java.util.List;

public class AverageAge<T extends MethodAge> {
    private List <T> lst;

    public AverageAge(List <T> lst) {
        this.lst = lst;
    }

    public double AverageAgeCalc(){
        int sum = 0;
        int age = 0;
        for (T index : lst){
            age = index.getAge();
            sum = sum + index.getAge();
        }
        return (double) sum / lst.size();
    }

    @Override
    public String toString(){
        return "Средний возраст равен: " + AverageAgeCalc();
    }

}
