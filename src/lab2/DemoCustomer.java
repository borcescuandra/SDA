package lab2;

public class DemoCustomer {

    public static void main(String[] args) {

        Adress adress = new Adress("Republicii", "Brasov", 10);
        PaymentMethod pm = new PaymentMethod("Credit Card");
        Customer customer1 = new Customer( "Andra", " Borcescu", 21, adress, pm);

        System.out.println();


        System.out.println(customer1.getCompleteName());
        System.out.println(customer1.getAdress().getFullAdress());
        System.out.println(customer1.getAdress().getNumber());
        System.out.println(customer1.getAdress().getCity());
        System.out.println(customer1.getPaymentMethod().getType());


    }
}