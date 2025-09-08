/*
1. create a new priority queue, add some colors (string) and print out the elements of the priority queue.
2. iterate through all elements in the priority queue.
3. add all the elements of a priority queue to another priority queue.
4. insert a given element into a priority queue.
5. remove all the elements from a priority queue.
6. count the number of elements in a priority queue.
7. compare two priority queues.
8. retrieve the first element of the priority queue.
9. retrieve and remove the first element.
10. convert a priority queue to an array containing all of the elements of the queue
*/

import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;
public class PriorityQueueQuestions{
    public static void main(String[] args) {
        //1. create a new priority queue, add some colors (string) and print out the elements of the priority queue.
        PriorityQueue<String>queue=new PriorityQueue<>(); 
        queue.add("Red");queue.add("Yellow");queue.add("Brown");
        System.out.println("Add Priority queue : "+queue);

        //2. iterate through all elements in the priority queue.
        System.out.print("Iterate all elements : ");for(String a:queue)System.out.print(a+" ");System.out.println();
        Iterator<String>iterator=queue.iterator();
        System.out.print("Iterator using to print : ");
        while(iterator.hasNext())System.out.print(iterator.next()+" ");System.out.println();

        //3. add all the elements of a priority queue to another priority queue.
        PriorityQueue<String>another=new PriorityQueue<>();
        another.addAll(queue);
        System.out.println("Add all priority queue to another : "+queue+" => "+another);

        //4. insert a given element into a priority queue.
        queue.offer("green");
        System.out.println("add element offer : "+queue);

        //5. remove all the elements from a priority queue.
        queue.clear();
        System.out.println("Remove all Elements (clear): "+queue);

        //6. count the number of elements in a priority queue.
        PriorityQueue<Integer>intQueue=new PriorityQueue<>();
        intQueue.offer(19);intQueue.offer(2);intQueue.offer(30);intQueue.offer(55);intQueue.offer(55);intQueue.offer(1);
        System.out.println("Queue no elements : "+intQueue+" =>  "+intQueue.size());

        //7. compare two priority queues.
        PriorityQueue<Integer>q1=new PriorityQueue<>();
        q1.offer(19);q1.offer(2);q1.offer(30);q1.offer(55);q1.offer(1);q1.offer(1);
        System.out.println("compare two priority queues : "+q1+" & "+intQueue+" => "+equalsQueue(intQueue,q1));

        //8. retrieve the first element of the priority queue.
        System.out.println("retieve first element : "+intQueue.peek());

        //9. retrieve and remove the first element.
        System.out.println("Retrieve and remove first element : "+intQueue.poll());
        System.out.println(intQueue);

        //10. convert a priority queue to an array containing all of the elements of the queue
        Object arr[]=intQueue.toArray();
        System.out.println("priority queue to array : "+intQueue+" => "+Arrays.toString(arr));
    }
    static boolean equalsQueue(PriorityQueue q1,PriorityQueue q2){
        if(q1.size()!=q2.size())return false;
        if(q1==null&&q2==null)return true;
        else if(q1==null||q2==null)return false;
        else{
            Object arr1[]=q1.toArray();
            Object arr2[]=q2.toArray();
            return Arrays.equals(arr1,arr2);
        }
    }
}
