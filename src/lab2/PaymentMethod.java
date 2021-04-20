package lab2;

public class PaymentMethod {
    String type;

    public PaymentMethod(String type) {
        this.type = type;
    }

    public String getType() {
        return "Payment type: " + type;
    }
}
