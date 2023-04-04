import java.util.ArrayList;
class Stack1{
    ArrayList<Integer> stk= new ArrayList<Integer>();
    int size=5;
    public void push(int element){
        if(stk.size()==size){
            System.out.println("overflow:stack is full");
        }
        else{
            stk.add(element);
        }
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("underflow: stack is empty");
        }
        else{
            stk.remove(stk.size()-1);
        }
    }
    public int peek(){
        if(!isEmpty()){
            return stk.get(stk.size());
        }
        else{
            System.out.println("stack is empty");
            return -1;

        }    
    }
    public boolean isEmpty(){
        if(stk.size()==0){
            return true;
        }
        else{
            return false;
        }
    }
    public void printstack(){
        for (int i = 0; i < stk.size(); i++)
            System.out.print(stk.get(i)+" ");
            System.out.println();
    }
    public void printrev(){
        for(int i=stk.size()-1;i>=0;i--){
            System.out.print(stk.get(i)+" ");
        }
    }
}

public class ds_stack {
    public static void main(String args[]){
//implementing stack
        Stack1 ob = new Stack1();
        ob.push(5);
        ob.push(6);
        ob.pop();
        ob.push(8);
        ob.printstack();
        ob.printrev();
    }
}

//reverse every k elements in a stack if satck = 1 2 3 4 5 6 op is 3 2 1 6 5 4

