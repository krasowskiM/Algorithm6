
/**
 *
 * @author Maciek
 */
public class Link {
    
    public String name;
    public int quantity;
    
    public Link next;
    
    public Link(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }
    
    public void display(){
        System.out.println("Item: "+name+" "+"Quantity: "+quantity+"\n");
        
    }
    
    @Override
    public String toString(){
        
        return name;
    }
}
