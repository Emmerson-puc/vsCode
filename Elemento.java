/**
 * Classe Elemento apontador
 */
public class Elemento {
    public Cliente dadosCliente;
    public Elemento proximo;

    /**
     * Construtor Elemento
     * 
     * @param dados Dados do Cliente
     */
    public Elemento(Cliente dados) {
        dadosCliente = dados;
        proximo = null;

    }
}
