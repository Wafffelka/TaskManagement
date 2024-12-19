package taskmanagement.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import taskmanagement.singleton.TaskManager;

@Configuration
public class TaskManagerConfig {
    @Bean
    public TaskManager taskManager() {
        return TaskManager.getInstance();
    }
}
