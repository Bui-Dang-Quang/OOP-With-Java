/**

Ex15: Given the source code below:
public abstract class Cat{
    public String cName;
    public void chaseMouse(){
        System.out.println("Chasing Mouse");
    }
    public abstract void meow(){
        System.out.println("Meow");
    }
}

Is there ant problem? Answer: Yes, because Abstract methods cannot be specified a body.
 **/ 

public abstract class Cat{
    public String cName;
    public void chaseMouse(){
        System.out.println("Chasing Mouse");
    }
    public abstract void meow();
}