package pr5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class asn5 {
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println("Queue: " + stutter(queue));

        int qLength = queue.size();
    }

    public static Queue<Integer> stutter(Queue<Integer> queue){
        int size = queue.size();

        for (int i = 0; i < size; i++){
            int elem = queue.poll();
            queue.add(elem);
            queue.add(elem);
        }

        return queue;
    }

    public static void mirror(Queue<Integer> queue, int qLength){

    }
}
