package dtu.example.ui;

import java.time.Year;

public class Project {
    private int projectID;
    private String projectName;

    public Project(String projectName) {
        this.projectName = projectName;
        this.projectID = (Year.now().getValue()-2000)*1000+1;
        //while (projectID already exists) {
        //  projectID++;
        //}
    }

    public String getProjectName() {
        return projectName;
    }

    public int getProjectID() {
        return projectID;
    }
}
