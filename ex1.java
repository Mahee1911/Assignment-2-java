//21CE029 : MAHEE GADHIYA  PRAC1 : CLASS
import java.util.*;
public class ex1 {
	double radius;
	double area;
	double peri;
	ex1()
	{
	radius=1;
	}
	ex1(double r)
	{
	radius=r;
	}
	public double getArea()
	{
	area=3.14*radius*radius;
	return area;
	}
	public double getPerimeter()
	{
	peri=2*3.14*radius;
	return peri;
	}
}