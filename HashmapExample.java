import java.util.*;
class HashmapExample{
    public static void main(String[] args) {
        Map<Integer,Integer> mp = new HashMap<>();
        System.out.println("Ineserting the elements");
        mp.put(0,12);
        mp.put(1, 15);
        mp.put(2, 25);
        mp.put(3, 19);
        mp.put(4, 28);
        System.out.println(mp);
        System.out.println("Retrive the keys");
        Set<Integer> keys = mp.keySet();
        for(int key:keys){
            System.out.println(key);
        }
         System.out.println("Retrive the values");
        Collection<Integer> value = mp.values();
        for(int val:value){
            System.out.println(val);
        }
        System.out.println("retrive based on key");
        System.out.println(mp.get(1));
        System.out.println("remove the element");
        mp.remove(4);
        mp.remove(3, 19);
        System.out.println("chaeck weather the element there or not");
        System.out.println(mp.containsKey(4));
        System.out.println(mp.containsValue(19));
        System.out.println(mp.containsKey(2));
        System.out.println("updation");
        mp.putIfAbsent(3, 19);
        mp.replace(2,18);
        mp.put(1,20);
        System.out.println(mp);
        System.out.println("size of hash map");
        System.out.println(mp.size());
        System.out.println("entry set");
        Set<Map.Entry<Integer,Integer>> ent = mp.entrySet();
        for(Map.Entry<Integer,Integer> e : ent){
            System.out.println(e.getKey()+ ">>>>>>>>>>" +e.getValue());
        }
    }
}