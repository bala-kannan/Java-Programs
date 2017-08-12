import java.util.concurrent.*;

public class ThreadTest {
    static int n = 0;
    synchronized static void add() {
        n++;
        System.out.println(n);
    }
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(10);
        Runnable r = () -> add();
        for(int i = 0; i < 10; i++) {
            service.execute(r);
        }
        service.shutdown();
    }
}