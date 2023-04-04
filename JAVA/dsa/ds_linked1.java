import java.util.*;

class Node{
    int data;  // to store data
    Node next; //to store next address
    public Node(int value){
        this.data = value;
        next = null;
    }
}

class Linkedlist{
    public Node addElementAtStart(Node head,int data){
        Node first_node = new Node(data);
        first_node.next = head;
        head = first_node;
        return head;
        /* or
        Node temp=head;
        head=first_node;
        head.next=temp;
        return head;
          */
    }
    public void addElement(Node head,int data){
        Node new_node = new Node(data);
        Node cur = head;
        while (cur.next != null){
            cur=cur.next;
        }
        cur.next=new_node;
    }
    public void addElementAtPos (Node head, int data, int pos){
        Node new_node = new Node(data);
        new_node.next=null;
        //this is when Pos>1
        Node temp = head;
        for (int i=1 ; i<pos-1 ; i++){      //traverse to the node previous to given pos
            if(temp!=null){
                temp=temp.next;
            }
        }
        if(temp!=null){
            new_node.next=temp.next;
            temp.next=new_node;
        }else{
            System.out.println("Previous node is null");
        }

    }
    public void deleteElement(Node head){   //let us delete last element of LL
        Node cur = head;
        while(cur.next.next!=null){
            cur=cur.next;
        }
        cur.next=null;
        System.out.println();
    }
    public void deleteElementAtPos(Node head , int pos){
        Node temp=head;    
        for(int i=1;i<pos-1;i++){   //traverse to the node previous to given pos
            if (temp!=null){
                temp=temp.next;
            }
        if(temp!=null && temp.next!=null){  // if previous node and its next node(our pos node) r not null
            Node ToDelNode=temp.next;
            temp.next=temp.next.next;
            ToDelNode = null;
        }
        }
    }
    public void delGivenValue (Node head, int val){
        Node toDelete = new Node(val);
        // if head is not null and its data is = val
        while(head!=null && head.data==val){
            toDelete = head;
            head=head.next;
            toDelete=null;
        }
        //in other cases..traverse list and delete all nodes with given val
        Node temp=head;
        if(temp!=null){
            while(temp.next!=null){
                if(temp.next.data == val){
                    toDelete = temp.next;
                    temp.next=temp.next.next;
                    toDelete=null;
                }else{
                    temp=temp.next;
                }
            }
        }
    }
    public Node reverseList(Node node){
        Node current = node;
        Node prev = null;
        Node next=null;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev= current;
            current = next;
        }
        node=prev;
        return node;
        
    }
    public void printList(Node head){
        Node cur=head;
        while(cur!=null){
            System.out.print(cur.data+"->");
            cur=cur.next;
        }
        System.out.println();
    }
}
public class ds_linked1 {
    public static void main(String[] args) {
        Linkedlist l1 =  new Linkedlist();
        Node head = new Node(10);
        l1.addElement(head,20);
        l1.addElement(head,30);
        l1.addElement(head,40);
        l1.printList(head);
        l1.deleteElement(head);
        l1.printList(head);
        head=l1.addElementAtStart(head, 5);
        l1.printList(head);
        l1.addElementAtPos(head,100,3);
        l1.printList(head);
        l1.deleteElementAtPos(head,3);
        l1.printList(head);
        l1.delGivenValue(head,20);
        head=l1.reverseList(head);
        l1.printList(head);
    }
}

//deleting a node with particular value
//inserting,deleting at particular position
//DONEEEEE
//reverse the linnked list
