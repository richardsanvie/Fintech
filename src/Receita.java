import java.time.LocalDate;
import java.math.BigDecimal;


public class Receita {

    private Long id;
    private Long movimentacaoId;
    private Long usuarioId;
    private String descricao;
    private BigDecimal valor;
    private LocalDate data;
    private String recorrencia;


    public Receita() {
    }

    public Receita(Long id, Long movimentacaoId, Long usuarioId, String descricao, BigDecimal valor, LocalDate data, String recorrencia) {
        this.id = id;
        this.movimentacaoId = movimentacaoId;
        this.usuarioId = usuarioId;
        this.descricao = descricao;
        this.valor = valor;
        this.data = data;
        this.recorrencia = recorrencia;
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

