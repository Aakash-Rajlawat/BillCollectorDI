
public class billCollector {

    private Ipayment payment;

    public billCollector(Ipayment payment) {
        this.payment = payment;
    }
    /*public void setPayment(Ipayment payment) {
    this.payment = payment;
    }*/

    public void pay(double amount) {
       String status = payment.pay(amount);
        System.out.println(status);
    }

}