package cafeteria;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MenuInicial listagemMenu = new MenuInicial();
        Carrinho mostrarCarrinho = new Carrinho();
        TiposCafes listagemDosCafes = new TiposCafes();
        OutrasBebidas listagemDasBebidas = new OutrasBebidas();
        Doces listaDoces = new Doces();
        Bolos listagemBolos = new Bolos();
        Tortas listagemTortas = new Tortas();
        Lanches listagemDosLanches = new Lanches();
        Salgados listagemDosSalgados = new Salgados();
        Saladas listagemDasSaladas = new Saladas();

        System.out.println("Olá, qual seu nome?");
        String nome = input.nextLine();
        System.out.println("Bem-vindo "+nome+"!");

        boolean continuarPedido = true;

        while (continuarPedido) {
            System.out.println("Escolha uma categoria que você deseja ver (ou 0 para finalizar):");
            listagemMenu.mostrarCategorias();

            int escolhaCategoria = input.nextInt();

            if (escolhaCategoria == 0) {
                continuarPedido = false;
                break;
            }

            Map<Integer, String> opcoesAtuais = null;
            String categoriaEscolhidaNome = "";

            switch (escolhaCategoria) {
                case 1: // Café
                    opcoesAtuais = listagemDosCafes.mostrarCafesERetornarOpcoes();
                    categoriaEscolhidaNome = "cafe";
                    break;
                case 2: // Outras bebidas
                    opcoesAtuais = listagemDasBebidas.mostrarOutrasBebidas();
                    categoriaEscolhidaNome = "bebida";
                    break;
                case 3: // Doces
                    opcoesAtuais = listaDoces.mostrarDocesERetornarOpcoes();
                    categoriaEscolhidaNome = "doce";
                    break;
                case 4: // Bolos
                    opcoesAtuais = listagemBolos.mostrarBolosERetornarOpcoes();
                    categoriaEscolhidaNome = "bolo";
                    break;
                case 5: // Tortas
                    opcoesAtuais = listagemTortas.mostrarTortasERetornarOpcoes();
                    categoriaEscolhidaNome = "bolo";
                    break;
                case 6: // Lanches
                    opcoesAtuais = listagemDosLanches.mostrarLanchesERetornarOpcoes();
                    categoriaEscolhidaNome = "lanche";
                    break;
                case 7: // Salgados
                    opcoesAtuais = listagemDosSalgados.mostrarSalgadosERetornarOpcoes();
                    categoriaEscolhidaNome = "salgado";
                    break;
                case 8: // Saladas
                    opcoesAtuais = listagemDasSaladas.mostrarSaladasERetornarOpcoes();
                    categoriaEscolhidaNome = "salada";
                    break;
                default:
                    System.out.println("Opção inválida.");
                    continue;
            }

            input.nextLine();

            if (opcoesAtuais != null) {
                int escolhaItem = input.nextInt();
                String nomeItemEscolhido = opcoesAtuais.get(escolhaItem);

                if (nomeItemEscolhido != null) {
                    mostrarCarrinho.carrinho.add(nomeItemEscolhido);
                    System.out.println("\n" + nomeItemEscolhido + " adicionado ao seu carrinho! \n\n");
                } else {
                    System.out.println("Opção de " + categoriaEscolhidaNome + " inválida.");
                }
            }
        }
        input.close();

        mostrarCarrinho.mostrarProdutosNoCarrinho();
        System.out.println("Obrigado por pedir na nossa cafeteria, " + nome + "!");
    }
}