package JPQL.EmployeeQuery.Entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("trainee_emp")
public class TraineeEmployee extends Employee{
    private String project;

    public TraineeEmployee() {
    }

    public TraineeEmployee(String project) {
        this.project = project;
    }

    public TraineeEmployee(int id, String firstName, String lastName, int salary, int age, String project) {
        super(id, firstName, lastName, salary, age);
        this.project = project;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }
}
