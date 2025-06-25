package cafeteria;

import java.util.HashMap;
import java.util.Map;

public class Tortas {

    public Map<Integer, String> mostrarTortasERetornarOpcoes() {

        System.out.println("1 - Torta de Limão");
        System.out.println("2 - Torta de Morango");
        System.out.println("3 - Torta Holandesa");
        System.out.println("4 - Torta de Maçã");
        System.out.println("5 - Torta de Chocolate");
        System.out.println("6 - Torta de Maracujá");
        System.out.println("7 - Torta de Banana");
        System.out.println("8 - Torta de Ricota");
        System.out.println("9 - Torta Mousse de Maracujá");
        System.out.println("10 - Torta de Leite Ninho com Nutella");

        Map<Integer, String> opcoesTortas = new HashMap<>();

        opcoesTortas.put(1, "Torta de Limão");
        opcoesTortas.put(2, "Torta de Morango");
        opcoesTortas.put(3, "Torta Holandesa");
        opcoesTortas.put(4, "Torta de Maçã");
        opcoesTortas.put(5, "Torta de Chocolate");
        opcoesTortas.put(6, "Torta de Maracujá");
        opcoesTortas.put(7, "Torta de Banana");
        opcoesTortas.put(8, "Torta de Ricota");
        opcoesTortas.put(9, "Torta Mousse de Maracujá");
        opcoesTortas.put(10, "Torta de Leite Ninho com Nutella");

        return opcoesTortas;
    }
}
