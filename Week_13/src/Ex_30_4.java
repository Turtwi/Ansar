import java.util.concurrent.Executor;

public class Ex_30_4 {
    private static Integer sumOfFirstThread = 0;
    private static Integer sumOfSecondThread = 0;
    public static void main(String[] args){
            String firstWord = "First: ";
            String secondWord = "Second: ";
            for(int i = 0; i < 1000; i++) {
                Thread firstThread = new Thread(){
                    public void run(){
                        synchronized (sumOfFirstThread){
                            sumOfFirstThread++;
                        }
                    }

                };
                firstThread.start();
            }
            for(int i = 0; i < 1000; i++) {
                Thread secondThread = new Thread(){
                    public void run(){
                        sumOfSecondThread++;
                    }

                };
                secondThread.start();
            }
            System.out.println(firstWord + sumOfFirstThread);
            System.out.println(secondWord + sumOfSecondThread);




    }
}


