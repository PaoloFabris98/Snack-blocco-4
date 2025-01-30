import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("casa");
        strings.add("albero");
        strings.add("mare");
        strings.add("sole");
        strings.add("luna");
        strings.add("montagna");
        strings.add("fiume");
        strings.add("computer");
        strings.add("telefono");
        strings.add("scuola");
        strings.add("università");
        strings.add("strada");
        strings.add("auto");
        int a = 3;
        int b = 6;

        for (int i = 0; i < strings.size(); i++) {
            if (a >= b) {
                throw new IllegalArgumentException("Il valore di A non può essere uguale o inferiore a quello di B");
            }
            if (a < 0 || b > strings.size()) {
                throw new IllegalArgumentException(
                        "I valori non possono essere inferiori a 0 e superiori alla lunghezza dell'array stesso " + "("
                                + strings.size() + ")");
            }
            if (i >= (a - 1) && i <= (b - 1)) {
                System.out.println(strings.get(i));
            }
        }
    }
}
