import java.util.*;
public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet tree = new TreeSet();
        tree.add(12);
        tree.add(63);
        tree.add(34);
        tree.add(45);
        tree.add(11);
        tree.add(5);
        tree.add(4);
        tree.add(7);
        Iterator itr = tree.iterator();
        System.out.println("Tree set data: ");
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
