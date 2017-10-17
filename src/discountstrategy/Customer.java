package discountstrategy;

/**
 *
 * @author Benjamin
 */
public class Customer {
    private String custId;
    private String custName;

    public Customer(String custId, String custName) {
        setCustId(custId);
        setCustName(custName);
    }

    
    public final String getCustId() {
        return custId;
    }

    public final void setCustId(String custId) {
        this.custId = custId;
    }

    public final String getCustName() {
        return custName;
    }

    public final void setCustName(String custName) {
        this.custName = custName;
    }
    
    
}
