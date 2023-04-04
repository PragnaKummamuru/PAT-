//ABSTRACTION 
import java.util.*;
abstract class Animal{
    abstract public void welcome();
    public void print(){
        System.out.println("Helloo");
    }
}

class dog extends Animal{
    public void welcome(){
        System.out.println("define here");
    }
}

public class abst {
    public static void main(String args[]) {
        dog obj = new dog();
        obj.welcome();
    }
}
