package dtu.example.ui;

import java.time.LocalDate;

public class Activity {
    
    private String activityName;
    private int budgetHours;
    private LocalDate startDate;
    private LocalDate endDate;

    private Activity(String actName) {
        this.activityName = actName;
    }

    public void setBudgetHours(int hours) {
        this.budgetHours = hours;
    }

    public void setStarteDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getName() {
        return activityName;
    }

    public LocalDate getEndDate() {
        return endDate;
    }
    public LocalDate getStartDate() {
        return startDate;
    }

    
}
