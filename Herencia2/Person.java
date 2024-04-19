
public class Person {
    protected String name;
    protected String phone_number;
    protected String email;
    public Person(String name, String phone_number, String email) {
        this.name = name;
        this.phone_number = phone_number;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone_number() {
        return phone_number;
    }
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "name=" + this.name + ", phone_number=" + this.phone_number + ", email=" + this.email ;
    }

}