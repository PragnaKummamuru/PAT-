import java.util.*;
//SINGLE LEVEL INHERITENCE
/*class A{
    String name = "in class A";
    public void welcome(){
        System.out.println("Welcome to class A");
    }
}
class B extends A{
    String name ="Pragna";
}
public class inheritance {
    public static void main(String[] args) {
        B ob= new B();
        System.out.println(ob.name);
        ob.welcome();
    }    
}
*/

//MULTILEVEL INHERITANCE
/*class A{
    String name_1 = "in class A";
    public void welcome(){
        System.out.println("Welcome to class A");
    }
}
class B extends A{
    String name_2 ="in class B";
    public void home(){
        System.out.println("Welcome to class B");
    }
}
class C extends B{
    public void joey(){
        System.out.println("How you doing!!!");
    }

}
public class inheritance {
    public static void main(String[] args) {
        C ob= new C();
        System.out.println(ob.name_1);
        ob.welcome();
        ob.joey();
    }    
}
*/

//HEIRARCHIAL INHERITANCE
/*class Series{
    String name="Friends";
    Integer season =1;
}
class Chandler extends Series{
    public void status(){
        System.out.println("SAD");
    }
}
class Joey extends Series{
    public void feels(){
        System.out.println("ALWAYS HAPPY");
    }
}
public class inheritance {
    public static void main(String[] args) {
        Joey ob= new Joey();
        System.out.println(ob.season);
        System.out.println(ob.name);
        ob.feels();
    }    
}
*/

//MULTIPLE INHERITENCE - to implement this in java we use INTERFACE ......bcas we can extend only 1 parent cls at a time in java - due to "DIAMOND PRBLM"

/*interface A{
    public int welcome1();   // interfaces have only method DECLARATION NO DEFINITION(BODY)   . They r BY DEFAULT static , final , public
    public void something();  // cant create objects for interface
}
interface B{
    public void welcome();
}
class C implements A,B{  // the methods declared in parent classes must be defined heree means C shld have bodies of methods declared in A,B.
    public int welcome1(){
        System.out.println(2);                       // if u have nthg to give as o/p just leave blank
    }
    public void something(){
        System.out.println("HIIIIIIIIII");
    }
    public void welcome(){

    }
}
*/

