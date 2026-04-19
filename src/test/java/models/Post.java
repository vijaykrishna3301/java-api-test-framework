package models;

public class Post {
    private String title;
    private String body;
    private int userId;
    private int id;

    public Post(String title, String body, int userId) {
        this.title = title;
        this.body = body;
        this.userId = userId;
    }

    public String getTitle() { return title; }
    public String getBody() { return body; }
    public int getUserId() { return userId; }
    public int getId() { return id; }

    public void setTitle(String title) { this.title = title; }
    public void setBody(String body) { this.body = body; }
    public void setUserId(int userId) { this.userId = userId; }
    public void setId(int id) { this.id = id; }
}