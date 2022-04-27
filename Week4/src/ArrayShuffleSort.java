

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayShuffleSort {
    public static void main(String[] args){
        ArrayList<Integer> arraylist = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            arraylist.add((int)(Math.random() * 100));
        }
        System.out.println(arraylist);
        shuffle(arraylist);
        System.out.println(arraylist);
        sort(arraylist);
        System.out.println(arraylist);

    }
    public static void sort(ArrayList arraylist){
        for (int i = 0; i < arraylist.size(); i++) {
            for (int j = arraylist.size() - 1; j > i; j--) {
                int b = (int) arraylist.get(i);
                int c = (int) arraylist.get(j);
                if (b>c) {
                   swap(arraylist,i,j);
                }
            }
        }
    }
    public static void shuffle(ArrayList arrayList){
        for(int i = 0; i < arrayList.size(); i++){
            Random ran = new Random();
            int changeNumber = i + ran.nextInt(arrayList.size() - i);
            swap(arrayList,i,changeNumber);
        }
    }
    public static void swap(ArrayList arrayList, int i, int changeNumber){
        int stay = (int) arrayList.get(i);
        arrayList.set(i, arrayList.get(changeNumber));
        arrayList.set(changeNumber, stay);
    }
}
