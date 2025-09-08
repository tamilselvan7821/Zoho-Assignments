
import java.util.HashMap;
import java.util.Set;

/*
1. associate the specified value with the specified key in a HashMap.
2. count the number of key-value (size) mappings in a map.
3. copy all of the mappings from the specified map to another map.
4. remove all of the mappings from a map.
5. check whether a map contains key-value mappings (empty) or not.
6. get a shallow copy of a HashMap instance.
7. test if a map contains a mapping for the specified key.
8. test if a map contains a mapping for the specified value.
9. create a set view of the mappings contained in a map.
10. get the value of a specified key in a map
*/
public class HaskMapQuestions{
    public static void main(String[] args) {
        //1. associate the specified value with the specified key in a HashMap.
        HashMap<Integer,String> map=new HashMap();
        map.put(5,"apple");map.put(1,"grape");map.put(2,"Mango");map.put(543,"Orange");map.put(53,"lemon");
        System.out.println("map : "+map);

        //2. count the number of key-value (size) mappings in a map.
        System.out.println("No of key-values : "+map.size());

        //3. copy all of the mappings from the specified map to another map.
        HashMap<Integer,String> copyMap=new HashMap<>();
        copyMap.putAll(map);
        System.out.println("copy all elements one map to another map : "+map+" => "+copyMap);

        //4. remove all of the mappings from a map.
        copyMap.clear();
        System.out.println("Remove all mappings : "+copyMap);

        //5. check whether a map contains key-value mappings (empty) or not.
        System.out.print("check whether a map contains key-value : ");
        if(map.isEmpty())System.out.print("Map not contains key-values ");
        else System.out.print("Map contains key-values ");System.out.println();

        //6. get a shallow copy of a HashMap instance.
        HashMap<Integer,String>shallowCopy=(HashMap)map.clone();
        System.out.println("shallow copy of map : "+shallowCopy);

        //7. test if a map contains a mapping for the specified key.
        System.out.println("check specified key (2): "+map.containsKey(2));

        //8. test if a map contains a mapping for the specified value.
        System.out.println("check specified value (\"app\"): "+map.containsValue("app"));

        //9. create a set view of the mappings contained in a map.
        Set set=map.entrySet();
        System.out.println("set view of the mappings : "+set);

        //10. get the value of a specified key in a map
        System.out.println("get the value specied key (53) "+map.get(53));
    }
}