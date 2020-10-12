import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(new File("D:\\Users\\okiada\\Documents\\Dados.txt"));
        Lista testeClientes = new Lista();

        while(leitor.hasNextLine()){
            String linhaDados = leitor.nextLine();
            String[] teste = linhaDados.split(";");
            Cliente dados  = new Cliente(teste[0], teste[1], teste[2], teste[3]);
            testeClientes.inserir(dados);  
        }
      
        
    }


}
