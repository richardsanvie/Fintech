public class Usuario {
    private String cdUsuario;
    private String nmNome;
    private String nmSobrenome;

    public Usuario(String cdUsuario, String ds_email, String ds_genero, String dt_nascimento, String nm_nome, String nm_sobrenome, String nr_Cpf, String nr_Telefone, String senha) {
        cdUsuario = cdUsuario;
        Ds_email = ds_email;
        Ds_genero = ds_genero;
        Dt_nascimento = dt_nascimento;
        this.nmNome = nm_nome;
        this.nm_sobrenome = nm_sobrenome;
        Nr_Cpf = nr_Cpf;
        Nr_Telefone = nr_Telefone;
        Senha = senha;
    }

    private String Nr_Cpf;
    private String Senha;
    private String Nr_Telefone;
    private String Ds_email;
    private String Ds_genero;
    private String Dt_nascimento;

    public String getCd_Usuario() {
        return Cd_Usuario;
    }

    public void setCd_Usuario(String cd_Usuario) {
        Cd_Usuario = cd_Usuario;
    }

    public String getDs_email() {
        return Ds_email;
    }

    public void setDs_email(String ds_email) {
        Ds_email = ds_email;
    }

    public String getDs_genero() {
        return Ds_genero;
    }

    public void setDs_genero(String ds_genero) {
        Ds_genero = ds_genero;
    }

    public String getDt_nascimento() {
        return Dt_nascimento;
    }

    public void setDt_nascimento(String dt_nascimento) {
        Dt_nascimento = dt_nascimento;
    }

    public String getNm_nome() {
        return nm_nome;
    }

    public void setNm_nome(String nm_nome) {
        this.nm_nome = nm_nome;
    }

    public String getNm_sobrenome() {
        return nm_sobrenome;
    }

    public void setNm_sobrenome(String nm_sobrenome) {
        this.nm_sobrenome = nm_sobrenome;
    }

    public String getNr_Cpf() {
        return Nr_Cpf;
    }

    public void setNr_Cpf(String nr_Cpf) {
        Nr_Cpf = nr_Cpf;
    }

    public String getNr_Telefone() {
        return Nr_Telefone;
    }

    public void setNr_Telefone(String nr_Telefone) {
        Nr_Telefone = nr_Telefone;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
    }
}
