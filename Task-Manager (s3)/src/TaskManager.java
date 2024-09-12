import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TaskManager {
    protected List<task> list = new ArrayList<>();

    static class TaskManagerComparator implements Comparator<task> {
        // in the comparator class we used a trick to sort everything basically we converted
        // high/medium and low words in numbers 1, 2, 3 and used the natural order to get that
        // firstly we got the index of the priority and then added one to the index and found the
        // value at the index then simple subtraction with the other --> resulting in sorted thing

        private List<Object> priorityArr = new ArrayList<>(List.of("high", 3, "medium", 2, "low", 1));

        @Override
        public int compare(task o1, task o2) {
            // Here
            return ((int) priorityArr.get(priorityArr.indexOf(o2.priority()) + 1) - (int) priorityArr.get(priorityArr.indexOf(o1.priority()) + 1));
        }
    }

    public void addTask(String... userTask) {
        if (userTask.length == 3) {
            list.add(new task(userTask[0], userTask[1], userTask[2]));
        } else {
            System.out.println("Invalid User Input");
        }

    }

    public void sortTask() {
        // sorting on the basis of priority
        try {
            list.sort(new TaskManagerComparator());
        } catch (ClassCastException e) {
            System.out.println("Invalid Priority (High/Medium/Low)");
        }
    }

    public void removeTask(String description) {
        var iter = list.listIterator();
        while (iter.hasNext()) {
            if (iter.next().description().equalsIgnoreCase(description)) {
                iter.remove();
            }
        }
    }

    public void printList() {
        System.out.println(list);
    }


}

