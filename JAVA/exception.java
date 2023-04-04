import java.util.*;
public class exception {
    public static void main(String[] args) {
        int age = sc.nextInt();
        try{
            if (age<18){
                throw new Exception("Age under 18 so not allowed");
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());  // this is used to print the exception message like when we try to /0 
                                                 //we get / by zero mesage by deafult from the compiler even if we wwont srite that m
            
            //(e.printStackTrace()) -- this returns the file location . line and col where error occured 

        }
    }
}
