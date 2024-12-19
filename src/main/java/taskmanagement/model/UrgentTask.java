package taskmanagement.model;

public class UrgentTask extends Task {
    public UrgentTask(String name) {
        super(name);
        setStatus("Срочная");
    }
}
