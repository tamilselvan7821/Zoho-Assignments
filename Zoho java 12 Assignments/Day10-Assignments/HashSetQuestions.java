/*
a. append the specified element to the end of a hash set.
b. iterate through all elements in a hash list.
c. get the number of elements in a hash set.
d. empty the hash set.
e. test a hash set is empty or not.
f. clone a hash set to another hash set.
g. convert a hash set to an array.
h. convert a hash set to a tree set.
i. convert a hash set to a List/ArrayList.
j. compare two hash set.
*/
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
public class HashSetQuestions{
    public static void main(String[] args) {
        HashSet<String>set=new HashSet<>();
        //a. append the specified element to the end of a hash set.
        set.add("apple");
        set.add("mango");
        System.out.println("Elements add : "+set);
        //b. iterate through all elements in a hash list.
        System.out.print("Iterate all elements : ");
        for(String element:set)System.out.print(element+" ");System.out.println();
        //c. get the number of elements in a hash set.
        System.out.println("No elements : "+set.size());
        //d. empty the hash set.
        set.clear();
        System.out.println("Empty the set : "+set);
        //e. test a hash set is empty or not.
        System.out.println("Empty check : "+set.isEmpty());
        //f. clone a hash set to another hash set.
        HashSet<String>setOld=new HashSet<>();setOld.add("1");setOld.add("2");
        //set=(HashSet<String>)setOld.clone();  use clone method
        set.addAll(setOld);
        System.out.println("Hash set clone old : "+setOld+"\t Copy set "+set);
        //g. convert a hash set to an array.
        Object arr[]=set.toArray();
        System.out.print("hashset to array : ");for(Object a:arr)System.out.print(a+" ");System.out.println();
        //h. convert a hash set to a tree set.
        TreeSet<String> tree=new TreeSet<>(set);
        System.out.println("Hash set to Treeset : "+tree);
        //i. convert a hash set to a List/ArrayList.
        ArrayList <String>list=new ArrayList<>(set);
        System.out.println("Hash set to Array list : "+list);
        //j. compare two hash set.
        System.out.println("Two sets compare : "+set+" "+setOld+" compare : "+set.equals(setOld));
    }
}