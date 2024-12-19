package taskmanagement.singleton;

import taskmanagement.model.Task;
import taskmanagement.observer.TaskObserver;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class TaskManager {

    private static TaskManager instance;

    private final List<Task> tasks = new ArrayList<>();
    private final List<TaskObserver> observers = new ArrayList<>();

    private TaskManager() {}

    // Метод для получения Singleton экземпляра
    public static synchronized TaskManager getInstance() {
        if (instance == null) {
            instance = new TaskManager();
        }
        return instance;
    }

    // Добавить задачу
    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("Добавлена задача: " + task.getName());
        notifyObservers(task);
    }

    // Подписка на изменения
    public void addObserver(TaskObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(TaskObserver observer) {
        observers.remove(observer);
    }

    // Уведомления
    private void notifyObservers(Task task) {
        for (TaskObserver observer : observers) {
            observer.update(task);
        }
    }
}
