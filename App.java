import java.io.*;
import java.sql.Date;
import java.util.*;

/**
 * Classe App main - code
 */
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(new File("Dados.txt")); // Arquivo criado no diretório
        Scanner leitor_Jogos = new Scanner(new File("DadosJogos.txt"));
        Lista testeClientes = new Lista();
        ListaJogos testeJogos = new ListaJogos();
        int countCliente = 0, countJogo = 0;

        while (leitor.hasNextLine()) {
            String linhaDados = leitor.nextLine();
            String[] teste = linhaDados.split(";");
            Cliente dados = new Cliente(teste[0], teste[1], teste[2], teste[3]);
            testeClientes.inserir(dados);
            countCliente = countCliente + 1;
        }
        while (leitor_Jogos.hasNextLine()) {
            String linhaJogos = leitor_Jogos.nextLine();
            String[] teste_Jogos = linhaJogos.split(";");
            Jogos dadosGame = new Jogos(Integer.parseInt(teste_Jogos[0]), teste_Jogos[1], teste_Jogos[2], Date.valueOf(teste_Jogos[3]), Float.parseFloat(teste_Jogos[4]));
            testeJogos.inserir_Jogos(dadosGame);
            countJogo = countJogo + 1;

        }
        System.out.println("\n INICIO LISTA CLIENTES \n");
        for (int i = 0; i < countCliente; i++) {
            Cliente clientLsit = testeClientes.imprimir();
            System.out.println(clientLsit);

        }
        System.out.println("\n FIM LISTA CLIENTES \n");
        System.out.println(" INICIO LISTA JOGOS \n");
        for (int i = 0; i < countJogo; i++) {
            Jogos gameList = testeJogos.imprimir();
            System.out.println(gameList);
        }
        System.out.println("\n FIM LISTA JOGOS \n");

    }

}
