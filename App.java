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

        while (leitor.hasNextLine()) {
            String linhaDados = leitor.nextLine();
            String linhaJogos = leitor_Jogos.nextLine();
            String[] teste = linhaDados.split(";");
            String[] teste_Jogos = linhaJogos.split(";");
            Cliente dados = new Cliente(teste[0], teste[1], teste[2], teste[3]);
            Jogos dadosGame = new Jogos(Integer.parseInt(teste_Jogos[0]), teste_Jogos[1], teste_Jogos[2],
                    Date.valueOf(teste_Jogos[3]), Float.parseFloat(teste_Jogos[4]));
            testeClientes.inserir(dados);
            testeJogos.inserir_Jogos(dadosGame);

            System.out.println(dados.toString());
            System.out.println(dadosGame.toString());

        }

    }

}
