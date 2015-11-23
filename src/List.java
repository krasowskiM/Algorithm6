public class List {
    
    public Link firstLink;
    
    List(){
        
        firstLink = null;
        
    }
    
    public boolean isEmpty(){
        
        return (firstLink == null);
    }
    
    public void insertFirstLink(String name, int quantity){
        
        Link newLink = new Link(name, quantity);
        
        newLink.next = firstLink;
        firstLink = newLink;
        
    }
    
    public Link removeFirst() {
        Link linkReference = firstLink;
        
        if(!isEmpty()){
            firstLink = firstLink.next;
        } else {
            System.out.print("List is empty!");
        }
        return linkReference;
    }
    
    public void display(){
        
        Link theLink = firstLink;
        while(theLink != null){
            theLink.display();
            
            System.out.print("\nNext item: "+theLink.next);
            
            theLink = theLink.next;
            
            System.out.print("");
        }
    }
    
    public Link find(String name){
        Link theLink = firstLink;
        
        if(!isEmpty()){
            while(theLink.name != name){
                if(theLink.next == null){
                    return null;
                }
                else {
                    theLink = theLink.next;
                    
                }
            }
        }
        else {
            System.out.print("Empty list!");
        }
        return theLink;
    }
    
    public Link removeLink(String name){
        Link currentLink = firstLink;
        Link previousLink = firstLink;
        
        while(currentLink.name != name){
            if(currentLink.next == null){
                return null;
            }
            else {
                previousLink = currentLink;
                currentLink = currentLink.next;
            }
        }
        if(currentLink == firstLink){
            firstLink = firstLink.next;
        }
        else{
            previousLink.next = currentLink.next;
        }
        return currentLink;
    }
}






