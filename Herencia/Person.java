public class Person {
    protected String user_name="";
    protected String lastname="";
    protected String document="";
    protected String gender="";
    public Person(String user_name, String lastname, String document, String gender) {
        this.user_name = user_name;
        this.lastname = lastname;
        this.document = document;
        this.gender = gender;
    }
    public String getUser_name() {
        return user_name;
    }
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getDocument() {
        return document;
    }
    public void setDocument(String document) {
        this.document = document;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    @Override
    public String toString() {
        return "Person [user_name=" + user_name + ", lastname=" + lastname + ", document=" + document + ", gender="
                + gender + "]";
    }
}
