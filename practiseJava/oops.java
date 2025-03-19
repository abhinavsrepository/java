import java.util.*;
class FoodBill{

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println(":Enter number of item:");
        int n= sc.nextInt();
        int total=0;
        for(int i=0;i<n;i++){
            System.out.println(":Enter item name:");
            String item = sc.next();
            System.out.println(":Enter item price:");
            int price = sc.nextInt();
            System.out.println(":Enter item quantity:");
            int quantity = sc.nextInt();
            total += price*quantity;
        }

        System.out.println("Total bill is: "+total);
    }


}