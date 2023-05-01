package DerbyIntegration;

import model.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FakeDatabase implements IDatabase {
	
	private List<User> userList;

	
	public FakeDatabase() {
		userList = new ArrayList<User>();

		
		// Add initial data
		readInitialData();
		
		System.out.println(userList.size() + " user");

	}

	public void readInitialData() {
		try {
			userList.addAll(DerbyIntegration.InitialData.getUser());
		} catch (IOException e) {
			throw new IllegalStateException("Couldn't read initial data", e);
		}
	}

	// query that retrieves all Authors from DB
	@Override
	public List<User> findAllUsers() {
		List<User> result = new ArrayList<User>();
		for (User user : userList) {
			result.add(user);
		}
		return result;
	}


	private User findUserByUserId(int userId) {
		for (User user : userList) {
			if (user.getUserId() == userId) {
				return user;
			}
		}
		return null;
	}
}
