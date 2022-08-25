import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class PersonList {
    private static final ArrayList<Person> personArrayList = new ArrayList();


    public static void main(String[] args) throws PersonAgeException, CloneNotSupportedException, NameException {
        initArray();
        System.out.println(personArrayList);
        System.out.println(findByName("matias perez"));
    }

    private static void initArray() throws PersonAgeException, CloneNotSupportedException, NameException {

        Person matias = new Person(3123, 23, "matias", "perez", "doctor");
        Person maria = new Person(3127, 25, "maria", "martinez", "nurse");

        Person armando = (Person) matias.clone();

        personArrayList.add(matias);
        personArrayList.add(maria);
        personArrayList.add(armando);



    }

    // private static ArrayList<Person> personArrayList = new ArrayList<>();

     /* public PersonList() throws PersonAgeException {
        personArrayList = new ArrayList<>();
    }

    public void add(Person person){
        personArrayList.add(person);
    }*/


    public static Person findByName(String nameSearched) {
        for (Person personResult : personArrayList) {
            // Person result = new Person();
            if (personResult.getName().equals(nameSearched)) {
                return personResult;
            }
        }
        return null;
    }


}




