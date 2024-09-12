import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // If even the priority of one single task would be wrong / mismatch i.e even capitalize
        // the program won't work.

        var taskManager = new TaskManager();

        // Make the while loop extended version see onenote
        Scanner sc = new Scanner(System.in);
        boolean shouldEnd = false;
        System.out.println("""
                Instructions/Format: For adding of tasks: {add(keyword) description status(incomplete) priority}
                                     For deleting of tasks: {description(task)}
                                     For sorting of tasks: {sort(task)}
                                     For printing of tasks: {display(task)}
                                     For ending the program: {end(task)}.
                
                """);
        while(!shouldEnd) {
            System.out.print("Enter a command: ");
            String userInput = sc.nextLine(); // user will input in this format: (add harry-potter incomplete low)
            String[] inputArray = userInput.split(" ");
            switch (inputArray[0].toLowerCase()) {
                case "add" -> taskManager.addTask(inputArray[1], inputArray[2], inputArray[3]);
                case "delete" -> taskManager.removeTask(inputArray[1]);
                case "sort" -> taskManager.sortTask();
                case "display" -> taskManager.printList();
                default -> shouldEnd = true;
            }
        }
    }
}

// Use enums for fixed data like priorities and stuff like that