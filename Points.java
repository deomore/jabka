package vlsu;

public class Points  {
   private  double x;
   private  double y;

 public Points(double x, double y) {
 this.x = x;
 this.y = y;
 }
   public  String toString() {
    return  "Point : " + x + " " + y;
 }

 public double getX() {
     return x;
 }

 public double getY() {
     return y;
 }
}