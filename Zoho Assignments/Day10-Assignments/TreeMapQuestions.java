/*
1. associate the specified value with the specified key in a Tree Map.
2. copy a Tree Map content to another Tree Map.
3. search a key in a Tree Map.
4. search a value in a Tree Map.
5. get all keys from the given a Tree Map.
6. delete all elements from a given Tree Map.
7. sort keys in Tree Map by using comparator.
8. get a key-value mapping associated with the greatest key and the least key in a map.
9. get the first (lowest) key and the last (highest) key currently in a map.
10. get a reverse order view of the keys contained in a given map.
*/
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;
public class TreeMapQuestions{
    public static void main(String[] args) {
        //1. associate the specified value with the specified key in a Tree Map.
        TreeMap<Integer,String>tree=new TreeMap<>();
        tree.put(3,"Apple");
        tree.put(5,"Mango");
        tree.put(1,"apple");
        tree.put(2,"mango");
        System.out.println("Tree Map "+tree);

        //2. copy a Tree Map content to another Tree Map.
        TreeMap<Integer,String>copyMap=new TreeMap<>(tree);copyMap.putAll(tree);
        System.out.println("tree map copy to "+tree+" => "+copyMap);
        
        //3. search a key in a Tree Map.
        System.out.println("Search key (1) : "+tree.containsKey(1));

        //4. search a value in a Tree Map.
        System.out.println("search value (apple): "+tree.containsValue("apple"));

        //5. get all keys from the given a Tree Map.
        System.out.print("keys in tree map : ");
        for(int a:tree.keySet())System.out.print(a+" ");System.out.println();

        //6. delete all elements from a given Tree Map.
        copyMap.clear();
        System.out.println("Remove all elements tree map : "+copyMap);

        //7. sort keys in Tree Map by using comparator.
        System.out.println(tree);
        TreeMap<Students,String>compareTree=new TreeMap<>(new Students());
        compareTree.put(new Students(1),"tamil");
        compareTree.put(new Students(5),"arun");
        compareTree.put(new Students(2),"kumar");
        compareTree.put(new Students(199),"zeigen");
        System.out.println("compartor use tree map : "+compareTree);

        TreeMap<Integer,String>reverseMap=new TreeMap<>(Collections.reverseOrder());
        reverseMap.put(1,"tamil");reverseMap.put(45,"arun");reverseMap.put(2,"kumar");
        System.out.println("change reverse sort tree map : "+reverseMap);

        //8. get a key-value mapping associated with the greatest key and the least key in a map.
        System.out.println("Gratest key : "+tree.firstEntry());
        System.out.println("Least key : "+tree.lastEntry());

        //9. get the first (lowest) key and the last (highest) key currently in a map.
        System.out.println("First lowest key : "+tree.firstKey());
        System.out.println("last highest key : "+tree.lastKey());

        //10. get a reverse order view of the keys contained in a given map.
        System.out.print("Reverse order to view tree map : ");for(int a:tree.descendingKeySet())System.out.print(a+" ");System.out.println();

        //grater key and key value get else return null value
        System.out.println("ceiling key : "+tree.ceilingKey(4));
        System.out.println("ceiling key value : "+tree.ceilingEntry(4));
    }
}
class Students implements  Comparator<Students>{
    int rank;
    public Students(int rank) {
        this.rank=rank;
    }
    public Students() {
    }
    @Override
    public int compare(Students f1,Students s1){
        return Integer.compare(f1.rank,s1.rank);
    }
    @Override
    public String toString(){
        return rank+"";
    }
}