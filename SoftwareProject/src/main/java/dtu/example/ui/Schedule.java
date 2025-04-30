package dtu.example.ui;

import java.util.ArrayList;

public class Schedule {
    private ArrayList<Project> projects = new ArrayList<>();
    private String respondText;

    public void addProject(Project project) {
        projects.add(project);
        changeRespondsText("added", project.getProjectName());
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
        respondText = "You " + string + " a Project: " + projectName;
    }

    public String getRespondText() {
        return respondText;
    }
}
