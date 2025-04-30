package dtu.example.ui;

import java.time.Year;

public class Project {
    private int projectID;
    private String projectName;

    public Project(String projectName, int projectID) {
        this.projectName = projectName;
        this.projectID = projectID;
    }

    public String getProjectName() {
        return projectName;
    }

    public int getProjectID() {
        return projectID;
    }
}
