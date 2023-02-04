import java.text.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Employee empl1 = new Employee("loh", "lohovic", "Lowest cas", 20000);
        Employee empl2 = new Employee("Best", "Of the BEST", "Supreme", 100000000);

        Student std1 = new Student("Asylkhan", "Ismailov", 4);
        Student std2 = new Student("Elon", "Musk", 3);

        ArrayList<Person> persons = new ArrayList<>();

        persons.add(empl1);
        persons.add(empl2);
        persons.add(std1);
        persons.add(std2);
        Collections.sort(persons);

        printData(persons);


    }

    public static void printData(Iterable<Person> persons){
        for(Person person: persons){
            System.out.println(person.getinfo());
            System.out.println("Earns: " + person.getPaymentAmount());
        }
    }
}