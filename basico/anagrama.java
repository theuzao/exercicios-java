import java.util.*;

public class AgrupadorDeAnagramas {
    public List<List<String>> agrupar(String[] palavras) {
        // Mapa para agrupar listas de palavras por uma "chave" comum (anagrama ordenado)
        Map<String, List<String>> mapa = new HashMap<>();

        for (String palavra : palavras) {
            // Convertemos a palavra para char[] e ordenamos — anagramas terão a mesma forma ordenada
            char[] letras = palavra.toCharArray();
            Arrays.sort(letras);
            String chave = new String(letras);

            // Adicionamos a palavra no grupo correspondente à chave
            mapa.computeIfAbsent(chave, k -> new ArrayList<>()).add(palavra);
        }

        // Retornamos apenas os grupos (valores) como uma lista
        return new ArrayList<>(mapa.values());
    }

    public static void main(String[] args) {
        AgrupadorDeAnagramas agrupador = new AgrupadorDeAnagramas();

        String[] entrada = {"bat", "tab", "tap", "pat", "cat"};
        List<List<String>> resultado = agrupador.agrupar(entrada);
      
        for (List<String> grupo : resultado) {
            System.out.println(grupo);
        }
    }
}
