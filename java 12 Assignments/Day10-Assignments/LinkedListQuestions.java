/*
a. append the specified element to the end of a linked list.
b. iterate through all elements in a linked list.
c. iterate through all elements in a linked list starting at the specified position.
d. iterate a linked list in reverse order.
e. insert the specified element at the specified position in the linked list.
f. insert elements into the linked list at the first and last position.
g. insert the specified element at the front of a linked list.
h. insert the specified element at the end of a linked list.
i. insert some elements at the specified position into a linked list.
j. get the first and last occurrence of the specified elements in a linked list
*/
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListQuestions{
	public static void main(String [] args){
		//a. append the specified element to the end of a linked list.
		LinkedList<Integer>list=new LinkedList<>();
		list.add(5);list.add(10);
		list.addLast(4);//add last position
		list.addFirst(500);//add first position
		System.out.println("List contains : "+list);

		//b. iterate through all elements in a linked list.
		for(int i=0;i<list.size();i++)System.out.print(list.get(i)+" ");System.out.println("");

		//c. iterate through all elements in a linked list starting at the specified position.
		int a=0;
		for(int i=a;i<list.size();i++)System.out.print(list.get(i)+" ");System.out.println("");

		//d. iterate a linked list in reverse order.
		Iterator temp=list.descendingIterator();
		System.out.print("Reverse order : ");
		while(temp.hasNext())System.out.print(temp.next()+" ");System.out.println("");

		//e. insert the specified element at the specified position in the linked list.
		list.set(0,100);
		System.out.println("insert specified position  (0,100): "+list);

		//f. insert elements into the linked list at the first and last position.
		list.offerFirst(70);
		System.out.println("insert of front of element (70): "+list);
		list.offerLast(1000);
		System.out.println("insert of last of element (1000): "+list);

		//g. insert the specified element at the front of a linked list.
		list.offer(200);
		System.out.println(list);

		//j. get the first and last occurrence of the specified elements in a linked list
		System.out.println("first occurance index (5)"+list.indexOf(5));
		//last occurance
		System.out.println("last occurance index (5)"+list.lastIndexOf(5));

		//i. insert some elements at the specified position into a linked list.
		list.addAll(3, list);
		System.out.println("add position (3) "+list);
		LinkedList<Integer>l1=new LinkedList<>();l1.add(1);l1.add(2);l1.add(3);
		LinkedList<Integer>l2=new LinkedList<>();l2.add(2);l2.add(3);l2.add(1);
		System.out.println(l1.equals(l2));
	}
}