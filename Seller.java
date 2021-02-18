public class Seller extends Employee {
    private int salary;
    private int sales;
    private double payment;

    public Seller(String name, int salary, int sales){
        super(name);
        this.salary = salary;
        this.sales = sales;
        payment = salary+(sales*0.01);
    }

    public double getExpense(){
        return payment;
    }

    public String toString(){
        return getName() + " " + salary + " + " + "("+0.01 + " x " + sales+")" + " = " + (int)payment;
    }
    
}
