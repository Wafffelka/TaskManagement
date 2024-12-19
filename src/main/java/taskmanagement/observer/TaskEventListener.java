package taskmanagement.observer;

import taskmanagement.model.Task;
import org.springframework.stereotype.Component;


@Component
public class TaskEventListener implements TaskObserver {

    @Override
    public void update(Task task) {
        System.out.println("Уведомление: задача изменилась -> " + task.getName() + " (Статус: " + task.getStatus() + ")");
    }
}
