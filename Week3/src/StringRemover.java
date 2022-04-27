import java.io.*;
import java.util.Scanner;

public class StringRemover {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Админ\\IdeaProjects\\Homework\\Week3\\StringRemover";
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        Scanner in = new Scanner(file);

        String result = "";
        while (in.hasNext()){
            String s = in.next();
            System.out.print(s + " ");
            result = result + s + " ";
        }
        in.close();
        fileReader.close();

        Scanner scan = new Scanner(System.in);

        System.out.print("\nWrite a word to remove: ");
        String remove = scan.next();
        System.out.println("\nAfter removing");

        result = result.replaceAll(remove, "");
        PrintWriter writer = new PrintWriter(new File(path));
        writer.append(result);
        writer.flush();

        in = new Scanner(file);
        fileReader = new FileReader(file);

        while (in.hasNext()){
            String s = in.next();
            System.out.print(s + " ");
        }
        in.close();
        fileReader.close();
    }
}
