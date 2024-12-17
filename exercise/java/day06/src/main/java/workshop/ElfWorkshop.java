package workshop;

import java.util.ArrayList;
import java.util.List;

// TODO rename class to ChristmathTask
public class ElfWorkshop {
    private List<String> taskList;

    public ElfWorkshop() {
        this.taskList = new ArrayList<>();
    }

    public List<String> getTaskList() {
        // TODO Quentin : return a copy for defensive code
        return taskList;
    }

    public void addTask(String task) {
        if (isValid(task)) {
            taskList.add(task);
        }
    }

    // TODO please add javadoc or an explicit name for this method
    public String completeTask() {
        if (!taskList.isEmpty()) {
            return taskList.remove(0);
        }
        // TODO what do you think of having a test case for this return which will raise the coverage
        return null;
    }

    private static boolean isValid(String task) {
        return task != null && !task.isEmpty();
    }
}