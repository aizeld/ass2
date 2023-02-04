public class Student extends Person{
    protected double gpa;
    public Student(){
        super();
        super.position = "Student";
    }
    public Student(String name, String surname, double gpa){
        super(name, surname);
        super.position = "Student";
        this.gpa = gpa;
    }
    public void position(){
        super.position = position;
    }

    public String getposition(){
        return super.position;
    }
    public double getgpa(){
        return this.gpa;
    }
    @Override
    public String getinfo(){
        return "Student " + this.id + ". " + this.name + " "+ this.surname;
    }
    @Override
    public double getPaymentAmount(){
        if(this.gpa > 2.77) return 36600;
        else return 0;
    }
}
