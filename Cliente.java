
/**
 * Classe de dados Cliente
 */

public class Cliente {
    public String CPF;
    public String nome;
    public String nickname;
    public String senha;

    /**
     * Construtor da classe Cliente
     * 
     * @param CPFCliente   CPF único
     * @param nomCliente   nome do Cliente
     * @param nickCliente  Apelodo escolhido pelo Cliente
     * @param senhaCliente Senha do Cliente
     */
    public Cliente(String CPFCliente, String nomCliente, String nickCliente, String senhaCliente) {
        this.CPF = CPFCliente;
        this.nome = nomCliente;
        this.nickname = nickCliente;
        this.senha = senhaCliente;
    }

    /**
     * Método String para imprimir os dados formatados
     */
    public String toString() {
        String aux = "CPF: " + CPF + " Nome Cliente: " + nome + " Apelido: " + nickname + " Senha: " + senha;
        return aux;
    }
}
