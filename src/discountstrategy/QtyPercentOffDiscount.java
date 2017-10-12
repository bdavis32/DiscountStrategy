/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author Benjamin
 */
public class QtyPercentOffDiscount implements Discount {

    private double percentOff;
    private double minQty;

    public QtyPercentOffDiscount(double percentOff, double minQty) {
        setPercentOff(percentOff);
        setMinQty(minQty);
    }

    @Override
    public final double getDiscountAmt(double unitCost, double quantity) {
        //Sentinel value
        double discountAmt = 0;
        
        if (quantity >= minQty) {
            discountAmt = unitCost * quantity * percentOff;
        }
        return discountAmt;
//        return (quantity >= minQty) ? (unitCost * quantity * percentOff) : 0;
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
