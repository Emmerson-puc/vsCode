import java.util.*;

/**
 * Classe de dados dos produtos
 */
public class Jogos {
    public int idJogo;
    public String nomeJogo;
    public String plataforma;
    public Date ano_Lancamento;
    public float preco;

    /**
     * Construtor da classe Jogos
     * 
     * @param Id      Identificação do Jogo
     * @param nomJogo Nome dos Jogos
     * @param plt     Plataforma dos Jogos
     * @param anoLan  Ano de lançamento do produto
     * @param price   Preço sugerido
     */
    public Jogos(int Id, String nomJogo, String plt, Date anoLan, Float price) {
        this.idJogo = Id;
        this.nomeJogo = nomJogo;
        this.plataforma = plt;
        this.ano_Lancamento = anoLan;
        this.preco = price;
    }

    /**
     * Método String para imprimir os dados formatados
     */
    public String toString() {
        String aux = "Id do Jogo: " + idJogo + " Nome do Jogo: " + nomeJogo + " Plataforma: " + plataforma
                + " Ano de Lançamento: " + ano_Lancamento + " Preço: " + preco;
        return aux;
    }
}
