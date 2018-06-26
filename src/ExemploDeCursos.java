import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploDeCursos {

    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparingInt(c -> c.getAlunos()));
        cursos.sort(Comparator.comparingInt(Curso::getAlunos));

//        cursos.stream()
//                .filter(c -> c.getAlunos() > 100)
//                .forEach(c -> System.out.println(c.getNome()));

//        cursos.stream()
//                .filter(c -> c.getAlunos() > 100)
//                .map(Curso::getAlunos)
//                .forEach(System.out::println);
//
//
//        int soma = cursos.stream()
//                .filter(c -> c.getAlunos() > 100)
//                .mapToInt(Curso::getAlunos)
//                .sum();
//
//        System.out.println(soma);
//
//        Stream<String> nomes = cursos.stream().map(Curso::getNome);
//        System.out.println(nomes);

        cursos.stream()
                .filter(c -> c.getAlunos() > 100)
                .findAny()
                .ifPresent(c -> System.out.println(c.getNome()));

        cursos.stream()
                .filter(c -> c.getAlunos() > 35)
                .findFirst()
                .ifPresent(c -> System.out.println(c.getNome()));

        cursos.stream()
                .filter(c -> c.getAlunos() > 75)
                .collect(Collectors.toList());


        Map mapa = cursos
                .stream()
                .filter(c -> c.getAlunos() > 100)
                .collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()));
        System.out.println(mapa);


    }
}
