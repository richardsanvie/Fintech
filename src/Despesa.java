public class Despesa {

    private int despesa;
    private String categoria;
    private String subcategoria;
    private String recorrencia;
    private String pago;
    private String condicao;
    private int movimentacao;
    private int usuario;

    public Despesa(int despesa, String categoria, String subcategoria, String recorrencia, String pago, String condicao, int movimentacao, int usuario) {
        this.despesa = despesa;
        this.categoria = categoria;
        this.subcategoria = subcategoria;
        this.recorrencia = recorrencia;
        this.pago = pago;
        this.condicao = condicao;
        this.movimentacao = movimentacao;
        this.usuario = usuario;
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