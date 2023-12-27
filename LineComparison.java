import java.util.Scanner;

public class LineComarison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Program.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x-1");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y-1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x-2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y-2: ");
        double y2 = scanner.nextDouble();

        Point p1=new Point(x1,y1);
        Point p2=new Point(x2,y2);

        Line line=new Line(p1,p2);

        System.out.println("Length of Line: "+line.calculateLength());
    }
}

public class Point{
    double x,y;
    public Point(x,y){
        this.x=x;
        this.y=y;
    }
}

class Line {
    Point point1, point2;

    public Line(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public double calculateLength() {
        double x1 = point1.x;
        double y1 = point1.y;
        double x2 = point2.x;
        double y2 = point2.y;

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
