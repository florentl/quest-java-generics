import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Generics {

    /**
     * Java entry point
     */
    public static void main(String... args) {
        new Generics();
    }

    /**
     * Class Constructor
     */
    private Generics() {
        List<Integer> ints = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<String>  strs = Arrays.asList("tout", "titi", "ototo", "jean", "tous", "taratata");

        // TODO - Ne retourner que les nombres pairs.
        ints = ints
                .stream()
                .filter(i -> i%2 == 0)
                .collect(Collectors.toList());
        // TODO - Multiplier par 2 chaque élément de la liste.
        //ints = map(ints, i -> i*2);
        ints = ints
                .stream()
                .map(i -> i*2)
                .collect(Collectors.toList());

        for (Integer i: ints) System.out.println(i);

        // TODO - Ne retourner que les Strings contenant au moins 2 lettres t.
        strs = strs
                .stream()
                .filter(s -> s.toLowerCase().matches(".*[t].*[t].*"))
                .collect(Collectors.toList());
        // TODO - Passer en majuscule toutes les Strings
        strs = strs
                .stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        for (String s: strs) System.out.println(s);
    }

}
