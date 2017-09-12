import java.util.*;
public class Book implements Comparable<Book> {
    int id;
    String name,author,publisher;
    int quantity;
    public Book(int id, String name, String author,String publisher,int quantity){
        this.id = id;
        this.name =name;
        this.author=author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
    public int compareTo(Book b){
        if(id>b.id){
            return 1;
        }else if(id<b.id){
            return -1;
        }else{
            return 0;
        }
    }
    public boolean equals(Object obj)
    {
        if(obj instanceof Book){
            if(((Book)obj).name.equals(this.name)){
                return true;
            }
        }
        return false;
    }

    public int hashCode(){
        return id;
    }
}
