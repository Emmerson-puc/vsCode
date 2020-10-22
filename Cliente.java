

/**
 * Classe Cliente estrutura de dados
 */

public class Cliente {
    public String CPF;
    public String nome;
    public String nickname;
    public String senha;

    public  Cliente(String CPFCliente, String nomCliente, String nickCliente, String senhaCliente){
        this.CPF = CPFCliente;
        this.nome = nomCliente;
        this.nickname = nickCliente;
        this.senha = senhaCliente;
    }

    public String toString(){
        String aux = CPF + nome + nickname + senha;
        return aux;
    }
}
