package edu.ycp.cs320.booksdb.persist;

public class DatabaseProvider {
	private static edu.ycp.cs320.booksdb.persist.IDatabase theInstance;
	
	public static void setInstance(edu.ycp.cs320.booksdb.persist.IDatabase db) {
		theInstance = db;
	}
	
	public static edu.ycp.cs320.booksdb.persist.IDatabase getInstance() {
		if (theInstance == null) {
			throw new IllegalStateException("IDatabase instance has not been set!");
		}
		return theInstance;
	}
}
