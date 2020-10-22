/**
 * Classe Lista para listar os dados
 */
public class Lista {
    public Elemento primeiro;
    public Elemento ultimo;

    public Lista() {
        primeiro = new Elemento(null);
        ultimo = primeiro;
    }

    public void inserir(Cliente dados) {
        Elemento novoCliente = new Elemento(dados);
        ultimo.proximo = novoCliente;
        ultimo = novoCliente;
    }

    public boolean vazio(){
        return (ultimo == primeiro);
    }

    public Cliente imprimir(){
        if (vazio()) {
            return null;
        }
        else{
            Elemento aux = primeiro.proximo;
            primeiro.proximo = aux.proximo;
            if (aux == ultimo) {
                ultimo = primeiro;
            }
            else{
                aux.proximo = null;
            }
            return aux.dadosCliente;
        }
    }

}
