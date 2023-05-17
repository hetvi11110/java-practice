class SLL {

    // Define class
    class Node{
        String data; // data of node
        Node next; // adress of next node
        Node(String ndata){ // define constructor
            data = ndata;
            next = null;
        }
    }
   
    Node head = null; // define head of LL

    //check if LL is empty or not
    boolean checkEmpty(){
        if(head == null){
            System.out.println("Linked List is empty.");
            return true;
        }
        return false;
    }

    //insert node on top of LL
    void addFirst(String ndata){
        Node newNode = new Node(ndata); // create object of Node class
        newNode.next = head; // assign current head value to the new node in next node adress
        head = newNode; // assign new node object as head value
        System.out.println(ndata+" insert successful on top.");
    }

    //insert node at the end of LL
    void addLast(String ndata){
        Node newNode = new Node(ndata); // create object of Node class
        if(head != null) { // check if head is null or not
            Node currentNode = head; // create new object and assign head value of LL
            while(currentNode.next != null){                  
                currentNode = currentNode.next; //travel linked list and get last node
            }
            currentNode.next = newNode; //assign new node adress to last node of ll
        } else {
            head = newNode; //if head is null then assign new node value to head
        }
        System.out.println(ndata+" insert successful at the end of the list.");
    }

    void addNode(int key, String ndata){
        if(key < 1){
            System.out.println("Invalid key value inserted.");
            return;
        }
        Node newNode = new Node(ndata);
        boolean insert = false;
        if(key == 1 || head == null ){
            if(head != null){
                newNode.next = head;               
            }
            head = newNode;
            System.out.println(ndata+" insert successful on top.");
            insert = true;
        } else {
            Node currentNode = head;
            Node prevNode = head;
            Node temp = null;
            int i = 1;
            while(currentNode != null){
                if(i == key){
                    temp = prevNode.next;
                    prevNode.next = newNode;
                    newNode.next = temp;
                    System.out.println(ndata+" insert successful.");
                    insert = true;
                    break;
                }
                prevNode = currentNode;               
                currentNode = currentNode.next;
                i++;
            }
            if(i == key && insert == false){
                prevNode.next = newNode;
                System.out.println(ndata+" insert successful at the end of the list.");
                insert = true;
                return;                   
            }
            if(insert == false) {
                System.out.println("There are only "+(i-1)+" node exist.");
            }
        }
    }

    //delete node on top of LL
    void deleteFirst(){
        if(checkEmpty() == true) { //check if linked list is empty or not
            return;
        }
        System.out.println(head.data+" delete successful at the top.");
        head = head.next; // assign current head node adress as head       
    }

    //delete node at the end of LL
    void deleteLast(){
        if(checkEmpty() == true) { //check if linked list is empty or not
            return;
        }
        Node currentNode = head; // create new object of current node and assign head value of LL
        Node prevNode = head; // create new object of previous node and assign head value of LL
        while(currentNode != null){ //travel in the linked list
            if(currentNode.next == null) { // check if current node is last node or not
                System.out.println(currentNode.data+" delete successful at the end of the list.");
                prevNode.next = null; // remove the adress from prev nod of the last node
            }
            prevNode = currentNode; // assign current node value in previous node       
            currentNode = currentNode.next;  // assign next node value in current node         
        }
    }

    void deleteNode(int key){
        if(checkEmpty() == true) {
            return;
        }
        boolean success = false; 
        if(key == 1){
            System.out.println(head.data +" delete successful.");
            head = head.next;
            success = true;
        } else {
            Node currentNode = head;
            Node prevNode = head;
            int i = 1;
            while(currentNode != null){
                if(i == key){
                    System.out.println(currentNode.data +" delete successful.");
                    prevNode.next = currentNode.next;
                    success = true;
                }
                prevNode = currentNode;        
                currentNode = currentNode.next;
                i++;
            }
        }
        if(success == false){           
            System.out.println("Key does not exist.");
        } 
    }

    void deleteNode(String ndata){
        if(checkEmpty() == true) {
            return;
        }
        Node currentNode = head;
        Node prevNode = head;
        boolean success = false;
        while(currentNode != null){  
            if(currentNode.data == ndata) {
                if(head.data == ndata){
                    head = currentNode.next;
                    System.out.println(ndata +" delete successful.");
                    success = true;
                } else {
                    prevNode.next = currentNode.next;
                    System.out.println(ndata +" delete successful.");
                    success = true;
                }
            }    
            prevNode = currentNode;        
            currentNode = currentNode.next;
        }
        if(success == false){           
            System.out.println("Node can't find.");
        }        
    }

    //print linked list
    void display(){
        if(checkEmpty() == true) {
            return;
        }
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data+' ');
            currentNode = currentNode.next;
        }
        System.out.println(' ');
    }

    //print size of linked list
    void sizeofLL(){
        int i = 0; //define variable and assign 0 value
        Node currentNode = head; //create object and assign head value
        while(currentNode != null){ //travel in linked list
            i++; // increase value of i
            currentNode = currentNode.next; // assign next node value to current node object
        }
        System.out.println("Size of linkedlist is: "+i);
    }

    //return lenght of linked list
    int getLength(){
        int i = 0;
        Node currentNode = head;
        while(currentNode != null){
            i++;
            currentNode = currentNode.next;
        }
        return i;
    }

    // void getMiddleNode(){
    //     if(checkEmpty() == true) {
    //         return;
    //     }
    //     int i = 1;
    //     Node currentNode = head;
    //     double middle = Math.round(Double.valueOf(getLength())/Double.valueOf(2) + 0.4);
    //     while(currentNode != null){
    //         if(i == middle){
    //             System.out.println("The middle node is : "+currentNode.data);
    //             break;
    //         }
    //         i++;
    //         currentNode = currentNode.next;
    //     }
    // }

    //print middle node of linked list
    void getMiddleNode(){

        if(checkEmpty() == true) {
            return;
        }

        Node currentNode = head;
        for(int i = 0; i < getLength()/2; i++) {
            currentNode = currentNode.next;
        }
        System.out.println("The middle node is : "+currentNode.data);
    }

    //define function for head node
    void print_in_reverse(){

        if(checkEmpty() == true) { // check is empty or not
            return;
        }

        print_in_reverse(head.next); // set recursion
        System.out.println(head.data + " <-");

    }

    //use function overloading for recursion with one argument which pass node
    void print_in_reverse(Node currentNode){

        if (currentNode == null) // check is empty or not
        return;

        print_in_reverse(currentNode.next); // set recursion
        System.out.println(currentNode.data + " <-");

    }
   
    
    public static void main(String[] args) {

        System.out.println("Single Linked List:");

        SLL obj = new SLL();
        
        obj.display();
        obj.addFirst("Hetvi");
        obj.addLast("Ankit");
        

        obj.addFirst("Patel");
        obj.addNode(5,"First");
        obj.addNode(5,"First");
        obj.addNode(1,"Hetvi");
        obj.addNode(1,"Patel");
        obj.addNode(3,"Ankit");
        obj.addNode(6,"Ron");
        obj.addNode(5,"Ron");                           
        obj.deleteFirst();
        obj.deleteLast();
        obj.deleteNode("Hetvi");
        obj.deleteNode(5);
        obj.deleteNode(6);
        obj.display();
        obj.print_in_reverse();
        // obj.sizeofLL();
        // obj.getMiddleNode();

        // SLL obj1 = new SLL();
        // obj1.addFirst("Harry");
        // obj1.deleteNode("Potter");
        // obj1.display();
        // obj1.sizeofLL();

        // SLL intob = new SLL();
        // intob.addLast("10");
        // System.out.println(intob.getMiddleNode());
    }

}