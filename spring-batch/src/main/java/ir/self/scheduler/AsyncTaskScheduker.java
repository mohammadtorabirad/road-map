package ir.self.scheduler;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;
import java.util.Date;
import java.util.concurrent.ScheduledFuture;

@Component
@EnableScheduling
@RequiredArgsConstructor
public class AsyncTaskScheduker implements SchedulingConfigurer {

    private final TaskScheduler taskScheduler;

    private ScheduledFuture<?> job1;

    @Override
    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
        taskRegistrar.setTaskScheduler(this.taskScheduler);
        registerJob(taskScheduler);
    }

    private void registerJob(TaskScheduler taskScheduler) {
        job1 = taskScheduler.schedule(() -> {
                    System.out.println("Job1 is running " + new Date());
                    System.out.println();
                },
                triggerContext -> new CronTrigger("0 16 15 * * *").nextExecution(triggerContext)
        );

    }
}
