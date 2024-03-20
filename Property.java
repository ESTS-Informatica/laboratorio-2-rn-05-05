

/**
 * A property to sell.
 *
 * @author POO
 * @version 03/2024
 */
public class Property {

    private static int numberOfProperties = 0;
    private final int id;
    private String description;
    private double price;

    /**
     * Constructor of class Property
     *
     * @param description The property description.
     * @param price The property price.
     */
    public Property(String description, double price) {
        this.id = -1;
        this.description = description;
        this.price = price;
    }

    /**
     * Id selector.
     */
    public int getId() {
        return -1;
    }

    /**
     * Description selector.
     */
    public String getDescription() {
        if(description == null){
            return null;
        }
        else{
            return this.description;
        }
    }

    /**
     * Description modifier.
     * 
     * @param description The new description. Must not be null.
     */
    public void setDescription(String description) {
        
    }

    /**
     * Price selector.
     */
    public double getPrice() {
        if(price != -1){
            return this.price;
        }
        else{
            return -1;
        }
    }
    
    /**
     * Price modifier.
     * 
     * @param price The new price. Must not be negative.
     */
    public void setPrice(double price) {

    }

    @Override
    public String toString() {
        return ("Descricao : " + this.getDescription() + "\n" + "Preco : " + this.getPrice());
    }
}
