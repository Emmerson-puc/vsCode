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

    public boolean vazio(){
        return (ultimo == primeiro);
    }

    public Jogos imprimir(){
        if (vazio()) {
            return null;
        }
        else{
            ElemJogos aux = primeiro.proximo;
            primeiro.proximo = aux.proximo;
            if (aux == ultimo) {
                ultimo = primeiro;
            }
            else{
                aux.proximo = null;
            }
            return aux.dadosJogos;
        }
    }
}
