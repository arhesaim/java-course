package pr5;

import java.util.ArrayList;

public class Bank{
    private String name;
    private ArrayList<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void getCustomerHistory(Customer customer){
        System.out.println("name: " + customer.getName() + "\ttransactions done: " + customer.getTransactions());
    }

    public void setCustomer(Customer customer) {
        if (this.customers.contains(customer)){
            System.out.println("customer exists already");
        } else {
            this.customers.add(customer);
            System.out.println("new customer added");
        }
    }

    public void setTransaction (Customer customer, double transaction){
        customer.setTransaction(transaction);
    }

}
