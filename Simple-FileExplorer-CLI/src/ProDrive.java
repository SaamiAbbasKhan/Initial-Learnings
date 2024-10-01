import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProDrive implements Drive { // prodrive is actually the parent folder for everything
    public String name; // name of the folder.
    public List<ProDrive> folderList; // list of the sub-folders
    private final List<String> textList; // list of text files;

    public ProDrive(String name) {
        this.name = name;
        folderList = new ArrayList<>();
        textList = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        var creationDate = LocalDateTime.now().format(formatter);
        textList.add("(Metadata: " + creationDate + ")");
    }

    @Override
    public void add(String text) {
        textList.add(text);
    }

    @Override
    public void add(ProDrive folder) {
        folderList.add(folder);
    }

    @Override
    public void delete(String text) {
        textList.remove(find(text));
    }

    @Override
    public void delete(ProDrive folder) {
        try {
            folderList.remove(find(folder));
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid! You either are deleting the current folder or Folder does not exists in the " +
                    "working directory");
        }
    }

    @Override
    public void sortSub() {
        folderList.sort(Comparator.comparing(s -> s.name));
    }

    @Override
    public List<String> printSubFolders() {
        List<String> nameList = new ArrayList<>();
        for (var i : folderList) {
            nameList.add(i.name);
        }
        return nameList;
    }

    @Override
    public List<String> printSubTexts() {
        return textList;
    }

    @Override
    public void viewAll() {
        System.out.println("Current Folder: " + name);

        System.out.println(printSubFolders());
        System.out.println(printSubTexts());
    }


    // Helper methods

    public int find(Object a) {
        // Finds according to the text in the textList or finds as per the folder instance in folderList
        if (a instanceof String txt) {
            for (int i = 0; i < textList.size(); i++) {
                if (textList.get(i).contains(txt)) {
                    return i;
                }
            }
        }
        else if (a instanceof ProDrive d) { // removing via passing the Folder instance which is not what we want to do
            for (int i = 0; i < folderList.size(); i++) {
                if (folderList.get(i) == d) {
                    return i;
                }
            }
        }
        return -1;
    }

    public ProDrive findThroughFolderName(String name) {
        for (int i = 0; i < folderList.size(); i++) {
            if (folderList.get(i).name.equalsIgnoreCase(name)) {
                return folderList.get(i);
            }
        }
        return null;
    }
}
