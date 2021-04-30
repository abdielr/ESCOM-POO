package photoalbum;

public class CircularList {  
    public Node head;
    public void addNode(String value) {  
        if (head == null) {  
            Node new_node = new Node();  
            new_node.data = value;  
            new_node.next = new_node.prev = new_node;  
            head = new_node;  
            return;  
        }  
   
        Node last = (head).prev;    //previous of head is the last node
   
        Node new_node = new Node();  
        new_node.data = value;  
   
        new_node.next = head;  
   
        (head).prev = new_node;  
   
        new_node.prev = last;  
   
        last.next = new_node;  
    }  
    public Node getNextNode(Node n){
	return n.next;
    }
    public Node getPrevNode(Node p){
	return p.prev;
    }
    public void printNodes()   {  
        Node temp = head;  
        while (temp.next != head)  
        {  
            System.out.printf("%s ", temp.data);  
            temp = temp.next;  
        }  
        System.out.printf("%s ", temp.data);  
        System.out.printf("\nCircular doubly linked list travesed backward: \n");  
        Node last = head.prev;  
        temp = last;  
        while (temp.prev != last)  
        {  
            System.out.printf("%s ", temp.data);  
            temp = temp.prev;  
        }  
        System.out.printf("%s ", temp.data);  
    }  
   
}  
