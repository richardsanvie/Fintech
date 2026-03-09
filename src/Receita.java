public class Receita {

    private String descricao;
    private double valor;
    private LocalDate data;
    private int cdReceita;
    private int cdMovimentaçao;
    private int cdUsuario;


    public Receita(String descricao, double valor, LocalDate data, int cdReceita, int cdMovimentaçao, int cdUsuario) {
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
        this.cdMovimentaçao = cdMovimentaçao;
        this.cdReceita = cdReceita;
        this.cdUsuario = cdUsuario;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public int getCdReceita() {
        return cdReceita;
    }
    public void setCdReceita(int cdReceita) {
        this.cdReceita = cdReceita;
    }
    public int getCdMovimentaçao() {
        return cdMovimentaçao;
    }
    public void setCdMovimentaçao(int cdMovimentaçao) {
        this.cdMovimentaçao = cdMovimentaçao;
    }
    public int getCdUsuario() {
        return cdUsuario;
    }
    public void setCdUsuario(int cdUsuario) {
        this.cdUsuario = cdUsuario;
    }
    public void cadastrarReceita() {
        System.out.println("Receita cadastrada com sucesso!");
    }
    public void editarReceita() {
        System.out.println("Receita editada com sucesso!");
    }
    public void excluirReceita() {
        System.out.println("Receita excluída com sucesso!");
    }
    public void listarReceitas() {
        System.out.println("Listando receitas...");
    }
}