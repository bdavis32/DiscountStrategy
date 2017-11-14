package discountstrategy;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.custId);
        hash = 89 * hash + Objects.hashCode(this.custName);
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
        final Customer other = (Customer) obj;
        if (!Objects.equals(this.custId, other.custId)) {
            return false;
        }
        if (!Objects.equals(this.custName, other.custName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Customer{" + "custId=" + custId + ", custName=" + custName + '}';
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
