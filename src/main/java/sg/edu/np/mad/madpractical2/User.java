package sg.edu.np.mad.madpractical2;

public class User {
    public String name;
    public  String description;
    public  int id;
    public  boolean followed;

    public User(String name, String description, int id, boolean followed) {
        this.name = name;
        this.description = description;
        this.id = id;
        this.followed = false; // By default, user is not followed
    }

    public void follow() {
        this.followed = true;
    }

    public void unfollow() {
        this.followed = false;
    }

    // Getters and setters for name, description, id, and followed
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isFollowed() {
        return followed;
    }

    public void setFollowed(boolean followed) {
        this.followed = followed;
    }
}

