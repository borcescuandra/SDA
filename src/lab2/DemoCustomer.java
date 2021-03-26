package lab2;

public class DemoCustomer {

    public static void main(String[] args) {

        Adress adress = new Adress("Republicii", " Brasov", 10);
        PaymentMethod pm = new PaymentMethod("Card");
        Customer customer1 = new Customer( "Andra", " Borcescu", 21, adress, pm);
        System.out.println(customer1);

        System.out.println();

        System.out.println(customer1.getPaymentMethod().gettype());
        System.out.println(customer1.getCompleteName());
        System.out.println(customer1.getAdress().getnumber());
        System.out.println(customer1.getAdress().getFullAdress());
        System.out.println(customer1.getAdress().getcity());
        System.out.println(customer1.getAdress());

    }
}