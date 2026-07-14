public class CreditCard implements Ipayment{

    @Override
    public String pay(double amount) {

        //PaymentLogic
        return "Payment successful with credit card.";
    }
}
