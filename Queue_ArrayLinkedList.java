//import java.util.LinkedList;
//import java.util.Queue;
//
// class FindMaxInQueue {
//
//    Queue<Integer> queue = new LinkedList<>();
//
//    public int findMax() {
//        int max = Integer.MIN_VALUE;
//
//        while (!queue.isEmpty()) {
//            int val = queue.remove(); // dequeue
//            if (val > max) {
//                max = val;
//            }
//        }
//        return max;
//    }
//
//    public static void main(String[] args) {
//
//        FindMaxInQueue obj = new FindMaxInQueue();
//
//        obj.queue.add(10);
//        obj.queue.add(20);
//        obj.queue.add(30);
//
//        System.out.println("Queue: [10, 20, 30]");
//        System.out.println("Maximum = " + obj.findMax());
//    }
//}
//import java.util.LinkedList;
//import java.util.Queue;
//
//class FindSumInQueue {
//
//    Queue<Integer> queue = new LinkedList<>();
//
//    public int findSum() {
//        int sum = 0;
//
//        while (!queue.isEmpty()) {
//            sum += queue.remove(); // dequeue
//        }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//
//        FindSumInQueue obj = new FindSumInQueue();
//
//        obj.queue.add(10);
//        obj.queue.add(20);
//        obj.queue.add(30);
//
//        System.out.println("Queue: [10, 20, 30]");
//        System.out.println("Sum = " + obj.findSum());
//    }
//}
//

import java.util.LinkedList;
import java.util.Queue;

class CountQueueElements {

    Queue<Integer> queue = new LinkedList<>();

    public int countElements() {
        int count = 0;

        while (!queue.isEmpty()) {
            queue.remove(); // dequeue
            count++;
        }
        return count;
    }

    public static void main(String[] args) {

        CountQueueElements obj = new CountQueueElements();

        obj.queue.add(10);
        obj.queue.add(20);
        obj.queue.add(30);

        System.out.println("Queue: [10, 20, 30]");
        System.out.println("Count = " + obj.countElements());
    }
}

