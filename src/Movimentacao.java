import java.math.BigDecimal;
import java.time.LocalDate;

public class Movimentacao {
    private Long id;
    private Long usuarioId;
    private BigDecimal valor;
    private String descricao;
    private String recorrencia;
    private LocalDate data = LocalDate.now();

    // Construtors
    public Movimentacao() {
    }

    public Movimentacao(BigDecimal valor, String descricao, String recorrencia, Long usuarioId, LocalDate data) {
        this.valor = valor;
        this.descricao = descricao;
        this.recorrencia = recorrencia;
        this.usuarioId = usuarioId;
        this.data = data;
    }


    // Métodos
    public void cancelar() {
        System.out.println("Executando método cancelar() - Cancelando movimentação ID: " + id);
    }

    public void gerarComprovante() {
        System.out.println("Executando método gerarComprovante() - Gerando comprovante da movimentação ID: " + id);
    }


}
