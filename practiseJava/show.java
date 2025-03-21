//Display x,y co-ordinates of both of the points plotted  (using show() method)



class Point {
    int x ,y ;
    Point (int x ,int y){
        this.x = x;
        this.y = y;
    }
    void show(){
        System.out.println("Co-ordinates of point are: ("+x+","+y+")");
    }
    public static void main(String []args){
        Point p1 = new Point(2,3);
        Point p2 = new Point(4,5);
        p1.show();
        p2.show();
    }
}