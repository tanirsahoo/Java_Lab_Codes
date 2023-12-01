package Static_keyword;

class point{
    double x , y ;
    point(double x , double y){
        this.x = x ;
        this.y = y ;
    }
    static void dist(point p1 , point p2){
        System.out.println("Distance between the two points is: " + Math.sqrt(Math.pow(p1.x - p2.x , 2) + Math.pow(p1.y - p2.y , 2)) + " units");
    }
}
public class geometric_distance {
    public static void main(String[] args) {
        point p1 = new point(1.0 , 2.0) ;
        point p2 = new point(-1.0 , 2.0) ;
        point.dist(p1 , p2);
    }
}
