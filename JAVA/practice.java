import java.uitl.*;
import java.util.Scanner;
public class practice {
    class Bike{
        String name;
        String model;
        int year;
        public Bike(String name, int year, String model){
            this.name=name;
            this.year=year;
            this.model=model;
        }
    }
    class retailer{
        Scanner sc =new Scanner(System.in);
        String name,model;
        int year;
    }
    class dealer{
        Bike b1= new Bike("classic","350",2000);
        Bike b2=new Bike ("Thunderboard",2010,"500");
        Bike b3 = new Bike("Himalayan",2018,"500");
        Bike arr[]={b1,b2,b3};
        public boolean check(Bike b){
             
        }
    }
    
}
    