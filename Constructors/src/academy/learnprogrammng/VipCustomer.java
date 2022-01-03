package academy.learnprogrammng;

public class VipCustomer {

    private String customerName;
    private int creditLimit;
    private String customerEmail;

    public VipCustomer() {
        this("Defaul name", 1000, "default@email.com");
        System.out.println("Empty constructor called.");
    }

    public VipCustomer(String customerName, String customerEmail) {
        this(customerName, 1000, customerEmail);
    }

    public VipCustomer(String customerName, int creditLimit, String customerEmail) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.customerEmail = customerEmail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
}
