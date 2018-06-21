import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("Pedro");
        palavras.add("Nice");
        palavras.add("Rebeca");

//        for (String palavra : palavras) {
//            System.out.println(palavra);
//        }

        palavras.forEach(System.out::println);

//        Collections.sort(palavras, comparador);

        palavras.sort((s1, s2) -> {
            if (s1.length() > s2.length())
                return -1;
            if (s1.length() < s2.length())
                return 1;
            return 0;
        });

        palavras.sort(Comparator.comparingInt(String::length));
        System.out.println(palavras);

        new Thread(() -> System.out.println("Executando um Runnable")).start();

    }
}



