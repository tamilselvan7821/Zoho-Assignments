/*
a. create a new tree set, add some colors (string) and print out the tree set.
b. iterate through all elements in a tree set.
c. add all the elements of a specified tree set to another tree set.
d. create a reverse order view of the elements contained in a given tree set.
e. get the first and last elements in a tree set.
f. clone a tree set list to another tree set.
g. get the number of elements in a tree set.
h. compare two tree sets.
i. Create a TreeSet that stores a set of numbers, find the numbers less than 7 in a tree set.
j. get the element in a tree set which is greater than or equal to the given element.
k. get the element in a tree set which is less than or equal to the given element.
l. get the element in a tree set which is strictly greater than or equal to the given element.
m. get an element in a tree set which is strictly less than the given element.
n. retrieve and remove the first element of a tree set.
o. retrieve and remove the last element of a tree set.
p. remove a given element from a tree set.
*/
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class TreeSetQuestions{
    public static void main(String[] args) {
        //a. create a new tree set, add some colors (string) and print out the tree set.
        TreeSet<String>tree=new TreeSet<>();
        tree.add("red");tree.add("blue");tree.add("green");tree.add("yellow");
        System.out.println("Add element in tree set : "+tree);

        //b. iterate through all elements in a tree set.
        System.out.print("Iterate Elements : ");for(String a:tree)System.out.print(a+" ");System.out.println();

        //c. add all the elements of a specified tree set to another tree set.
        TreeSet<String>copyTree=new TreeSet<>();
        copyTree.addAll(tree);
        System.out.println("copy to another tree set : "+copyTree);

        //d. create a reverse order view of the elements contained in a given tree set.
        Iterator <String>reversed=tree.descendingIterator();
        System.out.print("Decending order to view : ");while(reversed.hasNext())System.out.print(reversed.next()+" ");System.out.println();
        Set set=tree.descendingSet();
        System.out.println("Reversing order : "+set);

        //e. get the first and last elements in a tree set.
        System.out.println("Tree set First Element : "+tree.first());
        System.out.println("Tree set Last Element : "+tree.last());

        //f. clone a tree set list to another tree set.
        TreeSet<String>cloneSet=(TreeSet<String>)tree.clone();
        System.out.println("clone tree set : "+tree+" => "+cloneSet);

        //g. get the number of elements in a tree set.
        System.out.println("Treeset no Elements : "+tree.size());

        //h. compare two tree sets.
        System.out.println("Compare two tree sets : "+tree+" => "+cloneSet+" => "+tree.equals(cloneSet));

        //i. Create a TreeSet that stores a set of numbers, find the numbers less than 7 in a tree set.
        TreeSet<Integer>noSet=new TreeSet<>();
        noSet.add(34);noSet.add(3);noSet.add(1);noSet.add(2);noSet.add(19);noSet.add(6);//add Elements
        System.out.println("Less than 7 elements : "+noSet.subSet(0,7)); 

        //j. get the element in a tree set which is greater than or equal to the given element.
        System.out.println("Get element check greate than or equal (5) : "+noSet.ceiling(5));

        //k. get the element in a tree set which is less than or equal to the given element.
        System.out.println("Get element check less than or equal (5) : "+noSet.floor(5));

        //l. get the element in a tree set which is strictly greater than or equal to the given element.
        //higher method is no higher element return null
        System.out.println("Strictly higher element (5) : "+noSet.higher(5));

        //m. get an element in a tree set which is strictly less than the given element.
        System.out.println("Strictly lowest element (5) : "+noSet.lower(5));

        //n. retrieve and remove the first element of a tree set.
        System.out.println("Remove first element and retrieve : "+noSet.pollFirst());

        //o. retrieve and remove the last element of a tree set.
        System.out.println("Remove last element and retieve : "+noSet.pollLast());

        //p. remove a given element from a tree set.
        System.out.println("Remove the element in TreeSet : "+noSet+" => "+noSet.remove(6)+" "+noSet);

    }
}