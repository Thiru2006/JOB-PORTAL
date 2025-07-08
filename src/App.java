import db.DBConnection;
import dao.UserDAO;
import model.User;

import java.sql.Connection;

public class App {
    public static void main(String[] args) {
        try {
            Connection conn = DBConnection.getConnection();
            User user = new User("Thiru", "thiru@example.com", "securePass123");
            UserDAO userDAO = new UserDAO(conn);
            userDAO.insertUser(user);
            System.out.println("User inserted successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
