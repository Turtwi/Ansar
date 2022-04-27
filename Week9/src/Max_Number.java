import java.util.ArrayList;

public class Max_Number {
    public static <E extends Comparable<E>> E max(ArrayList<E> list){
        E max = list.get(list.size() - 1);
        for (int i =0;i< list.size() - 1;i++){
            if(max.compareTo(list.get(i)) < 0){
                max = list.get(i);
            }
        }
        
        return max;
    }
    public static void main(String[] args){
        ArrayList arrayList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            arrayList.add((int)(Math.random()*100));
        }
        System.out.println(arrayList);
        System.out.println(max(arrayList));
    }
}
