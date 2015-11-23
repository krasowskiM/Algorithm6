
import java.util.*;


public class Algorithm6 {
    
       private static void switcher(List list, int input){ 
        
        
              
        switch (input) {
            
            case 1:
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
                
            case 2:
                System.out.print("Here's your list: \n");
                list.display();
                break;
            
            case 3:
                System.out.print("Which item you would like to remove?\n");
                Scanner input3 = new Scanner(System.in);
                name = input3.nextLine();
                list.removeLink(name);
                break;
            
            case 4:
                System.out.print("Which item are you searching for?");
                Scanner input4 = new Scanner(System.in);
                name = input4.nextLine();
                list.find(name);
                break;
            
            case 5:
                list.removeFirst();
                System.out.print("First item from the list removed.");
                break;
            }
        
    }        
       

    
    public static void main(String[] args) {
       
        System.out.print("Welcome to your virtual storage! Please choose the operation you would like to perform.\n"
                + "List of operations:\n"
                + "1-create next item(creates new items in the list)\n"
                + "2-display(displays the full content of the list)\n"
                + "3-remove item(removes item from the list)\n"
                + "4-remove first item from the list\n"
                + "5-find item(finds item on the list)\n"
                + "0-exit program\n");
        
        List list = new List();
        int input;
        do {
        System.out.print("Put in the number of the operation: \n");
        Scanner inNew = new Scanner(System.in);
        input = inNew.nextInt();
        switcher(list, input);
        System.out.println();
        } while (input != 0);
        System.out.print("Program terminated by user.");
    }
    
}
