//WE SHOULD HAVE ONLY 1 PUBLIC CLASS IN PROG.
import java.util.*;
/*public class sample2{
    public static int add(int a, int b) {
        return a+b;
    } 
    public int mul(int num1,int num2){
        return num1*num2;
    }

    public static void main(String[] args) {
        System.out.println(add(10,20));
        sample2 ob = new sample2();
        System.out.println(ob.mul(10,20));
        
    }
}
*/

import org.omg.Messaging.SyncScopeHelper;



/*class Student {
    int roll=21;
    String name = "PRagna";
    public void displayName(){    //we r declaring a method displaNAme inside class
        System.out.println(name);
    }
}
public class sample2{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.displayName(); //we r now calling that method

        
    }
}
*/


class Instagram{
    String username = "pragna";
    private String password = "qwerty";    // declare secured details like pw using PRIVATE access specifier

    public void updatePassword (String newPassword) {   //SETTER
        password = newPassword ;
    }

    public String getPassword(){                //GETTER
        return password;
    }

}
 public class sample2{
    public static void main(String[] args) {
        Instagram i1=new Instagram();
        System.out.println(i1.username);
        //System.out.println(i1.password);// wont display pw
        System.out.println(i1.getPassword());
        i1.updatePassword("helloooooooo");
        System.out.println(i1.getPassword());
    }
}