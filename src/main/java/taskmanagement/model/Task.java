package taskmanagement.model;

public abstract class Task {
    private final String name;
    private String status;

    public Task(String name) {
        this.name = name;
        this.status = "Создана";
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
