import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ex_30_11 {
    public static void main(String[] args){
        Lock firstLock = new ReentrantLock(true);
        Lock secondLock = new ReentrantLock(true);
        new Thread(() ->{
            synchronized (firstLock) {
                firstLock.lock();
                System.out.println("Waiting second Lock");
                synchronized (secondLock){
                    System.out.println("firstLock is synchronized");
                }
            }

        }).start();
        new Thread(() ->{
            synchronized (secondLock) {
                firstLock.lock();
                System.out.println("Waiting first Lock");
                synchronized (firstLock){
                    System.out.println("secondLock is synchronized");
                }
            }


        }).start();

    }
}
