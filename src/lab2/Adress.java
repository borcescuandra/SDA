package lab2;

public class Adress {

    private String street;
    private String city;
    private int number;

    public Adress(String street, String city, int number) {
        this.street = street;
        this.city = city;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Adress --> " + "Street: " + street + ", City:" + city + ", Number: " + number;
    }

    public String getStreet() {
        return "Street name: " + street;
    }

    public String getCity() {
        return "City: " + city;
    }

    public String getNumber() {
        return "Number: " + number;
    }

    public String getFullAdress() {
        return "Full adress -> Street name: " + street + ", City: " + city + ",  Number: " + number;
    }
}
