import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Васили", "Алиев", new Date(2002, 6, 15), 35000));
        employeeList.add(new Employee("Галина", "Павлова", new Date(1986, 10, 22), 60000));
        employeeList.add(new Employee("Игорь", "Суворов", new Date(1990, 11, 1), 45000));
        employeeList.add(new Manager("Олег", "Карпов", new Date(1990, 14, 12), 100000));

        System.out.println("Сотрудники до увеличения зарплаты:");
        System.out.println(employeeList);

        for (Employee employee: employeeList){
            Manager.salaryIncrease(employee, 12000);
        }

        System.out.println("Сотрудники получения увеличения зарплаты:");
        System.out.println(employeeList);
    }
}