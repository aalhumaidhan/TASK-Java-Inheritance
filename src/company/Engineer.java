package company;

import java.util.Arrays;

public class Engineer extends Employee {
    private String[] skills;
    public Engineer(String name, String department, double salary, String[] skills) {
        super(name, department, salary);
        this.skills = skills;
    }

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return super.toString() + ", Skills: " + Arrays.toString(skills);
    }
}
