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

    public void setText(String string) {
        text = string;
    }

    public String getText() {
        return text;
    }
}
