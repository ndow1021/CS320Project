package edu.ycp.cs320.booksdb.persist;

import java.util.List;

import edu.ycp.cs320.booksdb.model.Author;
import edu.ycp.cs320.booksdb.model.Book;
import edu.ycp.cs320.booksdb.model.Pair;

public interface IDatabase {
    Integer insertIntoTable(String kidGender, String gender, String name, int user_id);

    List<edu.ycp.cs320.booksdb.model.Author> findAllUser();
    //public List<Pair<email, password>> findAuthorAndBookByTitle(String title);
}
