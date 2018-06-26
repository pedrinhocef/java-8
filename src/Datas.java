import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate nextWorldCup = LocalDate.of(2022,Month.JUNE, 5);

        int anos = nextWorldCup.getYear() - hoje.getYear();
        System.out.println(anos);

        Period periodo = Period.between(hoje, nextWorldCup);
        System.out.println(periodo.getYears());
        System.out.println(periodo.getMonths());
        System.out.println(periodo.getDays());

        System.out.println(hoje.plusDays(1));

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String dataFormatada = nextWorldCup.format(formatador);
        System.out.println(dataFormatada);

        DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatadorComHoras));
    }
}
