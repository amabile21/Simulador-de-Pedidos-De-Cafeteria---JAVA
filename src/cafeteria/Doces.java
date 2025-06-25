package cafeteria;
import java.util.HashMap;
import java.util.Map;

public class Doces {
    
        public Map<Integer, String> mostrarDocesERetornarOpcoes() {
            System.out.println("--- Doces ---");
            System.out.println("1 - Brigadeiro");
            System.out.println("2 - Beijinho");
            System.out.println("3 - Pudim");
            System.out.println("4 - Mousse de Chocolate");
            System.out.println("5 - Torta Holandesa");
            System.out.println("6 - Cheesecake");
            System.out.println("7 - Churros");
            System.out.println("8 - Cupcake");
            System.out.println("9 - Brownie");
            System.out.println("10 - Doce de Leite");
            System.out.print("Digite o número do doce desejado: ");

            Map<Integer, String> opcoesDoces = new HashMap<>();
            opcoesDoces.put(1, "Brigadeiro");
            opcoesDoces.put(2, "Beijinho");
            opcoesDoces.put(3, "Pudim");
            opcoesDoces.put(4, "Mousse de Chocolate");
            opcoesDoces.put(5, "Torta Holandesa");
            opcoesDoces.put(6, "Cheesecake");
            opcoesDoces.put(7, "Churros");
            opcoesDoces.put(8, "Cupcake");
            opcoesDoces.put(9, "Brownie");
            opcoesDoces.put(10, "Doce de Leite");

            return opcoesDoces;
        }
}
