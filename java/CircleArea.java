import java.io.*;
class CircleArea {
    public static void main (String[]args){
      int r=4;
      double circle;
      circle=(3.141*(r*r));
      System.out.println("area of circle="+circle);
      int base=3;
      int height=5;
      double triangle;
      triangle=0.5*base*height;
      double equilateral;
      int a=4;
      equilateral=((1.732/4)*a*a);
      System.out.println("area of right angle triangle="+triangle);
      System.out.println("area of equilateral triangle="+equilateral);
      int length=6;
      int width=3;
      double rectangle;
      rectangle=length*width;
      System.out.println("area of rectangle="+rectangle);
      int square;
      square=a*a;
      System.out.println("area of square="+square);
      int p=5;
      int q=6;
      double rhombus;
      rhombus=((p*q)/2);
      System.out.println("area of rhombus="+rhombus);
      double pentagon;
      int s=5;//s=side of pentagon
      //pentagon=((5/2)*s*a);
       //    (or)
       // a= length of center to s
      pentagon=((5/2)*5*a);
      System.out.println("area of pentagon="+pentagon);
      double hexagon;
      hexagon=((3*1.732*a*a)/2);
      System.out.println("area of hexagon="+hexagon);
      double sideLength = 5.0; // Replace with the actual side length
      double apothem = 3.0;   // Replace with the actual apothem value
      double heptagon = ((7 * sideLength * apothem) / 2);
      System.out.println("The area of the heptagon is: " + heptagon);
      double octagon=(2*a*a*(2.414));
      System.out.println("The area of the octagon is: " + octagon);
      int a_base=3;
      int b_base=5;
      int h_height=6;
      double trapezoid=((a_base+b_base/2)*h_height);
      System.out.println("The area of the trapezoid is: " + trapezoid);

    }
    
}
