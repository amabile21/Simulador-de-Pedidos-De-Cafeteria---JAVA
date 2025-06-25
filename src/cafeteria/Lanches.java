package cafeteria;
import java.util.HashMap;
import java.util.Map;

public class Lanches {
    public Map<Integer, String> mostrarLanchesERetornarOpcoes() {
        System.out.println("--- Lanches ---");
        System.out.println("1 - Sanduíche Natural");
        System.out.println("2 - Misto Quente");
        System.out.println("3 - Pão de Queijo");
        System.out.println("4 - Croissant");
        System.out.println("5 - Bolo Salgado");
        System.out.println("6 - Cesta de Pães");
        System.out.print("Digite o número do lanche desejado: ");

        Map<Integer, String> opcoesLanches = new HashMap<>();
        opcoesLanches.put(1, "Sanduíche Natural");
        opcoesLanches.put(2, "Misto Quente");
        opcoesLanches.put(3, "Pão de Queijo");
        opcoesLanches.put(4, "Croissant");
        opcoesLanches.put(5, "Bolo Salgado");
        opcoesLanches.put(6, "Cesta de Pães");

        return opcoesLanches;
    }
}
