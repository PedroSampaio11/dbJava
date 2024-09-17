package entity;

public class User {
    private int id_user;
    private String email_user;
    private String senha_user;

    public int getId_user() {
        return id_user;
    }
    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    

    public String getEmail_user() {
        return email_user;
    }
    public void setEmail_user(String email_user) {
        this.email_user = email_user;
    }



    public String getSenha_user() {
        return senha_user;
    }
    public void setSenha_user(String senha_user) {
        this.senha_user = senha_user;
    }
}
