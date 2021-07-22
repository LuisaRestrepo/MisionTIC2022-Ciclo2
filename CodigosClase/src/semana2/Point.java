package semana2;

public class Point {

    private double x;
    private double y;

    //1
    public Point() {
        this.x = 0;
        this.y = 0;
    }
    
    //2
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double distance(double x, double y){
    double dist = Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));
    return dist;
    }
    
    public double distance(int x, int y){
    double dist = Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));
    return dist;
    }
    
    public double distance(Point p){
    double dist = Math.sqrt(Math.pow(this.x-p.getX(),2)+Math.pow(this.y-p.getY(),2));       
    return dist;
    }
}
