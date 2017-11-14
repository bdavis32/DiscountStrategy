package discountstrategy;

import java.util.Objects;

/**
 *
 * @author Benjamin
 */
public class LineItem {
    private Product product;
    private double extCost;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.product);
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.extCost) ^ (Double.doubleToLongBits(this.extCost) >>> 32));
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
        final LineItem other = (LineItem) obj;
        if (Double.doubleToLongBits(this.extCost) != Double.doubleToLongBits(other.extCost)) {
            return false;
        }
        if (!Objects.equals(this.product, other.product)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LineItem{" + "product=" + product + ", extCost=" + extCost + '}';
    }

    
    public final Product getProduct() {
        return product;
    }
    
    public final String getProdId(){
        return product.getProdId();
    }
    
    public final void setProduct(Product product) {
        if(product == null){
            throw new IllegalArgumentException("Cannot have a null product.");
        }
        this.product = product;
    }

    public final double getExtCost() {
        return extCost;
    }

    public final void setExtCost(double extCost) {
        if(extCost <= 0){
            throw new IllegalArgumentException("Cannot have an extCost of 0 or negative.");
        }
        
        this.extCost = extCost;
    }

    
}
