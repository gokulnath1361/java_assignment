import java.io.*;
class Volume {
    public static void main (String[]args){
      int r=5;
      double sphere;
      sphere=((4/3)*3.14*r*r*r);
      System.out.println("volume of sphere is :"+sphere);
      double hemisphere;
      hemisphere=((2/3)*3.14*r*r*r);
      System.out.println("volume of hemisphere is :"+hemisphere);
      int h=7;
      double cone;
      cone=(3.14*r*r*(h/3));
      System.out.println("volume of cone is :"+cone);
      int length=7;
      int breadth=4;  
      int height=8;
      double cuboid;
      cuboid=length*breadth*height;
      System.out.println("volume of cuboid is :"+cuboid);
    }
    
}
