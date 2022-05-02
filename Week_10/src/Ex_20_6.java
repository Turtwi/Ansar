import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Ex_20_6 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 5000000; i++){
            list.add(i);
        }

        long iteratorStartTime = System.currentTimeMillis();
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()){
            iterator.next();
        }
        long iteratorEndTime = System.currentTimeMillis();

        System.out.println("Iterator time: " + (iteratorEndTime - iteratorStartTime));

        long linkedListStartTime = System.currentTimeMillis();
        LinkedList<Integer> linkedList = new LinkedList<>(list);
        int i = 0;
        while(linkedList.isEmpty() != false){
            linkedList.get(i);
            i++;
        }
        long linkedListEndTime = System.currentTimeMillis();

        System.out.println("LinkedList time: " + (linkedListEndTime - linkedListStartTime));

    }

}
