import java.math.BigDecimal;

public class Conta {
    private Long id;
    private String banco;
    private String descricao;
    private String tipoConta;
    private BigDecimal saldo = BigDecimal.ZERO;
    private Usuario usuario;



    // Construtores
    public Conta() {
    }

    public Conta(Long id, String banco, String descricao, String tipoConta, BigDecimal saldo, Usuario usuario) {
        this.id = id;
        this.banco = banco;
        this.descricao = descricao;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
        this.usuario = usuario;
    }


    // Métodos
    public void depositar(BigDecimal valor){
        saldo = saldo.add(valor);
        System.out.println("Depósito realizado.");

    }

    public void transferir(BigDecimal valor, Conta contaDestino){
        if (valor.compareTo(saldo)>0){
            System.out.println("Saldo insuficiente.");
            return;
        }
        saldo = saldo.subtract(valor);
        System.out.println("Executando método transferir() - Transferência de R$" + valor + " realizada.");

    }


}
