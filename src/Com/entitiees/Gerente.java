package Com.entitiees;

public class Gerente extends Funcionario {
    private String login;
    private String senha;

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
