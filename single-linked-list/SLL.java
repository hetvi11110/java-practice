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

    void addNode(int key, String ndata){
        Node newNode = new Node(ndata);
        boolean insert = false;
        if(key == 1 || head == null ){
            if(head != null){
                newNode.next = head;               
            }
            head = newNode;
            System.out.println("Insert Sucesfull on top.");
            insert = true;
        } else {
            Node currentNode = head;
            Node prevNode = head;
            Node temp = null;
            int i = 1;
            while(currentNode.next != null){
                if(i == key){
                    temp = prevNode.next;
                    prevNode.next = newNode;
                    newNode.next = temp;
                    System.out.println("Insert Sucesfull.");
                    insert = true;
                    break;
                }
                prevNode = currentNode;               
                currentNode = currentNode.next;
                i++;
            }
            if(insert == false) {
                System.out.println("There are only "+i+" elements exist.");
            }
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
        obj.addNode(1,"First");
        obj.addNode(3,"Third");
        obj.addNode(10,"Tenth");
        // obj.deleteFirst();
        // obj.deleteLast();
        // obj.deleteNode("Harry");
        obj.display();
        // SLL obj1 = new SLL();
        // obj1.firstAdd("Harry");
        // obj1.deleteNode("Potter");
    }

}