public class ListaJogos {
    public ElemJogos primeiro;
    public ElemJogos ultimo;

    public ListaJogos() {
        primeiro = new ElemJogos(null);
        ultimo = primeiro;
    }

    public void inserir_Jogos(Jogos dadosjogos ) {
        ElemJogos novoJogo = new ElemJogos(dadosjogos);
        ultimo.proximo = novoJogo;
        ultimo = novoJogo;
    }
}
