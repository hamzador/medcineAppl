package mobildev.iosm.com.medcineapp.Model;

public class Users
{
    private  String password, phone, username,email,FirstName,LastName,type;

    public Users()
    {

    }

    public Users(String password, String phone, String username) {
        this.password = password;
        this.phone = phone;
        this.username = username;
    }

    public Users(String password, String phone, String username, String email, String firstName, String lastName, String type) {
        this.password = password;
        this.phone = phone;
        this.username = username;
        this.email = email;
        FirstName = firstName;
        LastName = lastName;
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
