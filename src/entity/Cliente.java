
package entity;

public class Cliente {
    private int id;
    private String nome;
    private String mail;
    private String senha;
    private TipoCliente tipo;

    public Cliente(int id, String nome, String mail, String senha, TipoCliente tipo) {
        this.id = id;
        this.nome = nome;
        this.mail = mail;
        this.senha = senha;
        this.tipo = tipo;
    }

    public Cliente() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + nome + ", mail=" + mail + ", senha=" + senha + ", tipo=" + tipo + '}';
    }
    

   
}
