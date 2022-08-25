public class Person implements Cloneable{

    private int id;
    private String name;
    private int age;
    private String occupation;

    private String firstName;

    private String lastName;


    // Constructor
    public Person(int id, int age,  String firstName, String lastName, String occupation) throws PersonAgeException {
        this.id = id;
        setName(firstName + " " + lastName);
        setAge(age);
        this.occupation = occupation;
    }


    // GETTERS & SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws PersonAgeException {
        if (age < 0) {
            throw new PersonAgeException("You can't be younger than 0 years");
        } else {
            this.age = age;
        }
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName)  throws NameException{
        if (firstName.length() < 0) {
            throw new NameException("Your first name is missing");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws NameException {
        if (lastName == null) {
            throw new NameException("Your first name is missing");
        }
            this.lastName = lastName;
    }





    // To string
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", occupation='" + occupation + '\'' +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Person cloned = (Person) super.clone();
        cloned.setId(getId() + 1);

        //-- Other fields to be altered, copying composite objects if any

        return cloned;
    }

}
