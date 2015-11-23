
import java.util.*;


public class Algorithm6 {
    
       private static void switcher(int input){ 
        
        List list = new List();
        
        while (input != 0) {
        switch (input) {
            
            case 0:
                String name;
                int quantity;
                System.out.print("Please put in the name of the item: \n");
                Scanner input1 = new Scanner(System.in);
                name = input1.nextLine();
                System.out.print("Put in the quantity of the items: \n");
                Scanner input2 = new Scanner(System.in);
                quantity = input2.nextInt();                
                list.insertFirstLink(name, quantity);
                break;
                
            case 1:
                System.out.print("Here's your list: \n");
                list.display();
                break;
            
            case 2:
                System.out.print("Which item you would like to remove?\n");
                Scanner input3 = new Scanner(System.in);
                name = input3.nextLine();
                list.removeLink(name);
                break;
            
            case 3:
                System.out.print("Which item are you searching for?");
                Scanner input4 = new Scanner(System.in);
                name = input4.nextLine();
                list.find(name);
                break;
            
            case 4:
                list.removeFirst();
                System.out.print("First item from the list removed.");
                break;
            }
        }
    }        
       

    
    public static void main(String[] args) {
       
        System.out.print("Welcome to your virtual storage! Please choose the operation you would like to perform.\n"
                + "List of operations:\n"
                + "-create next item(creates new items in the list)\n"
                + "-display(displays the full content of the list)\n"
                + "-remove item(removes item from the list)\n"
                + "-remove first item from the list\n"
                + "-find item(finds item on the list)\n");
        int input;
        Scanner inNew = new Scanner(System.in);
        input = inNew.nextInt();
        switcher(input);
    }
    
}
