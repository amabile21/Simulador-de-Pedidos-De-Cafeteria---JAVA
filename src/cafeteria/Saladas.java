package cafeteria;
import java.util.HashMap;
import java.util.Map;

public class Saladas {
    public Map<Integer, String> mostrarSaladasERetornarOpcoes() {
        System.out.println("--- Saladas ---");
        System.out.println("1 - Salada Caesar");
        System.out.println("2 - Salada Grega");
        System.out.println("3 - Salada Caprese");
        System.out.println("4 - Salada de Frutas");
        System.out.println("5 - Salada Verde com Frango");
        System.out.print("Digite o número da salada desejada: ");

        Map<Integer, String> opcoesSaladas = new HashMap<>();
        opcoesSaladas.put(1, "Salada Caesar");
        opcoesSaladas.put(2, "Salada Grega");
        opcoesSaladas.put(3, "Salada Caprese");
        opcoesSaladas.put(4, "Salada de Frutas");
        opcoesSaladas.put(5, "Salada Verde com Frango");

        return opcoesSaladas;
    }
}
