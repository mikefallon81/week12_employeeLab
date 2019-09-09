package staff.management;

public class Director extends Manager {



    private double budget;

    public Director(String name, String ni, double salary, String departmentName, double budget){
        super(name, ni, salary, departmentName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    @Override
    public double payBonus(){
        return getSalary() * 0.02;
    }
}
