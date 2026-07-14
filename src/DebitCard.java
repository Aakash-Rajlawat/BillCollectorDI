public class DebitCard implements Ipayment{

    @Override
    public String pay(double amount) {
        return "Payment successful with DebitCard";
    }
}
