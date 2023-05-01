package Query;

import DerbyIntegration.DatabaseProvider;
import DerbyIntegration.IDatabase;
import model.User;

import java.util.List;
import java.util.Scanner;

public class AllUserQuery {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        // Create the default IDatabase instance
        InitDatabase.init(keyboard);

        // get the DB instance and execute transaction
        IDatabase db = DatabaseProvider.getInstance();
        List<User> userList = db.findAllUsers();

        // check if anything was returned and output the list
        if (userList.isEmpty()) {
            System.out.println("There are no users in the database");
        }
        else {
            for (User user : userList) {
                System.out.println(user.getLastname() + ", " + user.getFirstname());
            }
        }
    }
}
