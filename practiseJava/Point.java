//Accept x,y co-ordinates for 2 points n store the co-ordinates

import java.util.*;
class Point {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x1:");
        int x1 = sc.nextInt();
        System.out.println("Enter y1:");
        int y1 = sc.nextInt();
        System.out.println("Enter x2:");
        int x2 = sc.nextInt();
        System.out.println("Enter y2:");
        int y2 = sc.nextInt();
        System.out.println("Co-ordinates of point 1 are: ("+x1+","+y1+")");
        System.out.println("Co-ordinates of point 2 are: ("+x2+","+y2+")");
    }

}
