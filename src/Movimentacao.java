import java.util.Date;

public abstract class Movimentacao {
    private int cdMovimentacao;
    private double nrValor;
    private String dsRecorrencia;
    private int cdUsuario;
    private Date dtDate;
    Usuario usuario;

    public Movimentacao() {
    }

    public Movimentacao(int cdMovimentacao, double nrValor, String dsRecorrencia, int cdUsuario, Date dtDate, Usuario usuario) {
        this.cdMovimentacao = cdMovimentacao;
        this.nrValor = nrValor;
        this.dsRecorrencia = dsRecorrencia;
        this.cdUsuario = cdUsuario;
        this.dtDate = dtDate;
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

    public int getCdUsuario() {
        return cdUsuario;
    }

    public void setCdUsuario(int cdUsuario) {
        this.cdUsuario = cdUsuario;
    }

    public Date getDtDate() {
        return dtDate;
    }

    public void setDtDate(Date dtDate) {
        this.dtDate = dtDate;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getMovimentacao(){
        return this.cdMovimentacao + ","
                + this.nrValor + ","
                + this.dsRecorrencia + ",";
    }
}
