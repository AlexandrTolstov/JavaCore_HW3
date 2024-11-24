import java.util.List;

public class Program {
    public static void congratulation(List<Man> employees, Holidays holiday){
        for (Man emp: employees){
            switch (holiday){
                case NO_HOLIDAYS -> {
                    if(emp.gender == Gender.MAN)
                        System.out.println(String.format("Дорогой %s сожалеем, но сегодня не праздничный день", emp.name));
                    if (emp.gender == Gender.WOMAN)
                        System.out.println(String.format("Дорогая %s сожалеем, но сегодня не праздничный день", emp.name));
                    break;
                }
                case NEW_YEAR -> {
                    System.out.println("Поздравляем с новым годом");
                    break;
                }
                case MARCH_8 -> {
                    if(emp.gender == Gender.WOMAN){
                        System.out.println(String.format("Дорогая %s Поздравляем с 8 Марта", emp.name));
                    }
                    break;
                }
                case FEBRUARY_23 -> {
                    if(emp.gender == Gender.MAN){
                        System.out.println(String.format("Дорогой %s Поздравляем с 23 Февраля", emp.name));
                    }
                    break;
                }
                default -> throw new IllegalStateException("Не верно введенный праздник: " + holiday);
            }
        }
    }
}
