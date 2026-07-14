public class Test {

    static void main(String[] args) {
        //billCollector bc = new billCollector();

        /*----------------------------------
                SETTER INJECTION
        ----------------------------------*/

        //injecting esewa ko object into billCollector ko object
        /*bc.setPayment(new esewa());
        bc.pay(200.00);*/

        /*-----------------------------------
                CONSTRUCTOR INJECTION
        -----------------------------------*/
        billCollector bc2 = new billCollector(new esewa());
        bc2.pay(200.00);


    }
}
