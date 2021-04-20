package lab2;

public class Customer {

    private String FirstName;
    private String LastName;
    private int age;
    private Adress adress;
    private PaymentMethod payment;

    public Customer(String FirstName, String LastName, int age) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.age = age;
    }

    public Customer(String FirstName, String LastName, int age, Adress adress, PaymentMethod payment) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.age = age;
        this.adress = adress;
        this.payment = payment;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public int getAge() {
        return age;
    }

    public String getCompleteName() {
        return "Full name: " + FirstName + "" + LastName;
    }

    public PaymentMethod getPaymentMethod() {
        return payment;
    }

    public Adress getAdress() {
        return adress;
    }
}
