package discountstrategy;

/**
 *
 * @author Benjamin
 */
public class Product {
    private String prodId, prodName;
    private double unitCost;
    private Discount discount;

    public Product(String prodId, String prodName, double unitCost, Discount discount) {
        setProdId(prodId);
        setProdName(prodName);
        setUnitCost(unitCost);
        setDiscount(discount);
    }

    public final double getDiscountAmt(double qty){
        return discount.getDiscountAmt(unitCost, qty);
    }
    
    public final String getProdId() {
        return prodId;
    }

    public final void setProdId(String prodId) {
        if(prodId == null || prodId.isEmpty() || prodId.length() == 0){
            throw new IllegalArgumentException("Cannot have an empty string.");
        }
        this.prodId = prodId;
    }

    public final String getProdName() {
        return prodName;
    }

    public final void setProdName(String prodName) {
        if(prodName == null || prodName.isEmpty() || prodName.length() == 0){
            throw new IllegalArgumentException("Cannot have an empty prodName.");
        }
        this.prodName = prodName;
    }

    public final double getUnitCost() {
        return unitCost;
    }

    public final void setUnitCost(double unitCost) {
        if(unitCost <= 0){
            throw new IllegalArgumentException("Cannot have a zero or negative unitCost");
        }        
        this.unitCost = unitCost;
    }

    public final Discount getDiscount() {
        return discount;
    }

    public final void setDiscount(Discount discount) {
        if(discount == null){
            throw new IllegalArgumentException("Cannot have a null discount.");
        }
        this.discount = discount;
    }
    
    
}
