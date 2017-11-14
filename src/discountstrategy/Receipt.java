package discountstrategy;

/**
 *
 * @author Benjamin
 */
public class Receipt {
    private Customer customer;
    private LineItem lineItem;

    public final Customer getCustomer() {
        return customer;
    }

    public final void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public final LineItem getLineItem() {
        return lineItem;
    }

    public final void setLineItem(LineItem lineItem) {
        this.lineItem = lineItem;
    }
    
    
}
