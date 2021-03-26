package lab2;

public class Adress {

    String street;
    String city;
    int number;

    public Adress(String street, String city, int number) {
        this.street = street;
        this.city = city;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Adress --> " + "Street: " + street + ", City:" + city + ", Number: " + number;
    }

    public String getstreet() {
        return "Street name: " + street;
    }

    public String getcity() {
        return "City: " + city;
    }

    public String getnumber() {
        return "Number: " + number;
    }

    public String getFullAdress() {
        return "Full adress -> Street name: " + street + ", City: " + city + ",  Number: " + number;
    }
}
