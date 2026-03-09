import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class Movimentacao {
    private Long id;
    private BigDecimal valor;
    private String descricao;
    private String recorrencia;
    private Long usuarioId;
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

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getRecorrencia() {
        return recorrencia;
    }

    public void setRecorrencia(String recorrencia) {
        this.recorrencia = recorrencia;
    }

    public Long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Long usuarioId) {
        this.usuarioId = usuarioId;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }


    // Métodos
    public void registrar() {
        System.out.println("Executando método registrar() - Registrando movimentação do tipo: " + getTipo() + " no valor de R$" + getValor());
    }

    public void cancelar() {
        System.out.println("Executando método cancelar() - Cancelando movimentação ID: " + getId());
    }

    public void consultarStatus() {
        System.out.println("Executando método consultarStatus() - Status da movimentação " + getId() + ": " + getStatus());
    }

    public void gerarComprovante() {
        System.out.println("Executando método gerarComprovante() - Gerando comprovante da movimentação ID: " + getId());
    }

    // Abstract
    public abstract boolean validar();
    public abstract String getTipo();
    public abstract String getStatus();
}
