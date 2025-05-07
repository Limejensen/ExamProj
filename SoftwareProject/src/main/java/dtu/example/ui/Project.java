package dtu.example.ui;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Project {
    private int projectID;
    private String projectName;
    private ArrayList<Activity> activities =  new ArrayList<>();
    private String projectLeaderName;
    Map<String, Integer> developerActivityHashmap; 

    public Project(String projectName, int projectID) {
        this.projectName = projectName;
        this.projectID = projectID;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getProjectLeader() {
        return projectLeaderName;
    }

    public void setProjectLeader(String projectLeaderName) {
        this.projectLeaderName = projectLeaderName;
    }

    public int getProjectID() {
        return projectID;
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public ArrayList<Activity> getActivities() {
        return activities;
    }


    public Map<String, Integer> getDeveloperActivityLoadForInterval(LocalDate searchStartDate, LocalDate searchEndDate) {
        developerActivityHashmap = new HashMap<>();
        
        // loop all activities
        for(Activity activity : activities) {
            // filter out activites that end before the searchStartDate and finish start after the searchEndDate
            if (activity.getStartDate().isAfter(searchEndDate) || activity.getEndDate().isBefore(searchEndDate)) {
                continue;
            }
            // add devlopers to hashmap
            for (String developer : activity.getDevelopersAssignedToActivity()) {
                int count = 0;
                if (developerActivityHashmap.containsKey(developer)) {
                    count = developerActivityHashmap.get(developer);
                }
                count++;
                developerActivityHashmap.put(developer, count);
            }
        }
        return developerActivityHashmap;
    }
}
