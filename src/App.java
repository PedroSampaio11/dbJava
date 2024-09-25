import DAO.UserDao;
import entity.User;

public class App {
    public static void main(String[] args) throws Exception {
        User u = new User();
        u.setEmail_user("luiz@email");
        u.setSenha_user("luiz");
        new UserDao().cadastrarUser(u);

        User u2 = new User();
        u2.setEmail_user("pedro@email");
        u2.setSenha_user("pedro");
        new UserDao().cadastrarUser(u2);

        User u3 = new User();
        u3.setEmail_user("guilherme@email");
        u3.setSenha_user("guilherme");
        new UserDao().cadastrarUser(u3);

        User u4 = new User();
        u4.setEmail_user("guilh@email");
        u4.setSenha_user("guiherme");
        new UserDao().cadastrarUser(u4);

    }
}
