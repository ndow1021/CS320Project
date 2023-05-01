package SQL;

public interface IDatabase {
    Integer insertIntoTable(String kidGender, String gender, String name, int user_id);
    //public List<Pair<email, password>> findAuthorAndBookByTitle(String title);
}
