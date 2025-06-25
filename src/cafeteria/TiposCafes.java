package cafeteria;

import java.util.HashMap;
import java.util.Map;

public class TiposCafes {

    public Map<Integer, String> mostrarCafesERetornarOpcoes() {
        System.out.println("--- Cafés ---");
        System.out.println("1 - Café Expresso");
        System.out.println("2 - Café Americano");
        System.out.println("4 - Cappuccino");
        System.out.println("5 - Café Latte");
        System.out.println("6 - Café Gelado");
        System.out.println("8 - Café Coado");
        System.out.println("9 - Café com Leite");

        Map<Integer, String> opcoesCafes = new HashMap<>();
        opcoesCafes.put(1, "Café Expresso");
        opcoesCafes.put(2, "Café Americano");
        opcoesCafes.put(4, "Cappuccino");
        opcoesCafes.put(5, "Café Latte");
        opcoesCafes.put(6, "Café Gelado");
        opcoesCafes.put(7, "Café Coado");
        opcoesCafes.put(8, "Café com Leite");

        return opcoesCafes;
    }
}