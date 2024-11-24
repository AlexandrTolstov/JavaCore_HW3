import java.util.Date;

public class Manager extends Employee{
    public Manager(String name, String surname, Date birthday, Gender gender, int salary) {
        super(name, surname, birthday, gender, salary);
    }

    /**
     * Повышение зарплаты
     * @param employee работник
     * @param increase значение на которое увеличивать зарплату
     */
    public static void salaryIncrease(Employee employee, int increase){
        if(!(employee instanceof Manager)){
            employee.setSalary(employee.getSalary() + increase);
        }
    }
}
