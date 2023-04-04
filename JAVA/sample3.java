import java.util.*;
public class sample3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        try{
            System.out.println(a/b);  //try if this code is working or not
        }catch(Exception e){
            System.out.println("OOPSSS....you got an error");  //catch block to handle the error , if error occurs dont show erreo just display a user friendly msg
        }finally{
            System.out.println("This is final block");   // he finally keyword is used to execute code (used with exceptions - try.. catch statements) no matter if there is an exception or not.
        }
        System.out.println("Program completed");

    }
}

/*exception handling */
try{ //line 1
    try{  //line 2
        try{ //line 3

        } finally{

        }
    }
    catch (Exception e2)
}
catch (Exception e)

/* in above lines error in line is handled by Exception e */
/*error in line 2 is handled  by excpetion e2 */
/* where as error in line 3 is handled by its parent exception i.e., e2 bcas it not given any catch exception */
