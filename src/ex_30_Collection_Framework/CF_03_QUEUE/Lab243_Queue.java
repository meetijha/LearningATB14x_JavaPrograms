package ex_30_Collection_Framework.CF_03_QUEUE;

import java.util.*;

public class Lab243_Queue {
    // Queue -> 0.001% in Automation
    // FIFO
    // does not follow indexing

    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();
        q.add("meeti");
        q.add("jha");
        System.out.println(q); // natural sorting

        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);

    }
}
