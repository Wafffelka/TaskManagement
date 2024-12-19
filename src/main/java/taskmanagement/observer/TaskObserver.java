package taskmanagement.observer;


import org.springframework.scheduling.config.Task;

public interface TaskObserver {
    void update(Task task);
}
