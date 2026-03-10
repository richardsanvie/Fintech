import java.math.BigDecimal;

public class Conta {
    private int cdConta;
    private String dsBanco;
    private String dsDescricao;
    private String tpConta;
    private  BigDecimal nrReceita;
    private Usuario usuario;



    // Construtores
    public Conta() {
    }

    public Conta(int cdConta, String dsBanco, String dsDescricao, String tpConta, BigDecimal receita, Usuario usuario) {
        this.cdConta = cdConta;
        this.dsBanco = dsBanco;
        this.dsDescricao = dsDescricao;
        this.tpConta = tpConta;
        this.nrReceita = receita;
        this.usuario = usuario;
    }


    // Métodos
    public void depositar(BigDecimal valor){
        nrReceita = nrReceita.add(valor);
        System.out.println("Depósito realizado.");

    }

    public void transferir(BigDecimal valor, Conta contaDestino){
        if (valor.compareTo(nrReceita)>0){
            System.out.println("Saldo insuficiente.");
            return;
        }
        nrReceita = nrReceita.subtract(valor);
        System.out.println("Transferência realizada.");

    }


}
