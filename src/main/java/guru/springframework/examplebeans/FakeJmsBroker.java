package guru.springframework.examplebeans;

public class FakeJmsBroker {
    private String username;
    private String password;
    private String dburl;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDburl() {
        return dburl;
    }

    public void setDburl(String dburl) {
        this.dburl = dburl;
    }

    @Override
    public String toString() {
        return "FakeJmsBroker{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", dburl='" + dburl + '\'' +
                '}';
    }
}
