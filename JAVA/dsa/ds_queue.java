import java.util.ArrayList;
class Queue{
    ArrayList<Integer> qu = new ArrayList<Integer>();
    int size=5;
    public void enqueue(int element){
        if(qu.size()==size){
            System.out.println("Overflow:queue is full");
        }else{
            qu.add(element);
        }
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("underflow:queue is empty");
        }
        else{
            qu.remove(0);
        }
    }
    public boolean isEmpty(){
        if(qu.size()==0){
            return true;
        }
        else{
            return false;
        }
    }
    public void printqu(){
        for (int i = 0; i < qu.size(); i++)
            System.out.print(qu.get(i)+" ");
            System.out.println();
    }
}
public class ds_queue {
    public static void main(String args[]) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.printqu();
    }
}
