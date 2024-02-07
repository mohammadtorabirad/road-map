package ir.self.scheduler;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@EnableScheduling
public class AppTaskScheduler {

    @Scheduled(fixedRate = 1000)
    public void executedFirstTask(){
        System.out.println(Thread.currentThread().getName() + " First Task is running at time + " + new Date());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Scheduled(fixedRate = 2000)
    public void executeSecondTask(){
        System.out.println(Thread.currentThread().getName() + " Second Task running at time " + new Date());
    }

}
