package introducao_data_hora_duracao.exemplos;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Program1 {
    public static void main(String[] args) {
        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm").withZone(ZoneId.systemDefault());

        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        LocalDate d01 = LocalDate.parse("2023-02-07");
        LocalDateTime d02 = LocalDateTime.parse("2023-02-07T15:18:21");
        Instant d03 = Instant.parse("2023-02-07T15:18:21Z");

        System.out.println("d01 = " + d01.format(fmt1));
        System.out.println("do1 = " + fmt1.format(d01));
        System.out.println("d01 = " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("d02 = " + d02.format(fmt2));
        System.out.println("d02 = " + d02.format(fmt1));


        System.out.println("d03 = " + fmt3.format(d03));
        System.out.println("d02 = " + fmt5.format(d03));

    }
}
