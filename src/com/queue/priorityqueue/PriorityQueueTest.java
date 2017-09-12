package com.queue.priorityqueue;

import java.util.*;
public class PriorityQueueTest {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<Integer>();
        queue.add(2);
        queue.add(6);
        queue.add(7);
        queue.add(0);
        queue.add(5);
        queue.add(21);
        System.out.println(queue.peek());
        System.out.println("Queue : ");
//        Iterator itr = queue.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }

        /*Integer q = queue.poll();

        while (q != null) {
            // Do something
            System.out.println(q.toString());
            q = queue.poll();
        }*/

        for (Integer i:queue) {
            System.out.println(i);
        }

        //
        /*System.out.println("head: "+queue.element());
        System.out.println("head: "+queue.peek());
        System.out.println("iterating the queue elements; ");
        Iterator itr1 = queue.iterator();
        while (itr1.hasNext()){
            System.out.println(itr1.next());
        }
        //
        queue.remove();
        queue.poll();
        System.out.println("after removing two elements: ");
        Iterator itr2 = queue.iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }*/
    }
}
