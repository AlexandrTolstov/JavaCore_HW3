import java.util.Date;

public class Manager extends Employee{
    public Manager(String name, String surname, Date birthday, int salary) {
        super(name, surname, birthday, salary);
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
