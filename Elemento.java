/**
 * Classe Elemento
 */
public class Elemento {
    public Cliente dadosCliente;
    public Elemento proximo;

    public Elemento(Cliente dados){
        dadosCliente = dados;
        proximo = null;

    }
}
