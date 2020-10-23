import java.io.*;
import java.sql.Date;
import java.util.*;

/**
 * Classe App main - code
 */
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(new File("Dados.txt")); // Arquivo criado no diretório
        Scanner leitor_Jogos = new Scanner(new File("DadosJogos.txt")); // Arquivo criado no diretorio
        Lista listaClientes = new Lista();
        ListaJogos listaJogos = new ListaJogos();
        int countCliente = 0, countJogo = 0;

        // Enquanto o leitor conter dados
        while (leitor.hasNextLine()) {
            String linhaDados = leitor.nextLine();
            String[] client = linhaDados.split(";");
            Cliente dados = new Cliente(client[0], client[1], client[2], client[3]);
            listaClientes.inserir(dados);
            countCliente = countCliente + 1;
        }
        while (leitor_Jogos.hasNextLine()) {
            String linhaJogos = leitor_Jogos.nextLine();
            String[] jogo = linhaJogos.split(";");
            Jogos dadosGame = new Jogos(Integer.parseInt(jogo[0]), jogo[1], jogo[2], Date.valueOf(jogo[3]),
                    Float.parseFloat(jogo[4]));
            listaJogos.inserir_Jogos(dadosGame);
            countJogo = countJogo + 1;

        }
        // Monta a Lista para imprimir
        System.out.println("\n INICIO LISTA CLIENTES \n");
        for (int i = 0; i < countCliente; i++) {
            Cliente clientLsit = listaClientes.imprimir();
            System.out.println(clientLsit);

        }
        System.out.println("\n FIM LISTA CLIENTES \n");
        System.out.println(" INICIO LISTA JOGOS \n");
        for (int i = 0; i < countJogo; i++) {
            Jogos gameList = listaJogos.imprimir();
            System.out.println(gameList);
        }
        System.out.println("\n FIM LISTA JOGOS \n");
        leitor.close();
        leitor_Jogos.close();

    }

}
