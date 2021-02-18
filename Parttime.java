public class Parttime extends Employee {
    private int workhour;
    private int paymentperhour;
    private int payment;

    public Parttime(String name, int paymentperhour, int workhour){
        super(name);
        this.workhour = workhour;
        this.paymentperhour = paymentperhour;
        payment = workhour*paymentperhour;
    }
    
    public double getExpense(){
        return payment;
    }
    public String toString(){
        return  getName() + " " + paymentperhour + " X " + workhour + " = " + payment ;
    }
}
