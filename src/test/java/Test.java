import java.time.LocalDateTime;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by h3ilang on 2017/3/8.
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {

        ScheduledExecutorService exec = Executors.newScheduledThreadPool(2);
        exec.scheduleWithFixedDelay(new TestRunable("aaa"),0,1,TimeUnit.SECONDS);
        exec.scheduleWithFixedDelay(new TestRunable("bbb"),0,1,TimeUnit.SECONDS);
        exec.scheduleWithFixedDelay(new TestRunable("ccc"),0,1,TimeUnit.SECONDS);

        TimeUnit.MINUTES.sleep(1L);
        exec.shutdown();
    }

    static class TestRunable implements Runnable {

        private String name;

        public TestRunable(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            try {
                TimeUnit.SECONDS.sleep(2L);
                LocalDateTime time = LocalDateTime.now();
                System.out.println(name + ":" + time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
