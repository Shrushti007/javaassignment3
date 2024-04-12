package assignment3;
public class Triangle {
private
double side1;
double side2;
double side3;
double Perimeter;


public Triangle(double side1, double side2, double side3) {
super();
this.side1 = side1;
this.side2 = side2;
this.side3 = side3;

}

public double calculatePerimeter() {
Perimeter=side1+side2+side3;
return Perimeter;
}
public double calArea() {
double s=(side1+side2+side3)/2;
double area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
return area;
}
public void display() {
System.out.println("side1 :" +side1);
System.out.println("side2 :" +side2);
System.out.println("side3 :" +side3
);
System.out.println("Perimeter :" +calculatePerimeter());
System.out.println("Area :" +calArea());
}


}