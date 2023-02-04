public class Employee extends Person{
    public Employee(){
        super();
        super.position = "Employee";
    }
    protected double salary;

    public Employee(String name, String surname, String position, double salary){
        super(name, surname);
        this.salary = salary;
        super.position = position;

    }

    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public String getposition(){
        return position;
    }

    public String getinfo(){
        return super.position + " " + super.id + " " + super.name + " " + super.surname;
    }

    @Override
    public double getPaymentAmount(){
        return salary;
    }
}
