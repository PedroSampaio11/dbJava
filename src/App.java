import DAO.UserDao;
import entity.User;

public class App {
    public static void main(String[] args) throws Exception {
        User u = new User();
        u.setEmail_user("luiz@email");
        u.setSenha_user("luiz");

        User u2 = new User();
        u2.setEmail_user("pedro@email");
        u2.setSenha_user("pedro");

        User u3 = new User();
        u3.setEmail_user("guilherme@email");
        u3.setSenha_user("guilherme");

        new UserDao().cadastrarUser(u);
    }
}
