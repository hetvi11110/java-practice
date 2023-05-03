class SLL {

    class Node{

        String data;
        Node next;
        Node(String ndata){
            data = ndata;
            next = null;
        }

    }
   
    Node head = null;

    void addFirst(String ndata){
        Node newNode = new Node(ndata);
        newNode.next = head;
        head = newNode;
    }

    void addLast(String ndata){
        Node newNode = new Node(ndata);
        if(head != null) {
            Node currentNode = head;
            while(currentNode.next != null){               
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        } else {
            head = newNode;
        }
    }

    void deleteFirst(){
        head = head.next;
    }

    void deleteLast(){
        Node currentNode = head;
        Node prevNode = head;
        while(currentNode != null){ 
            if(currentNode.next == null) {
                prevNode.next = null;
            }
            prevNode = currentNode;        
            currentNode = currentNode.next;
        }
    }

    void deleteNode(String ndata){
        Node currentNode = head;
        Node prevNode = head;
        while(currentNode != null){  
            if(currentNode.data == ndata) {
                if(head.data == ndata){
                    head = currentNode.next;
                    break;
                } else {
                    prevNode.next = currentNode.next;
                    break;
                }
            }else {     
                prevNode = currentNode;        
                currentNode = currentNode.next;
            }
        }
    }

    void display(){
        Node currentNode = head;
        while(currentNode != null){
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }
    
    public static void main(String[] args) {

        System.out.println("Single Linked List");
        SLL obj = new SLL();
        obj.addFirst("Hetvi");
        obj.addFirst("Patel");
        obj.addLast("Ankit");
        obj.addLast("Harry");
        // obj.deleteFirst();
        obj.deleteLast();
        // obj.deleteNode("Harry");
        obj.display();
        // SLL obj1 = new SLL();
        // obj1.firstAdd("Harry");
        // obj1.deleteNode("Potter");
    }

}