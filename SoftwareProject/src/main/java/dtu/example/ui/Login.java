package dtu.example.ui;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    private boolean loggedInFlag;
    private ArrayList<String> users =  new ArrayList<>();
    private String usersDatabase = "src/main/java/dtu/example/ui/db/users.csv";
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
        line = line.replace("\"", "");
        String[] parts = line.split(",");
        
        if (parts.length >= 2) {
            String username = parts[0].trim();
            //String password = parts[1].trim();
            users.add(username);
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


    /*
    //Creates a set out of the userlist file. This has O(1) lookup so it should be ideal.
    private Set<String> users;
    private final String usersFilepath = "/userdata/userlist.txt"; //Modify this as needed when we create a file for this.


    //While one might be tempted to turn this into a singleton as well, remember that it is only created through the LoginScreenController
    //Since that class is a singleton, this effectively becomes one as well. (Not entirely true, but you get the gist of it)
    public LoginController() {
        users = new HashSet<>();

        //Implement the below code once a txt file containing users has been implemented with appropriate rankings and such.
        //loadUsers();
    }

    //The rest of the code should be self-explanatory, besides the comment for the createUser-method.
    */


    /*
    //THIS WILL NOT WORK WHEN THE PROGRAM IS TURNED INTO A JAR. REWRITE TO CREATE AN EXTERNAL TXT FILE IN THE JAR FOLDER. (If applicable :3)
    public boolean createUser(String username) throws Exception {
        username = username.trim();
        if (users.contains(username)) {
            throw new Exception("User already exists.");
        } else if (username.isEmpty()) {
            throw new Exception("Username is blank.");
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(usersFilepath, true))) {
            bw.write(username);
            bw.newLine();
            users.add(username);
            return true;
        } catch (IOException e) {
            System.out.println("Error creating new user.");
            return false;
        }
    }

    */
    private void validateUsersfile() {
        File file = new File(usersDatabase);
        if (!file.exists()) {
            try {
                file.createNewFile(); // Create file if not exists
            } catch (IOException e) {
                System.out.println("Unable to create new userdata file.");
                e.printStackTrace();
            }
        }
    }
    

    public boolean validate(String username) {
        return users.contains(username.trim());
    }






}
