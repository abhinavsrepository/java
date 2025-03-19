import java.util.*;
class Average{
public static void main(String [] args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the 5 numbers ");
double n1 =sc.nextDouble();
double n2 = sc.nextDouble();
double n3 = sc.nextDouble();
double n4 = sc.nextDouble();
double n5 = sc.nextDouble();

double avg;

avg =(n1+n2+n3+n4+n5)/5;


System.out.println("the avg of number "+avg);

sc.close();
}
}

