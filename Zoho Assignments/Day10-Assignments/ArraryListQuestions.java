/*
a. to create a new array list, add some colors (string) and print out the collection.
b. to iterate through all elements in an array list.
c. to insert an element into the array list at the first position.
d. to retrieve an element (at a specified index) from a given array list.
e. to update specific array element by given element.
f. to remove the third element from an array list.
g. to search an element in an array list.
h. to sort a given array list.
i. to copy one array list into another.
j. to shuffle elements in an array list.
*/
import java.util.*;
public class ArraryListQuestions{
	public static void main(String [] args){
		//a. to create a new array list, add some colors (string) and print out the collection.
		ArrayList<String>colors=new ArrayList<>();
		colors.add("red");
		colors.add("pink");
		colors.add("green");
		colors.add("yellow");
		colors.add("green");
		//print normal method
		System.out.println("Colors : "+colors);

		System.out.print("print use for each method : ");
		for(String a:colors)System.out.print(a+" ");
		System.out.println();

		//b. to iterate through all elements in an array list.
		Iterator<String>iterator=colors.iterator();
		System.out.print("Colors print use iterator : ");
		while(iterator.hasNext()){
			String color=iterator.next();
			System.out.print(color+" ");
		}	
		System.out.println();
		//c. to insert an element into the array list at the first position.
		colors.add(0,"blue");
		System.out.println("Colors add first index (blue) : "+colors);
	
		//d. to retrieve an element (at a specified index) from a given array list.
		System.out.println("specified index 3 : "+colors.get(3));	

		//e. to update specific array element by given element.
		colors.set(0,"brown");	
		
		//f. to remove the third element from an array list.
		colors.remove(2);
		System.out.println("colors index based remove(index:2) : "+ colors);
		//g. to search an element in an array list.
		colors.remove("green");//first occurance remove
		System.out.println("colors object based remove : "+ colors);

		//h. to sort a given array list.
		Collections.sort(colors);
		System.out.println("Inbuilt sort method to sort acending order "+colors);
		colors.sort(Comparator.reverseOrder());
		System.out.println("Inbuilt sort method to sort decending order "+colors);

		//i. to copy one array list into another.
		//normal method
		ArrayList<String>normalCopy=new ArrayList<>(colors);
		System.out.println("Normal copy : "+normalCopy);
		//i. to copy one array list into another.
		ArrayList<String>addAllCopy=new ArrayList<>();
		addAllCopy.addAll(colors);
		System.out.println("Add all method copy : "+addAllCopy);
		//i. to copy one array list into another.
		ArrayList<String>cloneCopy=(ArrayList<String>)colors.clone();
		System.out.println("clone method copy : "+cloneCopy);
		List<String>copyMethod=Arrays.asList(new String[colors.size()]);
		Collections.copy(copyMethod,colors);
		System.out.println("collection copy method : "+copyMethod);

		//j. to shuffle elements in an array list.
		Collections.shuffle(colors);
		System.out.println("Shuffle list : "+colors);colors.remove("ta");
		System.out.println("remove : "+colors);
	}
}