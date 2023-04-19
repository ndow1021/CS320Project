package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Scanner;

public class callname {
    public static void main(String[] args) throws Exception {
        // load Derby JDBC driver
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        } catch (Exception e) {
            System.err.println("Could not load Derby JDBC driver");
            System.err.println(e.getMessage());
            System.exit(1);
        }

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet resultSet = null;
        int update;
        int author = 0;

        // connect to the database
        conn = DriverManager.getConnection("jdbc:derby:test.db;create=true");

        @SuppressWarnings("resource")
        Scanner keyboard = new Scanner(System.in);

        try {
            conn.setAutoCommit(true);

            // prompt user for title to search for
            System.out.print("lastname: ");
            String lastname = keyboard.nextLine();
            System.out.print("firstname:");
            String firstname = keyboard.nextLine();
            // a canned query to find book information (including author name) from title
            stmt = conn.prepareStatement(
                    "select authors.author_id  "
                            + "  from authors "
                            + "  where authors.lastname = ? "
                            + "     and authors.firstname = ? "
            );

            // substitute the title entered by the user for the placeholder in the query
            stmt.setString(1, lastname);
            stmt.setString(2, firstname);
            // execute the query
            resultSet = stmt.executeQuery();

            if (resultSet.next()) {
                author = resultSet.getInt(1);
            }
            else{

            }





            // prompt user for title to search for
            System.out.print(" tatile: ");
            String tatile = keyboard.nextLine();
            System.out.print("ISBN:");
            String ISBN = keyboard.nextLine();
            System.out.print("Published:");
            int Published = keyboard.nextInt();

            stmt = conn.prepareStatement(
                    "insert into  books(author_id, title, ISBN, published)  "
                            + " values(?, ?, ?, ? )"

            );

            // substitute the title entered by the user for the placeholder in the query
            stmt.setInt(1, author);
            stmt.setString(2, tatile);
            stmt.setString(3, ISBN);
            stmt.setInt(4, Published);
            // execute the query

            update = stmt.executeUpdate();

            System.out.println("good");

        } finally {
            // close result set, statement, connection
            DBUtil.closeQuietly(resultSet);
            DBUtil.closeQuietly(stmt);
            DBUtil.closeQuietly(conn);
        }
    }
}

