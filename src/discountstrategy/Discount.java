package discountstrategy;

/**
 *
 * @author Benjamin
 */
public interface Discount {

    public abstract double getDiscountAmt(double unitCost, double quantity);
    
}
