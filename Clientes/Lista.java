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

    public void inserir(Cliente dadosCliente) {
        Elemento novoCliente = new Elemento(dadosCliente);
        ultimo.proximo = novoCliente;
        ultimo = novoCliente;
    }

}
