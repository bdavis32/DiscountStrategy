package discountstrategy;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.prodId);
        hash = 41 * hash + Objects.hashCode(this.prodName);
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.unitCost) ^ (Double.doubleToLongBits(this.unitCost) >>> 32));
        hash = 41 * hash + Objects.hashCode(this.discount);
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
        final Product other = (Product) obj;
        if (Double.doubleToLongBits(this.unitCost) != Double.doubleToLongBits(other.unitCost)) {
            return false;
        }
        if (!Objects.equals(this.prodId, other.prodId)) {
            return false;
        }
        if (!Objects.equals(this.prodName, other.prodName)) {
            return false;
        }
        if (!Objects.equals(this.discount, other.discount)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Product{" + "prodId=" + prodId + ", prodName=" + prodName + ", unitCost=" + unitCost + ", discount=" + discount + '}';
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
