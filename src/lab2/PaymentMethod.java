package lab2;

public class PaymentMethod {
    String type;

    public PaymentMethod(String type) {
        this.type = type;

    }

    @Override
    public String toString() {
        return "PaymentMethod: "  + type;
    }

    public String gettype() {
        return "Type: " + type;
    }
}
