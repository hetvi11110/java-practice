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
        Node newNode = new Node(ndata);
        newNode.next = head;
        head = newNode;
        System.out.println(ndata+" insert successful on top.");
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

    void deleteFirst(){
        if(checkEmpty() == true) {
            return;
        }
        System.out.println(head.data+" delete successful at the top.");
        head = head.next;        
    }

    void deleteLast(){
        if(checkEmpty() == true) {
            return;
        }
        Node currentNode = head;
        Node prevNode = head;
        while(currentNode != null){ 
            if(currentNode.next == null) {
                System.out.println(currentNode.data+" delete successful at the end of the list.");
                prevNode.next = null;
            }
            prevNode = currentNode;        
            currentNode = currentNode.next;           
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

    void sizeofLL(){
        int i = 0;
        Node currentNode = head;
        while(currentNode != null){
            i++;
            currentNode = currentNode.next;
        }
        System.out.println("Size of linkedlist is: "+i);
    }

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

    void print_in_reverse(){

        if(checkEmpty() == true) {
            return;
        }

        print_in_reverse(head.next);
        System.out.println(head.data + " <-");

    }

    void print_in_reverse(Node currentNode){

        if (currentNode == null)
        return;

        print_in_reverse(currentNode.next);
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