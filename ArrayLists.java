import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists
{
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        //add element
        list.add(0);
        list.add(9);
        list.add(8);
        list.add(7);
        System.out.println(list);

        // to get an element
        int value=list.get(2);// 2 is the index
        System.out.println(value);

        //add element in between
        list.add(1,2);//here 3 is the index and 5 is the value
        System.out.println(list);

        //set element or replace
        list.set(2,0);
        System.out.println(list);

        //delete ele,ent
        list.remove(4);
        System.out.println(list);

        //size
        int size=list.size();
        System.out.println(size);

        //loops on list
        for (int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println("");

        //sorting
        list.set(2,4);
        Collections.sort(list);
        System.out.print(list);
    }
}