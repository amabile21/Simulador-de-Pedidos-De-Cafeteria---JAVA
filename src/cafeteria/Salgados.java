package cafeteria;
import java.util.HashMap;
import java.util.Map;

public class Salgados {
    public Map<Integer, String> mostrarSalgadosERetornarOpcoes() {
        System.out.println("--- Salgados ---");
        System.out.println("1 - Coxinha");
        System.out.println("2 - Risole");
        System.out.println("3 - Pastel");
        System.out.println("4 - Empada");
        System.out.println("5 - Esfiha");
        System.out.println("6 - Kibe");
        System.out.println("7 - Mini Pizza");
        System.out.print("Digite o número do salgado desejado: ");

        Map<Integer, String> opcoesSalgados = new HashMap<>();
        opcoesSalgados.put(1, "Coxinha");
        opcoesSalgados.put(2, "Risole");
        opcoesSalgados.put(3, "Pastel");
        opcoesSalgados.put(4, "Empada");
        opcoesSalgados.put(5, "Esfiha");
        opcoesSalgados.put(6, "Kibe");
        opcoesSalgados.put(7, "Mini Pizza");

        return opcoesSalgados;
    }
}
