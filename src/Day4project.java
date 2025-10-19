import java.util.*;

public class Day4project {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<>();
        int choice,index,removeIndex;
        int addItem,price=0;
        while (true) {
            System.out.println("1. Add item");
            System.out.println("2. Replace item ");
            System.out.println("3. Remove item");
            System.out.println("4. Show items");
            System.out.println("5. Exit");
            System.out.print("Choice: ");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("what is the item you want to add?\n"+
                            "1. Dress(40$)\n2.T-shirt(12$)\n3.Jacket(35$)");
                     addItem = input.nextInt();
                     if(addItem==1)
                     items.add("Dress");
                     else if(addItem==2)
                     items.add("T-shirt");
                     else items.add("Jacket");
                    break;
                case 2:
                    System.out.print("Enter index to replace: ");
                     index = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter new name: ");
                    String newItem = input.nextLine();
                    items.set(index, newItem);
                    break;
                case 3:
                    System.out.print("Enter index to remove: ");
                     removeIndex = input.nextInt();
                    if(items.get(removeIndex).charAt(0)=='D') price-=40;
                    if(items.get(removeIndex).charAt(0)=='T') price-=12;

                    if(items.get(removeIndex).charAt(0)=='J') price-=35;
                    items.remove(removeIndex);
                    break;
                case 4:
                    System.out.println("Items list:");

                    for (String item : items) {
                        System.out.println(item);
                        if(item.charAt(0)=='D') price+=40;
                        if(item.charAt(0)=='T') price+=12;

                        if(item.charAt(0)=='J') price+=35;

                    }
                    System.out.println("Total price = "+price+"$");
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}