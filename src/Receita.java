import java.time.LocalDate;
import java.math.BigDecimal;


public class Receita {

    private String descricao;
    private BigDecimal valor;
    private LocalDate data;
    private int receita;
    private int movimentacao;
    private int usuario;



    public Receita(String descricao, BigDecimal valor, LocalDate data, int receita, int movimentacao, int usuario) {
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
        this.movimentacao = movimentacao;
        this.receita = receita;
        this.usuario = usuario;
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