public class Usuario {


    private int id;
    private String nome_user;
    private int idade_user;
    private String cargo_user;
    private boolean user_cadastrado;

    public Usuario(int id, String nome_user){
        this.id=id;
        this.nome_user=nome_user;
        this.idade_user=idade_user;
        this.cargo_user=cargo_user;
        this.user_cadastrado = false;
    }

    public int getId(){
        return id;
    }
    public String getNome_user(){
        return nome_user;
    }
    public int getIdade_user(){
        return idade_user;
    }
    public String getCargo_user(){
        return cargo_user;
    }
    public boolean isUser_cadastrado(){
        return user_cadastrado;
    }
    public void Cadastrar(){
        this.user_cadastrado = true;
    }

    @Override
    public String toString(){
        return id + " - " + nome_user + (user_cadastrado ? "✅ " : " ❌");
    }

}
