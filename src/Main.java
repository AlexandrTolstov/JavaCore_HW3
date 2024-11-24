import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Man> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Васили", "Алиев", new Date(2002, 6, 15), Gender.MAN, 35000));
        employeeList.add(new Employee("Галина", "Павлова", new Date(1986, 10, 22), Gender.WOMAN, 60000));
        employeeList.add(new Employee("Игорь", "Суворов", new Date(1990, 11, 1), Gender.MAN, 45000));
        employeeList.add(new Manager("Олег", "Карпов", new Date(1990, 14, 12), Gender.MAN, 100000));
        employeeList.add(new Buyer("Анжела", "Борисова", new Date(2002, 11, 23), Gender.WOMAN));
        employeeList.add(new Buyer("Кирил", "Баранов", new Date(2006, 9, 12), Gender.MAN));
        employeeList.add(new Buyer("Лера", "Кудрявцева", new Date(1985, 10, 9), Gender.WOMAN));

//        System.out.println("Сотрудники до увеличения зарплаты:");
//        System.out.println(employeeList);
//
//        for (Employee employee: employeeList){
//            Manager.salaryIncrease(employee, 12000);
//        }
//
//        System.out.println("Сотрудники получения увеличения зарплаты:");
//        System.out.println(employeeList);

        System.out.println("Нет праздника:");
        Program.congratulation(employeeList, Holidays.NO_HOLIDAYS);
        System.out.println("------------------------------------------------------------------");
        System.out.println("23 февраля:");
        Program.congratulation(employeeList, Holidays.FEBRUARY_23);
        System.out.println("------------------------------------------------------------------");
        System.out.println("8 марта:");
        Program.congratulation(employeeList, Holidays.MARCH_8);
        System.out.println("------------------------------------------------------------------");
    }
}