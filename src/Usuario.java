import java.time.LocalDate;

public class Usuario {
    private Long id;
    private String nome;
    private String sobrenome;
    private String cpf;
    private LocalDate dataNascimento;
    private String email;
    private String genero;
    private String senha;
    private String telefone;
    private boolean ativo;


    public Usuario(String cpf, LocalDate dataNascimento, String email, String genero, Long id, String nome, String senha, String sobrenome, String telefone) {
        this.cpf = cpf;
        this.email = email;
        this.genero = genero;
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.ativo = true;
        this.dataNascimento = dataNascimento;
    }

    public Usuario() {
    }

    public void alterarSenha() {
        System.out.println("A senha do Usuário " + this.nome + " foi atualizada com sucesso");
    }

    public void atualizarPerfil() {
        System.out.println("Atualizando dados do usuário: " + this.nome);
    }

    public void exibirPerfil() {
        System.out.println("Perfil do Usuário");
        System.out.println("Nome: " + this.nome + " " + this.sobrenome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("E-mail: " + this.email);
    }

      public void desativarConta() {
        this.ativo = false;
        System.out.println("A conta do usuário " + this.nome + " foi desativada com sucesso.");
    }
}




