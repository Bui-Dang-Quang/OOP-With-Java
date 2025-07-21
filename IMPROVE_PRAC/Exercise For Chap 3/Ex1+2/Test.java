// package JAVA.LAB_3.ex1extend;

public class Test {
    public static void main(String[] args) {
        Point p = new Point(7.5, 11.5);
        System.out.println(p.getName() + ": " + p.toString());

        Circle c = new Circle(3.5, 7.5, 2.8);
        double areac = c.calArea();
        System.out.println(c.getName() + ": " + c.toString() + "; Area = " + areac);
        

        Cylinder cy = new Cylinder(3.5 , 7.5, 2.8, 5);
        double area = cy.calArea();
        double volume = cy.calVolume();
        System.out.println(cy.getName() + ": " + cy.toString() + "; Volume = " + volume + "; Area = " + area);

    }
}