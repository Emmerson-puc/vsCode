/**
 * Classe Lista para listar os dados
 */
public class Lista {
    public Elemento primeiro;
    public Elemento ultimo;

    /**
     * Construtor da Classe Lista
     */
    public Lista() {
        primeiro = new Elemento(null);
        ultimo = primeiro;
    }

    /**
     * Método para inserir os dados do Cliente
     * 
     * @param dados Dados do Cliente
     */
    public void inserir(Cliente dados) {
        Elemento novoCliente = new Elemento(dados);
        ultimo.proximo = novoCliente;
        ultimo = novoCliente;
    }

    /**
     * Método verifica se a lista esta vazia
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
    public Cliente imprimir() {
        if (vazio()) {
            return null;
        } else {
            Elemento aux = primeiro.proximo;
            primeiro.proximo = aux.proximo;
            if (aux == ultimo) {
                ultimo = primeiro;
            } else {
                aux.proximo = null;
            }
            return aux.dadosCliente;
        }
    }

}
