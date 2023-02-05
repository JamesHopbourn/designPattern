package observerPattern;

import observerPattern.customer.Customer;

import java.util.ArrayList;
import java.util.List;

public class NewspaperOffice {
    private List<Customer> customerList = new ArrayList<>();

    public void addCustomer(Customer customer){
        customerList.add(customer);
    }

    public void notificationAllCustomer(){
        customerList.forEach(customer -> customer.update());
    }

    public void newspaper(){
        this.notificationAllCustomer();
    }
}
