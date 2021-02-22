import java.util.LinkedList;

public class Main
{
    public static void main(String[] args)
    {
        //ArrayList ile aynı şekilde davranır ama algoritmaları farklıdır
        //Bir arama yapılırken LinkedList "o(n)"ken, arrayList "o(1)"dir.   Silme işleminde ise bu olay tam tersidir
        //Listede çok fazla eleman ekleyip sileceksek "LinkedList" daha mantıklı ama arama da "ArrayList"

        LinkedList linkedList = new LinkedList();
        linkedList.add("ali");
        linkedList.add("veli");
        linkedList.add(1,"murat");

        System.out.println(linkedList);  // yan yana array olarak yazar

        linkedList.forEach(i-> System.out.println(i));  //alt alta yazar
    }
}
