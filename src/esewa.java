public class esewa implements Ipayment{
    @Override
    public String pay(double amount) {

        return "Payment successful with esewa rs."+ amount ;
    }
}
