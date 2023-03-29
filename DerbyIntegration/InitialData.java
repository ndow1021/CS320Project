package edu.ycp.cs320.booksdb.persist;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import edu.ycp.cs320.booksdb.model.Author;
import edu.ycp.cs320.booksdb.model.Book;

public class InitialData {
	public static List<Users> getAuthors() throws IOException {
		List<Users> userList = new ArrayList<Users>();
		edu.ycp.cs320.booksdb.persist.ReadCSV readUsers = new edu.ycp.cs320.booksdb.persist.ReadCSV("authors.csv");
		try {
			// auto-generated primary key for authors table
			Integer userId = 1;
			while (true) {
				List<String> tuple = readAuthors.next();
				if (tuple == null) {
					break;
				}
				Iterator<String> i = tuple.iterator();
				User user = new User();
				user.setUserId(userId++);
				user.setLastname(i.next());
				user.setFirstname(i.next());
				userList.add(user);
			}
			return userList;
		} finally {
			readUsers.close();
		}
	}
	
	public static <ReadCSV> List<userData> getBooks() throws IOException {
		List<userData> dataList = new ArrayList<userData>();
		ReadCSV readBooks = new ReadCSV("books.csv");
		try {
			// auto-generated primary key for books table
			Integer dataId = 1;
			while (true) {
				List<String> tuple = readData.next();
				if (tuple == null) {
					break;
				}
				Iterator<String> i = tuple.iterator();
				userData data = new userData();
				data.setBookId(dataId++);
				data.setAuthorId(Integer.parseInt(i.next()));
				data.setTitle(i.next());
				data.setIsbn(i.next());
				data.setPublished(Integer.parseInt(i.next()));
				dataList.add(data);
			}
			return dataList;
		} finally {
			readBooks.close();
		}
	}
}
