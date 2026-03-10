import java.math.BigDecimal;

public class Conta {
    private int conta;
    private String banco;
    private String descricao;
    private String tipoConta;
    private  BigDecimal receita;
    private Usuario usuario;



    // Construtores
    public Conta() {
    }

    public Conta(int conta, String banco, String descricao, String tipoConta, BigDecimal receita, Usuario usuario) {
        this.conta = conta;
        this.banco = banco;
        this.descricao = descricao;
        this.tipoConta = tipoConta;
        this.receita = receita;
        this.usuario = usuario;
    }


    // Métodos
    public void depositar(BigDecimal valor){
        receita = receita.add(valor);
        System.out.println("Depósito realizado.");

    }

    public void transferir(BigDecimal valor, Conta contaDestino){
        if (valor.compareTo(receita)>0){
            System.out.println("Saldo insuficiente.");
            return;
        }
        receita = receita.subtract(valor);
        System.out.println("Transferência realizada.");

    }


}
