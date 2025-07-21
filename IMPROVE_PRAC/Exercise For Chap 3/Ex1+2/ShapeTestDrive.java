
// import JAVA.LAB_3.ex1extend.Circle;
// import JAVA.LAB_3.ex1extend.Cylinder;
// import JAVA.LAB_3.ex1extend.Point;
// import JAVA.LAB_3.ex1extend.Shape;




public class ShapeTestDrive {
    public static void main(String[] args){
        Shape[] arrshapes = new Shape [3];
        arrshapes[0] = new Point(7.5, 11.5);
        arrshapes[1] = new Circle(3.5, 7.5, 2.8);
        arrshapes[2] = new Cylinder(3.5 , 7.5, 2.8, 5);
        for (int i = 0; i < arrshapes.length; i++){
            System.out.println("Shape Type: " + arrshapes[i].getName());
            double area = arrshapes[i].calArea();
            if (area == 0.0) {
                System.out.println("This shape does not have area");
            }else{
                System.out.println("The area of" + arrshapes[i].getName() + "is: " + area + "\n" );    
            }

            double volume = arrshapes[i].calVolume();
            if (volume == 0.0) {
                System.out.println("This shape does not have volume");
            }else{
                System.out.println("The volume of" + arrshapes[i].getName() + "is: " + volume + "\n" );    
            }
        }
    }
}
