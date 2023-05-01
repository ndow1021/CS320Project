package DerbyIntegration;

import model.User;
import java.util.List;

public interface IDatabase {

    public List<User> findAllUsers();

}
