//POLYMORPHISM - METHOD OVERRIDING

import java.util.*;
class Shape{
    public void area(){
        System.out.println("Area =");
    }
}
class Square extends Shape{
    int a=5;
    public void area(){
        System.out.println(a*a);
    }
}
class Circle extends Shape{
    int a=3;
    public void area(){
        System.out.println(3.14*a*a);
    }
}

public class poly {
    public static void main(String args[]) {
        Circle on = new Circle();
        on.area();
    }
}
