package dtu.example.ui;

public class Login {
    private boolean loggedInFlag;

    private String text;

    public boolean loggedIn() {
        loggedInFlag = false;
        return loggedInFlag;
    }

    public boolean userLoggedIn(String username) {
        if (username.equals("huba")) {
            return true;
        }
        setText("Not Valid Credentials. Try Again.");
        return false;
    }

    public String setText(String string) {
        return text;
    }
}
