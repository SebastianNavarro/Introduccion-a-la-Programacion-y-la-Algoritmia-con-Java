import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class ejercicios_clase4 {
    public static Map<String, Integer> contarOcurrencias(ArrayList<String> arreglo) {
        Map<String, Integer> mapa = new LinkedHashMap<>();

        for (String s : arreglo) {
            if (mapa.containsKey(s)) {
                mapa.replace(s, mapa.get(s) + 1);
        
            } else {
                mapa.put(s, 1);
            }
        }

        return mapa;
    }

    public static void main(String[] args) {
        ArrayList<Integer> listaEnteros = new ArrayList<>(java.util.Arrays.asList(2, 3, 5, 6));
        System.out.println(listaEnteros.stream().filter(n -> n % 2 == 0).toList());

        ArrayList<String> cadena = new ArrayList<>(java.util.Arrays.asList("H","o", "l", "a", "a"));
        System.out.println(cadena.stream().map(s -> s.toUpperCase()).toList());

        System.out.println(listaEnteros.stream().map(i -> i * 2).reduce((a, b) -> b).orElse(0));

        System.out.println(contarOcurrencias(cadena));
    }
}