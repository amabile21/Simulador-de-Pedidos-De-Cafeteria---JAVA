package cafeteria;

import java.util.ArrayList;

public class Carrinho {

    ArrayList<String> carrinho = new ArrayList<>();

    public void mostrarProdutosNoCarrinho(){
        System.out.println("\n--- Resumo do seu Pedido ---");
        if (carrinho.isEmpty()) {
            System.out.println("Seu carrinho está vazio.");
        } else {
            System.out.println("Itens:");
            for (String item : carrinho) {
                System.out.println("- " + item);
            }
        }
        System.out.println("Seu pedido ficará pronto em 20 minutos!");
    }
}
