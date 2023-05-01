package model;

public class User {
    private int userId;
    private String lastname;
    private String firstname;

    private String gender;

    private String child_gender;

    public User() {

    }

    public void setUserId(int userId) { this.userId = userId;}

    public int getUserId() {
        return userId;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() { return gender;}

    public void setChild_gender(String child_gender) {this.child_gender = child_gender;}

    public String getChild_gender() {
        return child_gender;
    }
}
