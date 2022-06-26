import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Rayan Slim","Canadian", "01/01/1111",5);
        if (person.applyPassport() == true){
            person.setPassport();
        }

        System.out.print("Name: " + person.getName() + "\n" +
                "Nationality: " + person.getNationality() + "\n" +
                "Date of birth: " + person.getDateOfBirth() + "\n" +
                "Seat Number: " + person.getSeatNumber() + "\n" +
                "Passport: " + Arrays.toString(person.getPassport()) + "\n");

/*
        System.out.println("\n" +"Name: " + person2.getName() + "\n" +
                "Nationality: " + person2.getNationality() + "\n" +
                "Date of birth: " + person2.getDateOfBirth() + "\n" +
                "Seat Number: " + person2.getSeatNumber());
    */
    }
}
