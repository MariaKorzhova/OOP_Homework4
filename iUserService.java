// package StudentService;

import java.util.List;

// Создание интерфейса iUserService<T> и методов для вызова всех элементов и создания экземпляра класса
public interface iUserService<T> {
    List<T> getAll();
    void create(String firstName, String secondName, int age);
}