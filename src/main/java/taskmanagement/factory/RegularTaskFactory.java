package taskmanagement.factory;


import taskmanagement.model.Task;
import taskmanagement.model.RegularTask;

public class RegularTaskFactory implements TaskFactory {
    @Override
    public Task createTask(String name) {
        return new RegularTask(name);
    }
}
