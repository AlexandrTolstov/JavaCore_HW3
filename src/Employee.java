import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;

public class Employee extends Man{
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String name, String surname, Date birthday, Gender gender, int salary) {
        super(name, surname, birthday, gender);
        this.salary = salary;
    }

    /**
     * Сравнение двух дат
     * @param year1 год 1
     * @param month1 месяц 1
     * @param day1 день 1
     * @param year2 год 2
     * @param month2 месяц 2
     * @param day2 день 2
     * @return
     */
    public int differenceInDays(int year1, int month1, int day1, int year2, int month2, int day2){
        Date date1 = new Date(year1, month1, day1);
        Date date2 = new Date(year2, month2, day2);

        Instant instant1 = date1.toInstant();
        Instant instant2 = date2.toInstant();

        Duration duration = Duration.between(instant1, instant2);

        long diffInDays = duration.toDays();

        return (int)diffInDays;
    }

    @Override
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy;LLLL;dd");
        return String.format("\n{Имя: %s, Фамилия: %s, Дата рождения: %s, Зарплата: %d}", name, surname, format.format(birthday), salary);
    }
}
