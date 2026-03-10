import java.math.BigDecimal;
import java.time.LocalDate;

public class Despesa {

    private Long id;
    private Long movimentacaoId;
    private Long usuarioId;
    private String categoria;
    private String subcategoria;
    private String recorrencia;
    private boolean pago;
    private boolean condicao;
    private BigDecimal valor;
    private LocalDate data;

    public Despesa(Long id, Long movimentacaoId, Long usuarioId, String categoria, String subcategoria, String recorrencia, boolean pago, boolean condicao, BigDecimal valor, LocalDate data) {
        this.id = id;
        this.movimentacaoId = movimentacaoId;
        this.usuarioId = usuarioId;
        this.categoria = categoria;
        this.subcategoria = subcategoria;
        this.recorrencia = recorrencia;
        this.pago = pago;
        this.condicao = condicao;
        this.valor = valor;
        this.data = data;
    }

    public Despesa() {
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