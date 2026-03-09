public class Despesa {

    private int cdDespesa;
    private String dsCategoria;
    private String dsSubcategoria;
    private String dsRecorrencia;
    private String fgPago;
    private String dsCondicao;
    private int cdMovimentacao;
    private int cdUsuario;

    public Despesa(int cdDespesa, String dsCategoria, String dsSubcategoria, String dsRecorrencia, String fgPago, String dsCondicao, int cdMovimentacao, int cdUsuario) {
        this.cdDespesa = cdDespesa;
        this.dsCategoria = dsCategoria;
        this.dsSubcategoria = dsSubcategoria;
        this.dsRecorrencia = dsRecorrencia;
        this.fgPago = fgPago;
        this.dsCondicao = dsCondicao;
        this.cdMovimentacao = cdMovimentacao;
        this.cdUsuario = cdUsuario;
    }

    public int getCdDespesa() {
        return cdDespesa;
    }

    public void setCdDespesa(int cdDespesa) {
        this.cdDespesa = cdDespesa;
    }

    public String getDsCategoria() {
        return dsCategoria;
    }

    public void setDsCategoria(String dsCategoria) {
        this.dsCategoria = dsCategoria;
    }

    public String getDsSubcategoria() {
        return dsSubcategoria;
    }

    public void setDsSubcategoria(String dsSubcategoria) {
        this.dsSubcategoria = dsSubcategoria;
    }

    public String getDsRecorrencia() {
        return dsRecorrencia;
    }

    public void setDsRecorrencia(String dsRecorrencia) {
        this.dsRecorrencia = dsRecorrencia;
    }

    public String getFgPago() {
        return fgPago;
    }

    public void setFgPago(String fgPago) {
        this.fgPago = fgPago;
    }

    public String getDsCondicao() {
        return dsCondicao;
    }

    public void setDsCondicao(String dsCondicao) {
        this.dsCondicao = dsCondicao;
    }

    public int getCdMovimentacao() {
        return cdMovimentacao;
    }

    public void setCdMovimentacao(int cdMovimentacao) {
        this.cdMovimentacao = cdMovimentacao;
    }

    public int getCdUsuario() {
        return cdUsuario;
    }

    public void setCdUsuario(int cdUsuario) {
        this.cdUsuario = cdUsuario;
    }

    public void cadastrarDespesa() {
        System.out.println("Cadastrando despesa");
    }

    public void pagarDespesa() {
        System.out.println("Executando pagamento da despesa");
    }

    public void listarDespesa() {
        System.out.println("Listando despesas");
    }
}