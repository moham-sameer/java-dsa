package sharpener.LinkedList;

public class demo {
    public static void main(String[] args) {
         linkedlist list = new linkedlist();
         list.insert(1);
         list.insert(2);
         list.insert(3);
         list.insert(4);
         list.delete(2);
    }
}
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    class linkedlist{
        Node head;

        public void insert(int data ){
            Node newNode = new Node(data);
            if(head == null){
              head = newNode;
            }else{
               Node temp = head;
               while(temp.next != null){
                 temp = temp.next;
               } 
               temp.next = newNode;;
            }
            System.out.println(data);
        }
        public void traverse(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

        }
         void delete(int data){
            if(head == null) return;
            if(head.data == data){
                head = head.next;
                return;
            }
            Node temp = head;
            while(temp.next!= null && temp.next.data!=data){
                temp = temp.next;
            }
            if(temp.next==null) return;
            temp.next = temp.next.next;
            System.out.println("Deleted node: " + data);
            
        }
    }
