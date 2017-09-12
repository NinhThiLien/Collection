import java.util.*;
public class LinkHashSetDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<Integer,String>();
        lhm.put(104,"Hieu");
        lhm.put(101,"Luyen");
        lhm.put(102,"KA");
        lhm.put(103,"VA");
        for(Map.Entry m: lhm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        lhm.remove(103);
        System.out.println("After:" );
        for(Map.Entry m: lhm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }


        //-------------------------Test voi class Book
        Map<Integer,Book> map1 = new LinkedHashMap<Integer,Book>();
        //Creating Books
        Book b1 = new Book(100,"Ti va Quay","abc","fjs",8);
        Book b2 = new Book(200,"Conan","sasrd","ada",95);
        Book b3 = new Book(301, "doraemon",",nkojjb","jafjs",40);
        //Adding Book to map
        map1.put(2,b1);
        map1.put(4,b3);
        map1.put(3,b2);
        //traversing map
        for(Map.Entry<Integer,Book> entry : map1.entrySet()){
            int key = entry.getKey();
            Book b = entry.getValue();
            System.out.println(key+ "Details:");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}
