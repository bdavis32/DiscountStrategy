package discountstrategy;

/**
 *
 * @author Benjamin
 */
public class QtyPercentOffDiscount implements Discount {

    private double percentOff;
    private double minQty;

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.percentOff) ^ (Double.doubleToLongBits(this.percentOff) >>> 32));
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.minQty) ^ (Double.doubleToLongBits(this.minQty) >>> 32));
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
        final QtyPercentOffDiscount other = (QtyPercentOffDiscount) obj;
        if (Double.doubleToLongBits(this.percentOff) != Double.doubleToLongBits(other.percentOff)) {
            return false;
        }
        if (Double.doubleToLongBits(this.minQty) != Double.doubleToLongBits(other.minQty)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "QtyPercentOffDiscount{" + "percentOff=" + percentOff + ", minQty=" + minQty + '}';
    }

    
    public QtyPercentOffDiscount(double percentOff, double minQty) {
        setPercentOff(percentOff); //Call the setter methods instead of using the "this" keyword
        setMinQty(minQty);
    }

    @Override
    public final double getDiscountAmt(double unitCost, double quantity) {
//        //Sentinel value
//        double discountAmt = 0;
//        
//        if (quantity >= minQty) {
//            discountAmt = unitCost * quantity * percentOff;
//        }
//        return discountAmt;
        return (quantity >= minQty) ? (unitCost * quantity * percentOff) : 0;
    }

    public final double getPercentOff() {
        return percentOff;
    }

    public final void setPercentOff(double percentOff) {
        if (percentOff < 0) {
            // VALIDATION LOGIC IS REQUIRED!!!
            throw new IllegalArgumentException("Cannot pass in a negative percent");
        } else {
            this.percentOff = percentOff;
        }
    }

    public final double getMinQty() {
        return minQty;
    }

    public final void setMinQty(double minQty) {
        if (minQty < 0) {
            throw new IllegalArgumentException("Cannot pass in a negative value");
        } else {
            this.minQty = minQty;
        }
    }

}
