public class Linkedlistitrsearch {
    public static class Node{
        int data ; 
        Node next ; 

        public Node( int data ){
            this.data = data ;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail ;
    public static int size;

    public static void addFirst( int data ){
        // step1 = create nnew node
       
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // Step -2 newNode next = head

        newNode.next = head ; // link

        // step3 - head = newNode

        head = newNode;
        
    }

    public static  void  addLast(int data  ){
        Node newNode= new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public static void add( int idx , int data){

        if( idx == 0 ){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head ;
        int i = 0 ; 
        while (i<idx-1) {
            temp = temp.next;
            i++;
        }

        // 
        newNode.next = temp.next;
        temp.next = newNode;


    }



    public void print(){
        if (head ==null) {
            System.out.println("the list is empty");
            return;
           
        }
        Node temp = head ; 
        while( temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void removefirst(){
        
        // int val = head.data; we ar enot returninf the value 
        if (size ==0 ) {
            System.out.println("LL is empty");
        }
        else if( size ==1){
            size = 0 ;
            int val = head.data;
            head = tail = null;
        }
        head  = head.next ;
        size--;
         
    }
    public static void REMOVElAST(){
        if (size ==0) {
            System.out.println("LL is empty");
        }else if( size ==1){

            head = tail = null;
            size = 0 ;

        }
        Node prev = head ;
        for( int i = 0 ; i< size-2;i++){
            prev = prev.next;        }

            prev.next = null;
            tail = prev ;
            size--;
    }

    public static int  itrsearch(int key){
        Node temp = head ; 
        int i =  0 ;
        while( temp!= null){
            if( temp.data == key ){
                return i ;
            }
            temp = temp.next;
            i++;
        }

        return -1;
    }



// constant time O(1);
    public static void main(String[] args) {
        Linkedlistitrsearch  ll= new Linkedlistitrsearch();
        ll.addFirst(2);
        ll.addFirst(1); 
        ll.addLast(3);
        ll.addLast(4);

        ll.add(2,5);

        ll.print();
        ll.removefirst();
        ll.print();
      
        // System.out.println(ll.size);
        System.out.println(itrsearch(3));
        System.out.println(itrsearch(10));
    }
    
}
