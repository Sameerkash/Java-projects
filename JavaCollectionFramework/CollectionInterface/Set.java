import java.util.*;

class Set
{
  public static void main(String[] args) {

    // HashSet extends AbstractSet and implements the Set interface
    //  HashSet has four constructors

    HashSet <String> a = new HashSet<>();

     HashSet <String> b = new HashSet<>(a);

       HashSet <String> c = new HashSet<>(20);

         HashSet <String> d = new HashSet<>(25);


         // implemnets same methods as List but doesn't allow duplicate elements like the List interface

       a.add("B");
       a.add("A");
       a.add("C");
       a.add("D");
       a.add("E");

       System.out.println(a);

  }
}
