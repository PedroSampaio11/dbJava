import DAO.UserDao;
import entity.User;

public class App {
    public static void main(String[] args) throws Exception {
        User u = new User();
        u.setEmail_user("PedroTeste@email.com");
        u.setSenha_user("PedroTeste");

        new UserDao().cadastrarUser(u);
    }
}
