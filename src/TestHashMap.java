import java.time.temporal.ValueRange;
import java.util.*;
public class TestHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(103,"Lien");
        hm.put(101,"Hieu");
        hm.put(102,"VA");
        for(Map.Entry m: hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }

        HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(101,"abc");
        map.put(102,"def");
        map.put(103,"hde");
        System.out.println("Values before remove: "+map);
        map.remove(102);
        System.out.println("Values after remove: "+map);
    }
}
