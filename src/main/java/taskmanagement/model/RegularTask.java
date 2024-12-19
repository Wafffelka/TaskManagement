package taskmanagement.model;

public class RegularTask extends Task {
    public RegularTask(String name) {
        super(name);
        setStatus("Обычная");
    }
}
