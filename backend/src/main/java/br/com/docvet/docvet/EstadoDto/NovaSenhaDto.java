package br.com.docvet.docvet.EstadoDto;

public class NovaSenhaDto{
    String email;
    String senha;
    public NovaSenhaDto(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }


}