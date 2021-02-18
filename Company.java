import java.util.ArrayList;

public class Company{
    private String title;
    private int TotalExpens;
    private ArrayList<Employee> employees;

    public Company(String title){
        this.title = title;
        TotalExpens = 0;
        employees = new ArrayList<Employee>();
    }

    public String getTitle(){
        return title;
    }

    public void addEmployee(Employee e){
        employees.add(e);
    }

    public double getTotalExpense(){
        for(Employee e : employees){
        TotalExpens += e.getExpense();
        }
        return (int)TotalExpens;
    }

    public void print(){
        for(Employee e : employees){
            System.out.println(e.toString());
            
        }
        System.out.println(title + " = " + (int)getTotalExpense());
    }
}