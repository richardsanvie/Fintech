public class Conta {
    private int cdConta;
    private String dsBanco;
    private String dsDescricao;
    private String tpConta;
    private double nrReceita;
    private Usuario usuario;

    public String getcdUsuario(){
        return usuario.getCd_Usuario();
    }

    // Construtores
    public Conta() {
    }

    public Conta(int cdConta, String dsBanco, String dsDescricao, String tpConta, double receita, Usuario usuario) {
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

    public double getReceita() {
        return nrReceita;
    }

    public void setReceita(double receita) {
        this.nrReceita = receita;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


    // Métodos
    public void depositar(double valor){
        nrReceita += valor;
    }

    public void transferir(double valor, Conta contaDestino){
        if (valor > nrReceita){
            System.out.println("Saldo insuficiente.");
            return;
        }
        nrReceita -= valor;
    }


}
