package dtu.example.ui;

import java.time.LocalDate;

public class Activity {
    
    private String activityName;
    private int budgetHours;
    private LocalDate startDate;
    private LocalDate endDate;

    public Activity(String actName, int budgetHours, LocalDate starDate, LocalDate endDate) {
        this.activityName = actName;
        this.budgetHours = budgetHours;
        this.startDate = starDate;
        this.endDate = endDate;
    }

    public void setBudgetHours(int hours) {
        this.budgetHours = hours;
    }

    public int getBudgetHours() {
        return budgetHours;
    }

    public void setStartDate(LocalDate startDate) {
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
