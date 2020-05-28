// An implementation of all methods and classes of  the List interface
import java.util.*;

 class List
 {
   public static  void main(String[] args) {

// ArrayList extends AbstarctList and implemnets the List interface
     //constructors of ArrayList
     ArrayList<String> a = new ArrayList<>();

     ArrayList<String> b = new ArrayList<>(16);  //default capacity of the list is 16

     ArrayList<String> c = new ArrayList<>(a);

// Linked List extends from AbstarctSequentialList and implemnets the list interface
// LinkedList has two constructors
      LinkedList<String> a = new LinkedList<>();
      LinkedList<String > b = new LinkedList<>(a);


    //ArrayList and LinkedList implemnet the same methods as they are the methods of List interface

    a.add("cse");
    a.add("ece");
    a.add("civil");
    //appends an object to the list

    System.out.println(a);

    System.out.println();

    int ind = a.indexOf("cse");
    System.out.println(ind);
    //returns the index of the object

    ind = a.lastIndexOf("ece");
    System.out.println(ind);

     System.out.println();

   String dn = a.get(0);
   System.out.println(dn);
   // returns the object at that index

    System.out.println();
     System.out.println();

   ListIterator<String> iterator = a.listIterator();
   while(iterator.hasNext())
   {
     System.out.println(iterator.next());
   }
   // iterates through the list in both directions


   a.remove(0);
    System.out.println(a);
     System.out.println();
     // deletes the object of the specified index

     a.remove("ece");
      System.out.println(a);
       System.out.println();

       // deletes the object mentioned
    }
 }
