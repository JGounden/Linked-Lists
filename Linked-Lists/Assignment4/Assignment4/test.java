
/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class test
{
    public static void main(String [] args)
    {
        System.out.print("\f");
        MyLinkedList<Integer> list1 = new MyLinkedList<>();
        MyLinkedList<Integer> list2 = new MyLinkedList<>();
        MyLinkedList<Integer> list3 = new MyLinkedList<>();
        
        list3 = list1.getUnique(list2);
        System.out.println("Both lists are empty: " + list3);
        
        list2.append(new Integer(3));
        list2.append(new Integer(2));
        list2.append(new Integer(7));
        list2.append(new Integer(1));

        list3 = list1.getUnique(list2);
        System.out.println("Calling list is empty: " + list3);

        list1.append(new Integer(1));
        list1.append(new Integer(4));
        list1.append(new Integer(2));
        list2.clear();

        list3 = list1.getUnique(list2);
        System.out.println("Parameter list is empty: " + list3);
        
        list2.append(new Integer(3));
        list2.append(new Integer(2));
        list2.append(new Integer(7));
        list2.append(new Integer(1));

        list3 = list1.getUnique(list2);
        System.out.println("Uniquely merged: " + list3);
    }
}
