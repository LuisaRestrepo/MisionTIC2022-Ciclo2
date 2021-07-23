package semana2;

public class Point {

    private double x;
    private double y;

    //1
    public Point() {
        this(0,0);
        //this.x = 0;
        //this.y = 0;
    }
    
    //2
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
        
    //3
    public Point(Point p) {
        this(p.getX(),p.getY());
        //this.x = p.getX();
        //this.y = p.getY();
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
    System.out.println("Me fui por el double");
    double dist = Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));
    return dist;
    }
        
    public double distance(int x, int y){
    System.out.println("Me fui por el int");
    double dist = Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));
    return dist;
    }
    
    public double distance(Point p){
    double dist = Math.sqrt(Math.pow(this.x-p.getX(),2)+Math.pow(this.y-p.getY(),2));       
    return dist;
    }

    public Point midPoint(Point p){
        double x = (this.x+p.getX())/2;
        double y = (this.y+p.getY())/2;  
        Point p3 = new Point(x,y);
        return p3;
    }
    
    @Override
    public String toString(){
    return "El valor del eje x es: "+x+", el valor del eje y: "+y;
    }
}
