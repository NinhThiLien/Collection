import java.util.*;
public class Test {
    public static void main(String[] args) {
        /*LinkedHashSet<Book> hs = new LinkedHashSet<>();
        //Creating Books
        Book b1 = new Book(101, "Let us C", "Yashwat Kanetkar", "BPB", 8);
        Book b2 = new Book(102, "abc", "cde", "fgh", 2);
        Book b3 = new Book(103, "aas", "asda", "dgf", 3);
        // Addinh Books to hash table
        hs.add(b1);
        hs.add(b2);
        hs.add(b3);
        //Traversing hash table
        for(Book b:hs){
            System.out.println(b.id+" "+b.name+"\t"+b.author+"\t"+b.publisher+" "+b.quantity);
        }*/

        /*Deque<String> deque = new ArrayDeque<String>();
        deque.offer("arvind");
        deque.offer("vimal");
        deque.add("mukul");
        deque.offerFirst("jai");
        System.out.println("After offerFirst Traversal...");
        for (String s : deque) {
            System.out.println(s);
        }
        //deque.poll();
        //deque.pollFirst();//it is same as poll()
        deque.pollLast();
        System.out.println("After pollLast() Traversal...");
        for (String s : deque) {
            System.out.println(s);
        }*/



        /*//--generic
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(100,"Amit");
        map.put(101,"Vijay");
        map.put(102,"Rahul");
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        //--non-generic
        Map map1=new HashMap();
        //Adding elements to map
        map1.put(1,"Amit");
        map1.put(5,"Rahul");
        map1.put(2,"Jai");
        map1.put(6,"Amit");
        //Traversing Map
        Set set=map1.entrySet();//Converting to Set so that we can traverse
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            //Converting to Map.Entry so that we can get key and value separately
            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }*/

        HashSet<Book> set = new HashSet<Book>();
        Book b1 = new Book(100,"Ti va Quay","abc","fjs",8);
        Book b2 = new Book(200,"Conan","sasrd","ada",95);
        Book b3 = new Book(301, "doraemon",",nkojjb","jafjs",40);
        Book b4 = new Book(200,"Conan","sasrd","ada",95);
        set.add(b1);
        set.add(b2);
        set.add(b3);
        set.add(b4);
        //traversing elements
        Iterator<Book> itr = set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(set.size());
    }
}
