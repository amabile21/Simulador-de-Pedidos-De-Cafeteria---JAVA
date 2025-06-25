package cafeteria;
import java.util.HashMap;
import java.util.Map;

public class Bolos {

    public Map<Integer, String> mostrarBolosERetornarOpcoes() {
        System.out.println("--- Bolos e Tortas ---");
        System.out.println("1 - Bolo de Chocolate");
        System.out.println("2 - Bolo de Cenoura com Cobertura");
        System.out.println("3 - Bolo Red Velvet");
        System.out.println("4 - Bolo de Fubá");
        System.out.println("5 - Bolo de Coco");
        System.out.println("6 - Bolo de Banana");
        System.out.println("7 - Bolo Floresta Negra");
        System.out.println("8 - Bolo de Maracujá");
        System.out.println("9 - Bolo de Nozes");
        System.out.println("10 - Bolo de Laranja");

        Map<Integer, String> opcoesBolos = new HashMap<>();
        opcoesBolos.put(1, "Bolo de Chocolate");
        opcoesBolos.put(2, "Bolo de Cenoura com Cobertura");
        opcoesBolos.put(3, "Bolo Red Velvet");
        opcoesBolos.put(4, "Bolo de Fubá");
        opcoesBolos.put(5, "Bolo de Coco");
        opcoesBolos.put(6, "Bolo de Banana");
        opcoesBolos.put(7, "Bolo Floresta Negra");
        opcoesBolos.put(8, "Bolo de Maracujá");
        opcoesBolos.put(9, "Bolo de Nozes");
        opcoesBolos.put(10, "Bolo de Laranja");

        return opcoesBolos;
    }
}
