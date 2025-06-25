package cafeteria;

import java.util.HashMap;
import java.util.Map;

public class OutrasBebidas {


    public Map<Integer, String> mostrarOutrasBebidas() {
        System.out.println("--- Outras Opções ---");
        System.out.println("1 - Suco de Laranja");
        System.out.println("2 - Suco de Abacaxi");
        System.out.println("3 - Suco de Limão");
        System.out.println("4 - Coca-Cola");
        System.out.println("5 - Coca-Cola Zero");
        System.out.println("6 - Soda Limonada");
        System.out.println("7 - Água Mineral sem Gás");
        System.out.println("8 - Água Mineral com Gás");
        System.out.println("9 - Água Saborizada Limão");

        Map<Integer, String> opcoesBebidas = new HashMap<>();
        opcoesBebidas.put(1, "Suco de Laranja");
        opcoesBebidas.put(2, "Suco de Abacaxi");
        opcoesBebidas.put(3, "Suco de Limão");
        opcoesBebidas.put(4, "Coca-Cola");
        opcoesBebidas.put(5, "Coca-Cola Zero");
        opcoesBebidas.put(6, "Soda Limonada");
        opcoesBebidas.put(7, "Água Mineral sem Gás");
        opcoesBebidas.put(8, "Água Mineral com Gás");
        opcoesBebidas.put(9, "Água Saborizada Limão");

        return opcoesBebidas;
    }
}
