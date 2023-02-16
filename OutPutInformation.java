

package hillel;

        import java.lang.String;

public class OutPutInformation {
    public static void main(String[] args) {
        Person person1 = new Person("Will", "Smith", "New York", "2936729462846");


        Person person2 = new Person("Jackie", "Chan", " Shanghai", "12312412412");


        Person person3 = new Person("Sherlock", "Holmes", "London", "37742123513");


        System.out.println(person1.personInfo());
        System.out.println(person2.personInfo());
        System.out.println(person3.personInfo());


    }
}

class Person {
    private String name;
    private String firstName;
    private String city;
    private String number;

    public Person(String name, String firstName, String city, String number) {
        this.name = name;
        this.firstName = firstName;
        this.city = city;
        this.number = number;
    }

    public String personInfo() {

        return "Зателефонувати громадянину  " + this.name + this.firstName + " із міста  " + this.city + " можна за телефоном " + this.number;
    }

}
