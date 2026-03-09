import java.math.BigDecimal;

public class Conta {
    private int cdConta;
    private String dsBanco;
    private String dsDescricao;
    private String tpConta;
    private  BigDecimal nrReceita;
    private Usuario usuario;

    public String getIdUsuario(){
        return usuario.getIdUsuario();
    }

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


    // Getters and Setters
    public int getCdConta() {
        return cdConta;
    }

    public void setCdConta(int cdConta) {
        this.cdConta = cdConta;
    }

    public String getDsBanco() {
        return dsBanco;
    }

    public void setDsBanco(String dsBanco) {
        this.dsBanco = dsBanco;
    }

    public String getDsDescricao() {
        return dsDescricao;
    }

    public void setDsDescricao(String dsDescricao) {
        this.dsDescricao = dsDescricao;
    }

    public String getTpConta() {
        return tpConta;
    }

    public void setTpConta(String tpConta) {
        this.tpConta = tpConta;
    }

    public BigDecimal getReceita() {
        return nrReceita;
    }

    public void setReceita(BigDecimal receita) {
        this.nrReceita = receita;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
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
