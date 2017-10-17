package discountstrategy;

/**
 *
 * @author Benjamin
 */
public class NoDiscount implements Discount {

    @Override
    public final double getDiscountAmt(double unitCost, double quantity) {
        return 0;
    }

}
