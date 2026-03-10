import java.time.LocalDate;
import java.math.BigDecimal;


public class Receita {

    private String descricao;
    private BigDecimal valor;
    private LocalDate data;
    private int cdReceita;
    private int cdMovimentacao;
    private int cdUsuario;



    public Receita(String descricao, BigDecimal valor, LocalDate data, int cdReceita, int cdMovimentacao, int cdUsuario) {
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
        this.cdMovimentacao = cdMovimentacao;
        this.cdReceita = cdReceita;
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