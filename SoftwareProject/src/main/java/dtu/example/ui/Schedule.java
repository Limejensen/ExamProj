package dtu.example.ui;

import java.time.Year;
import java.util.ArrayList;

public class Schedule {
    private ArrayList<Project> projects = new ArrayList<>();
    private String respondText;

    public void addProject(Project project) {
        projects.add(project);
        changeRespondsText("added", project.getProjectName());
    }

    public Project createProject(String projectName) {
        int projectID = (Year.now().getValue()-2000)*1000+1;

        for (int i = 0; i < projects.size(); i++) {
            if (projects.get(i).getProjectID() == projectID) {
                projectID++;
            }
        }
        Project project = new Project(projectName, projectID);
        return project;
    }

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public boolean projectExists(String string) {
        for (int i = 0; i < projects.size(); i++) {
            if (projects.get(i).getProjectName().equals(string)) {
                return true;
            }
        }
        return false;
    }

    public boolean removeProject(String removedProject) {
        for (int i = 0; i < projects.size(); i++) {
            if (projects.get(i).getProjectName().equals(removedProject)) {
                projects.remove(projects.get(i));
                changeRespondsText("removed", removedProject);
                return true;
            }
        }
        return false;
    }

    public void changeRespondsText(String string, String projectName) {
        //you added/removed a project: (the given projectName)
        respondText = "You " + string + " a Project: " + projectName;
    }

    public String getRespondText() {
        return respondText;
    }
}
