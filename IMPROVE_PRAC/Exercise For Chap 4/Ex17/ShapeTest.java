// public class ShapeTest {
//     public static void main(String[] args){

//         Point p = new Point(7.5, 11.5); // create a point
//         Circle c =  new Circle(7.5, 11.5, 5.0); // create a circle
//         Cylinder cy = new Cylinder(7.5, 11.5, 5.0, 10.0); // Create a cylinder

//         // Display information of each shape
//         System.out.println();
//         System.out.println("Information of each shape: ");
//         System.out.println(p.getName() + ": " + p.toString());
//         System.out.println(c.getName() + ": " + c.toString());
//         System.out.println(cy.getName() + ": " + cy.toString());
//         System.out.println("___________________________________________________________________________");

//         // Calculate area and volume of each shape
//         System.out.println();
//         System.out.println("Area and Volume of each shape: ");
//         System.out.println("The area of the circle is " + c.calArea()); // Formula: pi * r^2
//         System.out.println("The area of the Cylinder is " + cy.calArea()); // Formula: pi * r(r + h)
//         System.out.println("The Volume of the Cylinder is " + cy.calVolume()); // Formula: pi * r^2 * h
        
//     }    
// }



public class ShapeTest{
    public static void main(String []args){
        Shape [] polyShape = new Shape[3];

        polyShape[0] = new Point(7.5, 11.5); // create a point
        polyShape[1] = new Circle(7.5, 11.5, 5.0); // create a circle
        polyShape[2] = new Cylinder(7.5, 11.5, 5.0, 10.0); // Create a cylinder

        // Display information of each shape
        for(int i = 0 ; i < polyShape.length; i++){
            System.out.println();
            System.out.println("Information of each shape: ");
            System.out.println(polyShape[i].getName() + ": " + polyShape[i].toString());
            System.out.println("The area of the "+ polyShape[i].getName() + " is " + polyShape[i].calArea());
            System.out.println("The Volume of the  " + polyShape[i].getName() +" is " + polyShape[i].calVolume());
            System.out.println("___________________________________________________________________________");
        }
    }
}