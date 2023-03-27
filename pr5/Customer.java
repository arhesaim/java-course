package pr5;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name) {
        this.name = name;
        this.transactions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public double getTransactions() {
        return transactions.size();
    }

    public void setTransaction(double transaction) {
        this.transactions.add(transaction);
        if (transaction > 0){
            System.out.println("new credit transaction saved");
        } else if (transaction < 0){
            System.out.println("new debit transaction saved");
        }
    }
}
