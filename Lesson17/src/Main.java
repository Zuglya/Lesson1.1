import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws ParseException {
//        String input = new Scanner(System.in).nextLine();
//        Date date = new Date();
//        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm EEEE");

//        Date parse = dateFormat.parse(input);
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");


        System.out.println(formatter.format(date));

//        Date date = new Date();
//        System.out.println(date);
//        long time = date.getTime();
//        System.out.println("С 1970-го года прошло " + time + " миллисекунд");
//        LocalDate date = LocalDate.now();
//        LocalDate date = LocalDate.of(2008, 2, 10);
//        LocalTime time = LocalTime.now();
//        LocalDateTime dateTime = LocalDateTime.now();
//        System.out.println(date);
//        System.out.println(time);
//        System.out.println(dateTime);
    }
}
