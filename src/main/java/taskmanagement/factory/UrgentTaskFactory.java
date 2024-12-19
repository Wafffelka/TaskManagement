package taskmanagement.factory;


import org.springframework.stereotype.Component;
import taskmanagement.model.Task;
import taskmanagement.model.UrgentTask;

@Component
public class UrgentTaskFactory implements TaskFactory {
    @Override
    public Task createTask(String name) {
        return new UrgentTask(name);
    }
}
