package discountstrategy;

import java.util.Arrays;

/**
 *
 * @author Benjamin
 */
public class InMemoryDatabase implements ReceiptDataAccessStrategy{
    private Customer[] customers = {
        new Customer("100", "John Smith"),
        new Customer("200", "Sally Jones"),
        new Customer("300", "Bob Clementi")
    };
    
    private Product[] products = {
        new Product("A101", "MLB Brewer's Hat ", 19.95, new PercentOffDiscount(0.15)),
        new Product("B205", "Men's Dress Shirt", 35.50, new PercentOffDiscount(0.15)),
        new Product("C222", "Women's Socks    ", 9.50, new NoDiscount())
    };

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Arrays.deepHashCode(this.customers);
        hash = 97 * hash + Arrays.deepHashCode(this.products);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InMemoryDatabase other = (InMemoryDatabase) obj;
        if (!Arrays.deepEquals(this.customers, other.customers)) {
            return false;
        }
        if (!Arrays.deepEquals(this.products, other.products)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InMemoryDatabase{" + "customers=" + customers + ", products=" + products + '}';
    }
    
    
    /**
     * Tries to find a Customer by customer id.
     * @param custId - must not be null or empty
     * @return found Customer or null if not found or bad argument
     */
    @Override
    public final Customer findCustomer(final String custId) {
        if(custId == null || custId.length() == 0) {
            System.out.println("Sorry, FakeDatabase.findCustomer method has "
                    + "illegal argument");
            return null;
        }
        
        Customer customer = null;
        for(Customer c : customers) {
            if(custId.equals(c.getCustId())) {
                customer = c;
                break;
            }
        }
        
        return customer;
    }
    
    
    /**
     * Tries to find a Product by product id.
     * @param prodId - must not be null or empty
     * @return found Product or null if not found or bad argument
     */
    @Override
    public final Product findProduct(final String prodId) {
        if(prodId == null || prodId.length() == 0) {
            System.out.println("Sorry, FakeDatabase.findProduct method has "
                    + "illegal argument");
            return null;
        }
        
        Product product = null;
        for(Product p : products) {
            if(prodId.equals(p.getProdId())) {
                product = p;
                break;
            }
        }
        
        return product;
    }
}
