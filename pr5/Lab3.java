package pr5;

public class Lab3 {
    public static void main(String[] args){
        Customer customer = new Customer("john");
        Customer customer1 = new Customer("mike");
        Customer customer2 = new Customer("cady");
        Bank bank = new Bank("Barklays");

        bank.setCustomer(customer);
        bank.setCustomer(customer);//not adding, because already in the list
        bank.setCustomer(customer1);
        bank.setCustomer(customer2);

        ///////////////////////////////////////////////////////

        bank.setTransaction(customer, 500);//autoboxing, adding transaction to an existing customer
        bank.setTransaction(customer, -600);
        bank.setTransaction(customer, 40);

        bank.getCustomerHistory(customer);//unboxing?, customer name and transactions amount
    }
}

