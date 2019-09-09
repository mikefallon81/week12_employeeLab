package staff;

public abstract class Employee {



    private String name;
    private String ni;
    private double salary;

    public Employee(String name, String ni, double salary){
        this.name = name;
        this.ni = ni;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public String getNi() {
        return ni;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double amount){
        if (amount > 0) {
            this.salary = getSalary() + amount;
        }
        }

    public double payBonus(){
        return getSalary() * 0.01;
    }

    public void setName(String name) {
        if (name.length() > 0) {
            this.name = name;
        }
        }



}
