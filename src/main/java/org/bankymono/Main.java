package org.bankymono;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        LinkedList linkedList = new LinkedList();
//        linkedList.insertFirst(10);
//        linkedList.insertFirst(20);
//        linkedList.add(50);
//        linkedList.addV2(30);
//        linkedList.addV2(40);
//        linkedList.display();
//        linkedList.insert(80,3);
//        System.out.println();
//        linkedList.display();
//        linkedList.delete(2);
//        System.out.println();
//        linkedList.display();
//        linkedList.replace(90,4);
//        System.out.println();
//        linkedList.display();

        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(scanner);
        tree.display();
    }
}