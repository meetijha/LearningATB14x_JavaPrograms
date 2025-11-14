package ex_30_Collection_Framework.CF_03_QUEUE;

import java.util.ArrayDeque;
import java.util.Deque;

public class LabArrayDeque {
    public static void main(String[] args) {

        //push returns item, add returns boolean
        Deque<Integer> deck = new ArrayDeque();
        deck.push(5);
        deck.push(1);
        deck.push(6);// with push stored like stack
        deck.add(3);

        System.out.println(deck);// 6, 1,5,3 printed
        deck.pop(); //6 popped
        System.out.println(deck);// 1,5,3
        deck.pop();// 1 popped
        System.out.println(deck);
        System.out.println(deck.peek());
        System.out.println(deck);
    }
}
