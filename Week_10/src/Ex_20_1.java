import java.io.*;
import java.text.Collator;
import java.util.*;

public class Ex_20_1 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Admin\\IdeaProjects\\HW\\Week10\\src\\Text.txt");
        Scanner scanner = new Scanner(file);
        PriorityQueue<String> list = new PriorityQueue<>();
        String word = null;
        while(scanner.hasNext()){
            word = scanner.next();
            list.add(word);
        }



        while(list.isEmpty() == false){
            System.out.println(list.poll() + " ");
        }
    }
}
