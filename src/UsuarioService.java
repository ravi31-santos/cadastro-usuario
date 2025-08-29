import java.util.ArrayList;

public class UsuarioService {

    private ArrayList<Usuario> user = new ArrayList<>();
    private int nextID = 1;

    public void cadastrar(String nome_user){
        user.add(new Usuario(nextID++, nome_user));
    }
    public void listarUsuario(){
        if(user.isEmpty()){
            System.out.println("Nenhum usuário cadastrado.");
        }
        else{
            for(Usuario u : user){
                System.out.println(u);
            }
        }
    }

    public void verificarCadastro(int id){
        for(Usuario u : user){
            if (u.getId() == id){
                u.Cadastrar();
                System.out.println("Usuário cadastrado.");
                return;
            }
        }
        System.out.println("Usuário não encontrado.");
    }
    public void remover_usuario(int id){
        user.removeIf(u -> u.getId() == id);
        System.out.println("Usuário removido (caso exista)");
    }

}
