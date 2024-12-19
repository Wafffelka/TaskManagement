package taskmanagement;

import taskmanagement.factory.RegularTaskFactory;
import taskmanagement.factory.TaskFactory;
import taskmanagement.factory.UrgentTaskFactory;
import taskmanagement.model.Task;
import taskmanagement.observer.TaskEventListener;
import taskmanagement.singleton.TaskManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskManagementApplication {
    public static void main(String[] args) {
        SpringApplication.run(TaskManagementApplication.class, args);

        TaskManager taskManager = TaskManager.getInstance();
        TaskEventListener listener = new TaskEventListener();

        // Добавляем наблюдателя
        taskManager.addObserver(listener);

        // Создаем фабрики задач, сами задачи, затем добавляем их в менеджер
        TaskFactory urgentFactory = new UrgentTaskFactory();
        TaskFactory regularFactory = new RegularTaskFactory();

        Task urgentTask = urgentFactory.createTask("Срочная задача 1");
        Task regularTask = regularFactory.createTask("Обычная задача 1");

        taskManager.addTask(urgentTask);
        taskManager.addTask(regularTask);

        // Меняем статус задачи
        urgentTask.setStatus("Выполнена");
        taskManager.addTask(urgentTask);
    }
}
