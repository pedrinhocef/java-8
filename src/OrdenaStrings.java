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

        Consumer<String> consumidor = new ConsumidorDeString();
        palavras.forEach(consumidor);

        Comparator<String> comparador = new ComparadorDeStringPorTamanho();

//        Collections.sort(palavras, comparador);
        palavras.sort(comparador);
        System.out.println(palavras);

    }
}

class ComparadorDeStringPorTamanho implements Comparator<String> {


    @Override
    public int compare(String s1, String s2) {

        if (s1.length() > s2.length())
            return -1;
        if (s1.length() < s2.length())
            return 1;
        return 0;
    }
}

class ConsumidorDeString implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}
