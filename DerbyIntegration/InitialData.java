package DerbyIntegration;

import model.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class InitialData extends User {

	public static List<User> getUser() throws IOException {
		List<User> userList = new ArrayList<User>();
		edu.ycp.cs320.booksdb.persist.ReadCSV readUsers = new edu.ycp.cs320.booksdb.persist.ReadCSV("Users.csv");
		try {
			// auto-generated primary key for authors table
			Integer userId = 1;
			while (true) {
				List<String> tuple = readUsers.next();
				if (tuple == null) {
					break;
				}
				Iterator<String> i = tuple.iterator();
				User user = new User();
				user.setUserId(userId++);
				user.setLastname(i.next());
				user.setFirstname(i.next());
				user.setGender(i.next());
				user.setChild_gender(i.next());
				userList.add(user);
			}
			return userList;
		} finally {
			readUsers.close();
		}
	}



}
