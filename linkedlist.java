public class linkedlist {
    public static void main(String[] args) {
        linkedlist obj = new linkedlist();
        obj.addLast(1);
        obj.addLast(2);
        obj.addLast(3);
        obj.addLast(6);
        obj.addLast(7);

        obj.display();
        obj.headFirst(5);
        System.out.println("\n new after head");
        obj.display();

        obj.removeLast();
        System.out.println("\n new after remove last");
        obj.display();

        obj.removeFirst();
        System.out.println("\n new after remove first");
        obj.display();

    }
        
    class Node{
        Node(int data){
            this.data = data;
            
        }

        int data;
        Node next;
        Node Prev;
    }
    Node head; 

    public void addLast(int val){
        Node obj = new Node(val);
        Node temp = head;
        if(head == null){
            head = obj;
            return;
        }
        while(temp.next != null){
            temp = temp .next;

        }
        temp.next = obj;

    }
    public void headFirst(int val){
        Node obj = new Node(val);
        Node temp = head;
        head = obj;
        obj.next = temp;
        

         
        
    }
    public void display(){
        Node temp = head;
        while(temp != null ){
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
    }
    public void removeLast(){
        
        Node temp = head;
        while(temp.next.next != null){
            temp =  temp.next;


        }
        temp.next = null;
    }
    public void removeFirst(){
        

        if(head == null){
            return;

        }
        head = head.next;
    }
}

