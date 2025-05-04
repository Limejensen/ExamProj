package dtu.example.ui;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    private boolean loggedInFlag;
    private ArrayList<String> users =  new ArrayList<>();
    private String text;

    public void loadUsers() {
        try (Scanner scanner = new Scanner(new File("src/main/java/dtu/example/ui/db/users.csv"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                processLine(line);
            }
        } catch (FileNotFoundException e) {
            System.err.println("User database file not found: " + e.getMessage());
        }
    }

    private void processLine(String line) {
        // Remove quotes and split by comma
        line = line.replace("\"", "");
        String[] parts = line.split(",");
        
        if (parts.length >= 2) {
            String username = parts[0].trim();
            //String password = parts[1].trim();
            users.add(username);
            //users.add(username + "," + password);
        }
    }

    public boolean loggedIn() {
        loggedInFlag = false;
        return loggedInFlag;
    }

    public boolean userLoggedIn(String username) {
        //Navngivning af metoden her stinker, der menes "Findes brugeren der forsøges at logges ind på"
        if (users.contains(username)) {
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
