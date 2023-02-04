import java.util.concurrent.ConcurrentMap;

public class Person implements Payable, Comparable<Person> {
    protected static int next_id = 0;
    protected int id;
    protected String name, surname, position;

    public Person(){
     this.id = next_id++;
    }
    public Person(String name, String surname){
        this.id = next_id++;
        this.name = name;
        this.surname = surname;
    }
        //setters
    public void setname(String name){
        this.name = name;
    }

    public void setsurname(String surname){
        this.surname = surname;
    }
    //getters

    public String getname(){
        return this.name;
    }
    public String getsurname(){
        return this.surname;
    }
    public int getid(){
        return this.id;
    }

    @Override
    public double getPaymentAmount(){
        return 0;
    }

    public String getinfo(){
        return this.id + ". " + this.name + " "+ this.surname;
    }

    @Override
    public int compareTo(Person second) {
        return Double.compare(getPaymentAmount(), second.getPaymentAmount());
    }
}
