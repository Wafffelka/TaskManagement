package taskmanagement.factory;


import taskmanagement.model.Task;

public interface TaskFactory {
    Task createTask(String name);
}
