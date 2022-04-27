import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exercise17_02 {
    public static void main(String[] args) throws IOException {
        if(new File("C:\\Users\\Админ\\IdeaProjects\\Homework\\Week8\\src\\Exercise17_02.dat").isFile() == false){
            String content = "";
            Path path = Paths.get("C:\\Users\\Админ\\IdeaProjects\\Homework\\Week8\\src\\Exercise17_02.dat");
            Files.write(Paths.get("C:\\Users\\Админ\\IdeaProjects\\Homework\\Week8\\src\\Exercise17_02.dat"),content.getBytes(StandardCharsets.UTF_8));
        }
        File file = new File("C:\\Users\\Админ\\IdeaProjects\\Homework\\Week8\\src\\Exercise17_02.dat");
        PrintWriter printWriter = new PrintWriter(file);

        for(int i = 0; i <100; i++){
            printWriter.write((int) (Math.random() * 100) + " ");
        }
        printWriter.close();
    }
}
