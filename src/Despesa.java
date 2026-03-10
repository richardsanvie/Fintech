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