//21CE029 : MAHEE GADHIYA PRAC1 : MAIN
import java.util.*;

public class ex1_1 {
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
ex1 c = new ex1();
System.out.println("Enter radius of the circle :");
c.radius=sc.nextDouble();
System.out.println("Area of the circle is : "+c.getArea());
System.out.println("Perimeter of the circle : "+c.getPerimeter());
}
}