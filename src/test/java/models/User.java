package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    private int id;
    private String name;
    private String username;
    private String email;
    private String phone;

    public int getId() { return id; }
    public String getName() { return name; }
    public String getUserName() { return username; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setUserName(String username) { this.username = username; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone(String phone) { this.phone = phone; }
}