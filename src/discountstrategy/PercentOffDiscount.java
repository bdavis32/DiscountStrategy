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
public class PercentOffDiscount implements Discount {
    private double percentOff;
    private double unitCost;
    private double quantity;

    public PercentOffDiscount(double percentOff) {
        this.percentOff = percentOff;
    }
    
    
    
    @Override
    public final/* REMEMBER TO DECLARE CONCRETE METHODS FINAL!!! */ double getDiscountAmount(double unitCost, double quantity){
        return unitCost * quantity * percentOff;
    }

    public final double getPercentOff() {
        return percentOff;
    }

    public final void setPercentOff(double percentOff) {
        if(percentOff < 0){
            /* VALIDATION LOGIC IS REQUIRED!!! */
            throw new IllegalArgumentException("Cannot pass in a negative percent");
        }
        this.percentOff = percentOff;
    }
 
//    //Test this class with a main method
//    public static void main(String[] args) {
//        PercentOffDiscount discount = new PercentOffDiscount(.1);
//        double amt = discount.getDiscountAmount(20,2);
//        System.out.println("Discount should be $4\nDiscount is: " + amt);
//    }
}
