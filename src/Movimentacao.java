import java.util.Date;

public abstract class Movimentacao {
    private int cdMovimentacao;
    private double nrValor;
    private String dsRecorrencia;
    Usuario usuario;

    public Movimentacao() {
    }

    public Movimentacao(int cdMovimentacao, double nrValor, String dsRecorrencia, Usuario usuario) {
        this.cdMovimentacao = cdMovimentacao;
        this.nrValor = nrValor;
        this.dsRecorrencia = dsRecorrencia;
        this.usuario = usuario;
    }

    public int getCdMovimentacao() {
        return cdMovimentacao;
    }

    public void setCdMovimentacao(int cdMovimentacao) {
        this.cdMovimentacao = cdMovimentacao;
    }

    public double getNrValor() {
        return nrValor;
    }

    public void setNrValor(double nrValor) {
        this.nrValor = nrValor;
    }

    public String getDsRecorrencia() {
        return dsRecorrencia;
    }

    public void setDsRecorrencia(String dsRecorrencia) {
        this.dsRecorrencia = dsRecorrencia;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public abstract String getMovimentacao();
}
