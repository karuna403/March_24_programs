import java.util.*;

class FirstOne {  
int id;  
String name,author,publisher;  
int quantity;  


public Book(int id, String name, String author, String publisher, int quantity) {  
    this.id = id;  
    this.name = name;  
    this.author = author;  
    this.publisher = publisher;  
    this.quantity = quantity;  
}  
}  
public class ListIteratorExample2 {  
public static void main(String[] args) {  
    
    //Creating list of Books  
    List<Book> list=new ArrayList<Book>();  
    //Creating Books  
    Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
    //Adding Books to list  
    list.add(b1);  
    list.add(b2);  
    list.add(b3);  
    //Traversing list  
    
    
    Scanner sc=new Scanner(System.in);
     int userid=sc.nextInt();
     System.out.println("total data is:\n");
    for(Book b:list){ 
    
    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
    }
    System.out.println("\n enter the id present in the data: \n");
    boolean isId=false;
     for(Book b:list){ 
        if(b.id==userid){
            
    System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity); 
    
    }  
}