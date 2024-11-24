import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

public class Buyer extends Man{

    public Buyer(String name, String surname, Date birthday, Gender gender){
        super(name, surname, birthday, gender);
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public String getBirthdate(){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        return String.format(df.format(birthday));
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setDate(int year, int month, int day){
        if(year < 1900 || year > LocalDateTime.now().getYear())
            throw new RuntimeException("Не верно введенный год");
        if(month < 1 || month > 12)
            throw new RuntimeException("Не верно введенный месяц");

        Calendar myCalendar = (Calendar) Calendar.getInstance().clone();
        myCalendar.set(year, month, 1);
        int max_date = myCalendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        if(day < 1 || day > max_date)
            throw new RuntimeException("Введенный день больше максимального количества дней в месяце");

        Date date = new Date(year, month, day);
    }
}
