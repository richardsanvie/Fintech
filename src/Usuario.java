public class Usuario {
    private String idUsuario;
    private String nome;
    private String sobrenome;
    private String cpf;

    public Usuario(String cpf, String dataNascimento, String email, String genero, String idUsuario, String nome, String senha, String sobrenome, String telefone) {
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.genero = genero;
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.senha = senha;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
    }

    public void realizarLogoff() {
        System.out.println("Usuário " + this.nome + " saiu do sistema.");
    }

    public void alterarsenha() {
        System.out.println("A senha do Usuário" + this.nome + "foi atualizada com sucesso");
    }

    private String senha;
    private String telefone;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    private String email;
    private String genero;
    private String dataNascimento;
}
