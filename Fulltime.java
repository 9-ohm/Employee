public class Fulltime extends Employee {
    private int salary;
    
    public Fulltime(String name,int salary){
        super(name);
        this.salary = salary;
    }

    public double getExpense(){
        return salary;
    }
    public String toString(){
        return getName()+ " " + salary;
    }
}
