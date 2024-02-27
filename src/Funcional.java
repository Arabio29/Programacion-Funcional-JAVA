import java.time.LocalDateTime;
import java.util.function.*;

public class Funcional {

        public static void main(String[] args) {
            //Suplier -> no recibe ningun argumento pero devuelve un objecto T
            Supplier<LocalDateTime> dateTime = () -> LocalDateTime.now();
            LocalDateTime time = dateTime.get();
            String timeToString = time.toString();

            //Consumer -> tiene un argumento , pero no retorna nada.
            Consumer<String> print = (x) -> System.out.println(x);
            print.accept(timeToString);
            print.accept("mateo");

            //Funtion -> me recibe un argumento y me retorna un objecto (o un tipo de dato)
            Function<String, Integer> size = (s) -> s.length();
            int word  = size.apply("casa");
            print.accept(String.valueOf(word));

            //BiFuntion -> me recibe 2 argumentos, y em retorna otro tipo de dato/ objecto.
            BiFunction<Integer, Integer, Integer> sum = (numero1, numero2) -> numero1 + numero2;
            int result = sum.apply(10,13);
            print.accept(String.valueOf(result));

            //predicate -> reci -> argumento y devuelvo verdadero o falso
            Predicate<String> validator = (name) -> name.equals("MATEO");
            boolean isEquals = validator.test("MATEO");
            System.out.println("es igual? "+ isEquals);
        }

}

