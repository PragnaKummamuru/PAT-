import java.util.*;
public class sample{
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1[]={"student1@gmail.com" , "student2@iare.com" , "student3@yahoo.com" , "student4@IARE.com"};
        for(String mail:s1){
            String[] temp = mail.split("@");
            System.out.println(i : temp);
            if (temp[1].equalsIgnoreCase("iare.com")){
                System.out.println(temp[0]);
            }
        }


        }
    } 