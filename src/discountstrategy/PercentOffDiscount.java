package discountstrategy;

/**
 * 
 * @author Benjamin
 */
public class PercentOffDiscount implements Discount {
    private double percentOff;

    public PercentOffDiscount(double percentOff) {
        setPercentOff(percentOff);
    }
    
    @Override
    public final double getDiscountAmt(double unitCost, double quantity){
        return unitCost * quantity * percentOff;
    }

    public final double getPercentOff() {
        return percentOff;
    }

    public final/* CONCRETE METHODS MUST BE DECLARED FINAL!!! */ void setPercentOff(double percentOff) {
        if(percentOff < 0){
            // VALIDATION LOGIC IS REQUIRED!!!
            throw new IllegalArgumentException("Cannot pass in a negative percent");
        } else {
            this.percentOff = percentOff;
        }
    }
 
//    //Test this class with a main method
//    public static void main(String[] args) {
//        PercentOffDiscount discount = new PercentOffDiscount(.1);
//        double amt = discount.getDiscountAmt(20,2);
//        System.out.println("Discount should be $4\nDiscount is: " + amt);
//    }
}
