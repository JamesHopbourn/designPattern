package observerPattern;

import observerPattern.customer.CustomerA;
import observerPattern.customer.CustomerB;

public class SendNewspaper {
    public static void main(String[] args) {
        NewspaperOffice newspaperOffice = new NewspaperOffice();
        CustomerA customerA = new CustomerA();
        CustomerB customerB = new CustomerB();
        newspaperOffice.addCustomer(customerA);
        newspaperOffice.addCustomer(customerB);
        newspaperOffice.newspaper();
    }
}
