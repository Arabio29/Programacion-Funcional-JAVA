import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
public class Task {

    public static void main(String[] args) {
        //imprimir todos nombres que contengan la letra a y m
        List<String> words = List.of("mateo", "maria", "pepe", "sofia", "clara");
        words.stream()
                .filter(name -> name.contains("a"))
                .filter(name -> name.contains("m"))
                .forEach(name -> System.out.println(name));

        List<Integer, Integer, Integer> numers = List.of(6, 5, 7, 8, 9,10);
        numers.stream()
                .filter(nume -> nume % 2 == 0)
                .forEach(nume -> System.out.println(nume));

        // filtrar los numeros pares
        //Despues ordenarlos de menor a mayor.
        // despues cada numero multiplicarlo por dos
        //Nota: usar filter, map, sorted.
    }
}