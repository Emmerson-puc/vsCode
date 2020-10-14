import java.util.*;
public class Jogos{
    public int idJogo;
    public String nomeJogo;
    public String plataforma;
    public Date ano_Lancamento;
    public float preco;

    public  Jogos(int teste, String nomJogo, String plt, Date anoLan, Float price){
        this.idJogo = teste;
        this.nomeJogo = nomJogo;
        this.plataforma = plt;
        this.ano_Lancamento = anoLan;
        this.preco = price;
    }
}
