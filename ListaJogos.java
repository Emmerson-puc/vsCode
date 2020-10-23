/**
 * Classe de Lista
 */
public class ListaJogos {
    public ElemJogos primeiro;
    public ElemJogos ultimo;

    /**
     * Construtor da Classe Lista
     */
    public ListaJogos() {
        primeiro = new ElemJogos(null);
        ultimo = primeiro;
    }

    /**
     * Método para inserir os dados dos jogos na lista
     * 
     * @param dadosjogos Dados dos jogos
     */
    public void inserir_Jogos(Jogos dadosjogos) {
        ElemJogos novoJogo = new ElemJogos(dadosjogos);
        ultimo.proximo = novoJogo;
        ultimo = novoJogo;
    }

    /**
     * Método para informa se a lista esta
     * 
     * @return Booleano
     */
    public boolean vazio() {
        return (ultimo == primeiro);
    }

    /**
     * Método para imprimir a Lista
     * 
     * @return Retorna os dados
     */
    public Jogos imprimir() {
        if (vazio()) {
            return null;
        } else {
            ElemJogos aux = primeiro.proximo;
            primeiro.proximo = aux.proximo;
            if (aux == ultimo) {
                ultimo = primeiro;
            } else {
                aux.proximo = null;
            }
            return aux.dadosJogos;
        }
    }
}
