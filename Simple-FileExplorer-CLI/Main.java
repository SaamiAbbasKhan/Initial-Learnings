import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        List<ProDrive> drives = new ArrayList<>(); // for storing hierarchical relation of folders

        // Creation of the parent folder
        ProDrive proDrive = new ProDrive("ParentDrive");
        System.out.println("Welcome to the CLI FileExplorer. In order to get started you can do (..instructions) or " +
                "if you want to know about facts, do (..facts).\n");
        System.out.println("You are here: " + proDrive.name + " > ");

        boolean shouldStop = false;

        while (!shouldStop) {
            // Checking for all the command line commands.
            System.out.print("->Enter the command!: ");
            String userInput = sc.nextLine();

            // checking if the text contains creation prompt (folders)
            if ((userInput.contains("generate") || userInput.contains("create")) && userInput.contains("folder")) {
                // If prompt contains 'generate' or 'create' and 'folder' -> will create a folder.
                System.out.print("-->What would you like to call your folder: ");
                String subFolderName = sc.nextLine();
                if (!startsWithInteger(subFolderName)) { // only adding if not starts with an integer value
                    proDrive.add(new ProDrive(subFolderName)); // adding of the folder
                    System.out.println("...Folder created...");
                }
                else {
                    System.out.println("--->Folder names cant start with an integer.");
                }
            }
            else if ((userInput.contains("generate") || userInput.contains("create")) && ((userInput.contains("text"))
                    || (userInput.contains("information")))) {
                System.out.print("-->Enter the information: ");
                String subText = sc.nextLine();
                proDrive.add(subText);
                System.out.println("...Text added...");
            }
            else if (userInput.contains("delete") && userInput.contains("folder")) {
                System.out.print("-->Folder name? ");
                String toDeleteFolderName = sc.nextLine();
                proDrive.delete(proDrive.findThroughFolderName(toDeleteFolderName));
                System.out.println("...Folder Deletion Successful...");
            }
            else if (userInput.contains("delete") && ((userInput.contains("text")) || userInput.contains("information"))) {
                System.out.print("-->What do you want to delete (text): ");
                String toDeleteFolderName = sc.nextLine();
                proDrive.delete(toDeleteFolderName);
                System.out.println("...Text Deletion Successful");
            }
            else if (userInput.contains("switch") || userInput.contains("go")) {
                // specify the name if folder is present in the directory or use index to navigate through the directory (hierarchical one)
                System.out.println("-->Specify the folder: ");

                String gotoIndex = sc.nextLine();
                System.out.println("....switching....");
                try { // if user typed numbers.
                    int index = Integer.parseInt(gotoIndex);
                    if (index < 0) {
                        try {
                            int currentIndex = getCurrentIndex(drives, proDrive);
                            var k = currentIndex - (Integer.parseInt(gotoIndex) * -1);
                            proDrive = drives.get(k);
                        }
                        catch (Exception ignored) { // if element inside of last one's
                            var j = drives.size() - (Integer.parseInt(gotoIndex) * -1);
                            proDrive = drives.get(j);

                        }
                    }
                    else { // if user types +ve index.
                        int pIndex = Integer.parseInt(gotoIndex);
                        try {
                            int currentIndex = getCurrentIndex(drives, proDrive);
                            var k = currentIndex + pIndex;
                            proDrive = drives.get(k);
                        }
                        catch (Exception ignored) { // if element inside of last one's
                            var j = drives.size() + pIndex;
                            proDrive = drives.get(j);

                        }
                    }
                }
                catch (NumberFormatException e) { // if user enters names.
                    if (checkIfPresent(proDrive.folderList, gotoIndex)) {
                        if (!drives.contains(proDrive)) {
                            drives.add(proDrive);
                            /* Only adding the current folder to the list if it's not already present.
                               If the parent folder has multiple subfolders, and you're switching between them,
                               the parent folder will only be added once to the list, avoiding duplicates. */
                        }
                        proDrive = switchInternal(proDrive.folderList, gotoIndex);
                    } else {
                        System.out.println("--->No such folder exists.");
                    }
                }

                // In the above try catch statement if user tries a non-numeric word it'll change the context/folder to
                // that but if they tried index (+ve and -ve) it'll do accordingly (with the help of drives)

            }
            else if (userInput.contains("view") && ((userInput.contains("info")) || userInput.contains("text"))) {
                // for viewing text if it contains any.
                proDrive.printSubTexts();
            }
            else if (userInput.contains("view") && userInput.contains("folder")) {
                proDrive.printSubFolders();
            }
            else if (userInput.contains("view") && userInput.contains("all")) {
                proDrive.viewAll();
            }
            else if ((userInput.contains("view") && userInput.contains("hierarchy")) || userInput.contains("drive")) {
                drives.forEach(s -> System.out.print(s.name + " > "));
                System.out.println();
            }
            else if (userInput.contains("sort") && userInput.contains("folder")) {
                proDrive.sortSub();
                System.out.println("...Sub-Folders sorted...");
            }
            else if (userInput.equalsIgnoreCase("exit")){
                shouldStop = true;
                System.out.println("Thank-you for using our program.");
            }
            else if (userInput.equals("..rules")) {
                System.out.println(new TextInformation().facts);
            }
            else if (userInput.equals("..instructions")) {
                System.out.println(new TextInformation().instructions);
            }

        }

    }

    public static int getCurrentIndex(List<ProDrive> list, ProDrive instance) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == instance) {
                return i;
            }
        }
        return -1;
    }

    public static boolean checkIfPresent(List<ProDrive> list, String name) {
        for (var i : list) {
            if (i.name.equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

    public static ProDrive switchInternal(List<ProDrive> list, String name) {
        for (var i : list) {
            if (i.name.equalsIgnoreCase(name)) {
                return i;
            }
        }
        return null;
    }

    public static boolean startsWithInteger(String text) {
        List<String> lst = new ArrayList<>(List.of("1", "2", "3", "4", "5", "6", "7", "8", "9", "0"));
        return lst.contains(text.split("")[0]); // contains first digit as number
    }

}
