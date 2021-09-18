package de.exxcellent.challenge;

import com.opencsv.bean.CsvBindByName;

public class FootballData {

    @CsvBindByName(column = "Team")
    private String teamName;

    @CsvBindByName(column = "Goals")
    private String goals;

    @CsvBindByName(column = "Goals Allowed")
    private String goalsAllowed;

    public Double calculateDef () {
        return Math.abs(Double.parseDouble(this.goals) - Double.parseDouble(this.goalsAllowed));
    }






    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getGoals() {
        return goals;
    }

    public void setGoals(String goals) {
        this.goals = goals;
    }

    public String getGoalsAllowed() {
        return goalsAllowed;
    }

    public void setGoalsAllowed(String goalsAllowed) {
        this.goalsAllowed = goalsAllowed;
    }
}
