package org.bankymono;

public class LinkedList {
    private Node head;
    private Node tail;

    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public void display (){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.value+"->");

            temp = temp.next;
        }

        System.out.print("end");
    }


    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null)
            tail = head;

        this.size++;
    }

    public void add(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void insert(int value, int index){

        if(index == 0){
            insertFirst(value);
            return;
        }

        if(index==size) {
            add(value);
            return;
        }

        Node temp = head;

        for(int i = 1; i < index; ++i){
            temp = temp.next;
        }
        Node newNode = new Node(value);
        Node temp2 = temp.next;

        temp.next = newNode;
        newNode.next = temp2;

        size++;
    }

    public void insertRec(int val, int index){
        if(head == null){
            head = new Node(val);
            tail = head;
        }
        head = insertRecHelper(val,index,head);
    }

    public Node deleteDuplicates(Node head) {
        Node temp = head;
        while(temp.next != null){
            if(temp.value == temp.next.value){
                Node secondTemp = temp.next.next;
                temp.next = secondTemp;
            }
            temp = temp.next;
        }
        return head;
    }

    public Node insertRecHelper(int val, int index, Node currNode){
        if(index == 0) {
            Node newNode = new Node(val);
            newNode.next = currNode;
            size++;
            return newNode;
        }

        currNode.next = insertRecHelper(val,--index,currNode.next);
        return currNode;
    }

    public void delete(int index) {
        Node temp = head;

        for(int i = 1; i < index; ++i){
            temp = temp.next;
        }
        Node toBeDeleted = temp.next;
        temp.next = toBeDeleted.next;
        --size;
    }

    public void replace(int value, int index) {
        Node temp = head;

        for(int i = 1; i < index; ++i){
            temp = temp.next;
        }

        Node toBeReplaced = temp.next;
        Node replacer = new Node(value);
        temp.next = replacer;
        replacer.next=toBeReplaced.next;

    }


    public void addV2(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
        } else {
            Node temp = head;

            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
        size++;
    }


    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
//    public static void main(String[] args) {
//    }
}
