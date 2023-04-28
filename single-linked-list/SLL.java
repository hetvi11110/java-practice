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

    void firstAdd(String ndata){

        Node newNode = new Node(ndata);
        newNode.next = head;
        head = newNode;

    }

    void lastAdd(String ndata){

        Node newNode = new Node(ndata);
        Node currentNode = head;
        while(currentNode.next != null){               
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
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
        obj.firstAdd("Hetvi");
        obj.firstAdd("Patel");
        obj.lastAdd("Ankit");
        obj.display();
        
    }

}