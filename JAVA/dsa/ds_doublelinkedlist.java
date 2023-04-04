class Nodes{
    int data;  // to store data
    Nodes next; //to store next address
    Nodes prev; // to store prev address
    public Nodes(int value){
        this.data = value;
        next = null;
        prev=null;
    }
}
class Doublelink{
    public void addElement(Nodes head,int data){
        Nodes new_node = new Nodes(data);
        Nodes cur = head;
        while (cur.next != null){
            cur=cur.next;
        }
        cur.next= new_node;
        new_node.prev=cur;
    }
    public void deleteElement(Nodes head){

    }
    public void printList(Nodes head){
        Nodes cur=head;
        while(cur!=null){
            System.out.print(cur.data+"->");
            cur=cur.next;
        }
        System.out.println();

    }
}
public class ds_doublelinkedlist {
    public static void main(String[] args) {
        Doublelink l1 = new Doublelink(); 
        Nodes head = new Nodes(10);
        l1.addElement(head,20);
        l1.addElement(head,30);
        l1.addElement(head,40);
        l1.printList(head);
    }
}


// WRITE DELETE