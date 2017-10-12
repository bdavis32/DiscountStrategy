package discountstrategy;

/**
 *
 * @author Benjamin
 */
public class LineItem {
    private Product product;
    private double extCost;

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
