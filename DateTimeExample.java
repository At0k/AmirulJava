import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.*;

public class DateTimeExample {
    public static void main(String[] args) {
        

    LocalDateTime nowDT = LocalDateTime.now();
    LocalDate nowD = LocalDate.now();
    LocalTime nowT = LocalTime.now();

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM--yy");
    String formatDT = formatter.format(nowDT);

    LocalDate birthDate = LocalDate.of(2001, 06, 14);
    Period atokAge = Period.between(nowD, birthDate);

    System.out.println(nowDT);
    System.out.println(nowD);
    System.out.println(nowT);
    System.out.println(atokAge);
}
    
}
