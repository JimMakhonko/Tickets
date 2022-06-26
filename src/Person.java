import java.util.Arrays;
import java.util.Random;

public class Person {
    private String name;
    private String nationality;
    private String[] passport;
    private String dateOfBirth;
    int seatNumber;

    public Person(String name, String nationality, String dateOfBirth, int seatNumber) {
        this.name = name;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.seatNumber = seatNumber;
        this.passport = new String[3];
    }

    public Person(Person source) {
        this.name = source.name;
        this.nationality = source.nationality;
        this.dateOfBirth = source.dateOfBirth;
        this.seatNumber = source.seatNumber;
        this.passport = Arrays.copyOf(source.passport, source.passport.length);
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public String[] getPassport() {
        return Arrays.copyOf(passport, passport.length);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setPassport() {
        this.passport = new String[]{this.name, this.nationality, this.dateOfBirth};
    }

    /**
     * FUnction name: applyPassport
     *
     * @return (boolean)
     * Inside the function:
     * 1.Returns a random boolean of true or false
     */
    public boolean applyPassport() {
        Random rand = new Random();
        int number = rand.nextInt(1, 12);
        return number != 0;
    }

    /**
     * Function name: chooseSeat
     * <p>
     * Inside the function :
     * 1.Sets this.seat to a random number between 1 --11
     */
    public void chooseSeat() {
        Random rand = new Random();
        this.setSeatNumber(rand.nextInt(1, 12));
    }


}
